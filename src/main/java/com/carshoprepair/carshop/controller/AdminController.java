package com.carshoprepair.carshop.controller;

import com.carshoprepair.carshop.controller.mappers.DeleteMapper;
import com.carshoprepair.carshop.controller.mappers.EditFormToModelMapper;
import com.carshoprepair.carshop.controller.mappers.SearchFormToModelMapper;
import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;
import com.carshoprepair.carshop.form.DeleteForm;
import com.carshoprepair.carshop.form.EditForm;
import com.carshoprepair.carshop.form.RegisterForm;
import com.carshoprepair.carshop.form.SearchForm;
import com.carshoprepair.carshop.models.PersonModel;
import com.carshoprepair.carshop.models.RepairModel;
import com.carshoprepair.carshop.service.PersonServiceImpl;
import com.carshoprepair.carshop.service.RepairServiceImpl;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

import static com.carshoprepair.carshop.utils.GlobalAttributes.ERROR_MESSAGE;

@Controller
public class AdminController {
    @Autowired
    private PersonServiceImpl personService;

    @Autowired
    private RepairServiceImpl repairService;

    @Autowired
    private DeleteMapper mapper;

    @Autowired
    private EditFormToModelMapper editFormToModelMapper;


    @GetMapping("/admin")
    public String admin_home(Model model) {
            List<Repair> repair = repairService.recentRepairs();
            model.addAttribute("list",repair);


            return "admin_home";

    }

    @GetMapping("/admin/users")
    public String admin_users(Model model){
        List<Person> person = personService.findAll();
        model.addAttribute("list",person);
        return "admin_user_list";
    }

    @GetMapping("/admin/delete_user")
    public String admin_delete_user(Model model,
                               DeleteForm deleteForm){
        List<Person> person = personService.findAll();
        model.addAttribute("list",person);
        PersonModel personModel = mapper.Person_deleteModel(deleteForm);
        personService.delete(personModel.getId());

        return "redirect:/admin/users";

    }

    @GetMapping("/admin/delete_repair")
    public String admin_delete_repair(Model model,
                                      DeleteForm deleteForm){
        List<Repair> repair = repairService.recentRepairs();
        model.addAttribute("list",repair);
        RepairModel repairModel = mapper.Repair_deleteModel(deleteForm);
        repairService.delete(repairModel.getId());

        return "redirect:/admin";

    }

    @GetMapping ("/admin/edit_user/{id}")
    public String edit(@PathVariable("id") long id,Model model){
        Person person = personService.findPersonById(id);
        model.addAttribute("id",person.getId());
        model.addAttribute("name",person.getFirstName());
        model.addAttribute("lastName",person.getLastName());
        model.addAttribute("email",person.getEmail());
        model.addAttribute("password",person.getPassword());
        model.addAttribute("address",person.getAddress());
        model.addAttribute("afm",person.getAfm());
        model.addAttribute("carModel",person.getCarModel());
        model.addAttribute("plate",person.getPlate());
        model.addAttribute("type",person.getType());

        return "edit_user";
    }

    @PostMapping(value = "/admin/users/edit")
    public String updateBook(Model model, @ModelAttribute(name = "editForm") EditForm editForm, RedirectAttributes redirectAttributes) {
        personService.edit(editForm);
        return "redirect:/admin/users";
    }





}
