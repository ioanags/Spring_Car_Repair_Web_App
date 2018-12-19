package com.carshoprepair.carshop.controller;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.form.SearchForm;
import com.carshoprepair.carshop.models.PersonModel;
import com.carshoprepair.carshop.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private PersonServiceImpl personService;


    @GetMapping("/search")

    public String search(Model model,@ModelAttribute("searchForm") SearchForm searchForm) {

        List<PersonModel> person = searchUsers(searchForm);
        //personService.searchByAfmAndEmail(searchModel.getAfm(), searchModel.getEmail());
        model.addAttribute("persons",person);

        //Get Users Lastname
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        model.addAttribute("lastname",name);

        return "search";
    }
        private List<PersonModel> searchUsers(SearchForm searchForm) {
        Long afm = searchForm.getAfm();
        String email = searchForm.getEmail();

        List<PersonModel> users = new ArrayList<>();
        if (!email.isEmpty() && afm!=null) {
            users = personService.searchByAfmAndEmail(afm,email);
        } else if (!email.isEmpty()) {
            users = personService.searchByEmail(email);
           searchForm.setAfm(0L);
        } else if (afm!=null) {
            users = personService.searchByAfm(afm);
        }
        return users;
    }


}
