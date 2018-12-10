package com.carshoprepair.carshop.domain;



public enum TypeEnum {
    Default("User"),
    Admin("Admin"),
    User("User");


    private String type;

    TypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

