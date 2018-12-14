package com.carshoprepair.carshop.controller;

import com.carshoprepair.carshop.controller.mappers.SearchFormToModelMapper;
import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.form.SearchForm;
import com.carshoprepair.carshop.models.PersonModel;
import com.carshoprepair.carshop.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

import static com.carshoprepair.carshop.utils.GlobalAttributes.ERROR_MESSAGE;
@Controller
public class SearchController {
    @Autowired
    private SearchFormToModelMapper searchFormToModelMapper;
    @Autowired
    private PersonServiceImpl personService;


    @GetMapping("/search")

    public String search(Model model, @Valid @ModelAttribute("searchForm") SearchForm searchForm) {
//        if (bindingResult.hasErrors()) {
//            //have some error handling here, perhaps add extra error messages to the model
//            model.addAttribute(ERROR_MESSAGE, "an error occurred");
//            return "";
//        }

        PersonModel searchModel = searchFormToModelMapper.mapSearchToPersonModel(searchForm);
        List<Person> person = personService.searchByAfmOrEmail(searchModel.getAfm(), searchModel.getEmail());
        model.addAttribute("list",person);
        return "search";

    }
}
