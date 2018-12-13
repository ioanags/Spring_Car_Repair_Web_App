//package com.carshoprepair.carshop.service;
//
//import com.carshoprepair.carshop.models.LoginResponse;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.stereotype.Service;
//
//import java.util.Collections;
//
//@Service
//public class AuthenticationServiceImpl implements AuthenticationService {
//
//    @Override
//    public LoginResponse login(String email, String password) {
//        return new LoginResponse(email, password, Collections.singletonList(new SimpleGrantedAuthority("ADMIN")));
//    }
//
//    @Override
//    public void logout(String email, String password) {
//        return;
//    }
//}
