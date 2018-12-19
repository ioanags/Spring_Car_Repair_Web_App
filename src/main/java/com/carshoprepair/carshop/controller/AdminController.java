package com.carshoprepair.carshop.controller;

import com.carshoprepair.carshop.controller.mappers.DeleteMapper;
import com.carshoprepair.carshop.controller.mappers.RegistrationFormToModelMapper;
import com.carshoprepair.carshop.controller.mappers.RepairFormToModelMapper;
import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.domain.Repair;
import com.carshoprepair.carshop.form.*;
import com.carshoprepair.carshop.models.PersonModel;
import com.carshoprepair.carshop.models.RepairModel;
import com.carshoprepair.carshop.repository.PersonJPARepository;
import com.carshoprepair.carshop.service.PersonServiceImpl;
import com.carshoprepair.carshop.service.RepairServiceImpl;
import com.carshoprepair.carshop.validators.RegisterValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

import static com.carshoprepair.carshop.utils.GlobalAttributes.ERROR_MESSAGE;

@Controller
public class AdminController {
    private static final String REGISTER_FORM = "registerForm";

    @Autowired
    private PersonServiceImpl personService;

    @Autowired
    private RepairServiceImpl repairService;

    @Autowired
    private DeleteMapper mapper;

    @Autowired
    private RegisterValidator registerValidator;

    @Autowired
    private RegistrationFormToModelMapper registerMapper;

    @Autowired
    private PersonJPARepository personJPARepository;


    @Autowired
    private RepairFormToModelMapper RepairMapper;

    @InitBinder(REGISTER_FORM)
    protected void initBinder(final WebDataBinder binder) {binder.addValidators(registerValidator); }



    @GetMapping("/admin")
    public String admin_home(Model model) {
            List<Repair> repair = repairService.recentRepairs();
            model.addAttribute("list",repair);

            //Get Users Lastname
           Authentication auth = SecurityContextHolder.getContext().getAuthentication();
           String name = auth.getName(); //get logged in username
           model.addAttribute("lastname",name);

            return "admin_home";

    }

    @GetMapping("/admin/users")
    public String admin_users(Model model){
        List<Person> person = personService.findAll();
        model.addAttribute("list",person);
        //Get Users Lastname
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        model.addAttribute("lastname",name);
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

        //Get Users Lastname
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        model.addAttribute("lastname",name);

        return "edit_user";
    }

    @PostMapping(value = "/admin/users/edit")
    public String updateUser(Model model, @ModelAttribute(name = "editForm") EditForm editForm, RedirectAttributes redirectAttributes) {
        personService.edit(editForm);
        return "redirect:/admin/users";
    }
    @GetMapping(value = "admin/repair_create")
    public String repair_create(Model model){
        model.addAttribute("repairForm",new RepairForm());

        //Get Users Lastname
        String name  = SecurityContextHolder.getContext()
                .getAuthentication().getName(); //get logged in username
        model.addAttribute("lastname",name);

        return "create_repair";
    }

    @PostMapping(value = "admin/repair_create")
    public String repair_create(Model model,
                                @Valid @ModelAttribute("repairForm")
                                 RepairForm repairForm ){

        //Get Users Lastname
        String name  = SecurityContextHolder.getContext()
                .getAuthentication().getName(); //get logged in username
        RepairModel repairModel = RepairMapper.mapToRepairModel(repairForm);
        repairService.create(repairModel);
        model.addAttribute("lastname", name);

        return "redirect:/admin";

    }


    @GetMapping(value = "/admin/register")
    public String register(Model model) {
        model.addAttribute(REGISTER_FORM,
                new RegisterForm());
        //Get Users Lastname
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        model.addAttribute("lastname",name);
        return "create_user";
    }

    @PostMapping(value = "/admin/register")
    public String register(Model model,
                           @Valid @ModelAttribute(REGISTER_FORM)
                                   RegisterForm registerForm,
                           BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "create_user";
        }
        PersonModel personModel = registerMapper.mapToPersonModel(registerForm);
        personService.create(personModel);
        return "redirect:/admin/users";
    }
    @GetMapping ("/admin/edit_repair/{id}")
    public String editRepair(@PathVariable("id") long id,Model model){
        Repair repair = repairService.findRepairById(id);
        model.addAttribute("cost",repair.getCost());
        model.addAttribute("kind",repair.getKind());
        model.addAttribute("date",repair.getDate());
        model.addAttribute("status",repair.getStatus());
        model.addAttribute("description",repair.getDescription());
        model.addAttribute("personId",repair.getPerson());
        model.addAttribute("repairId",repair.getId());

        //Get Users Lastname
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        model.addAttribute("lastname",name);

        return "edit_repair";
    }

    @PostMapping(value = "/admin/repairs/edit")
    public String updateRepairs(Model model, @ModelAttribute(name = "repairForm") EditRepairForm editRepairForm, RedirectAttributes redirectAttributes) {
       repairService.editRepair(editRepairForm);
        //Get Users Lastname
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        model.addAttribute("lastname",name);
        return "redirect:/admin";
    }

    @GetMapping(value = "/admin/my_repairs")
    public String myRepairs(Model model){

        //Get Users Lastname
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        model.addAttribute("lastname",name);

        Person person = personJPARepository.findPersonByLastName(name);
        List<Repair> repairs = person.getRepairs();


        model.addAttribute("list", repairs);

        return "admin_myrepairs";
    }




}
