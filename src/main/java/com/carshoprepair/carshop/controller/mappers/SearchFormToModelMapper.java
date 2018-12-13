package com.carshoprepair.carshop.controller.mappers;

import com.carshoprepair.carshop.form.SearchForm;
import com.carshoprepair.carshop.models.PersonModel;
import org.springframework.stereotype.Component;

@Component
public class SearchFormToModelMapper {
    public PersonModel mapSearchToPersonModel(SearchForm searchForm){
        PersonModel personModel = new PersonModel();
        personModel.setEmail(searchForm.getEmail());
        personModel.setAfm(searchForm.getAfm());
        return personModel;
    }
}
