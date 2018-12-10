package com.carshoprepair.carshop.domain;



public enum TypeEnum {
    DEFAULT("User"),
    ADMIN("Admin"),
    USER("User");


    private String type;

    TypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

