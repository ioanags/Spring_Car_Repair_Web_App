package com.carshoprepair.carshop.models;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class LoginResponse extends User {

    public LoginResponse(String lastname, String password, Collection<? extends GrantedAuthority> authorities) {
        super(lastname, password, authorities);
    }
}


