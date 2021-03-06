package com.carshoprepair.carshop.controller;


import com.carshoprepair.carshop.form.SearchForm;
import com.carshoprepair.carshop.form.SearchRepairForm;
import com.carshoprepair.carshop.models.PersonModel;
import com.carshoprepair.carshop.models.RepairModel;
import com.carshoprepair.carshop.service.PersonServiceImpl;
import com.carshoprepair.carshop.service.RepairServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private PersonServiceImpl personService;
    @Autowired
    private RepairServiceImpl repairService;


    @GetMapping("/search")

    public String search(Model model,@ModelAttribute("searchForm") SearchForm searchForm) {

        List<PersonModel> person = searchUsers(searchForm);
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
    @GetMapping("/search/repair")
    private String searchRepair(Model model){
        model.addAttribute("searchRepairForm",new SearchRepairForm());

        //Get Users Lastname
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        model.addAttribute("lastname",name);

        return "search_repair_form";
    }

    @GetMapping("/search/repair/results")
    public String searchResults(Model model, @ModelAttribute("searchRepairForm") SearchRepairForm searchRepairForm){
        List<RepairModel> repair = searchRepairResults(searchRepairForm);
        model.addAttribute("repairs",repair);

        //Get Users Lastname
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        model.addAttribute("lastname",name);

        return "search_repair_results";
    }

    private List<RepairModel> searchRepairResults(SearchRepairForm searchRepairForm) {
        Long afm = searchRepairForm.getAfm();
        LocalDateTime date = searchRepairForm.getDate();
        String plate = searchRepairForm.getPlate();


        List<RepairModel> repairs = new ArrayList<>();

        if (afm != null && date == null && plate.isEmpty()) {
            repairs = repairService.searchRepairByAfm(afm);

        }else if (!plate.isEmpty() && afm == null && date == null) {
           repairs = repairService.searchRepairByPlate(plate);

        } else if (date != null && afm == null && plate.isEmpty()) {
             repairs = repairService.searchRepairByDate(date);

       }
    return repairs;
    }



    }



