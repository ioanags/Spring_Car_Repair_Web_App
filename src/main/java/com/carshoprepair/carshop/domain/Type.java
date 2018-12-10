package com.carshoprepair.carshop.domain;

public enum Type {
 ADMIN("Admin"),
 USER("User");

    private String userType;

    Type(String userType) {
        this.userType = userType;
    }

    public String getUserType() {
        return userType;
    }
}
