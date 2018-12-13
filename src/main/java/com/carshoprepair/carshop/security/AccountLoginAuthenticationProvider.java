//package com.carshoprepair.carshop.security;
//
//import com.carshoprepair.carshop.models.LoginResponse;
//import com.carshoprepair.carshop.service.AuthenticationService;
//
//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationProvider;
//
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AccountLoginAuthenticationProvider implements AuthenticationProvider {
//
//    @Autowired
//    private AuthenticationService authenticationService;
//
//    public UsernamePasswordAuthenticationToken authenticate(Authentication authentication) {
//        LoginResponse loginResponse = authenticateUser(authentication);
//        return new UsernamePasswordAuthenticationToken(loginResponse.getEmail(), loginResponse.getPassword(), loginResponse.getType());
//    }
//
//    @Override
//    public org.springframework.security.core.Authentication authenticate(org.springframework.security.core.Authentication authentication) throws AuthenticationException {
//        return null;
//    }
//
//    public boolean supports(Class<?> authentication) {
//        return authentication.equals(UsernamePasswordAuthenticationToken.class);
//    }
//
//    private LoginResponse authenticateUser(Authentication authentication) {
//        String email = authentication.getEmail();
//        String password = (String) authentication.getPassword();
//        return authenticationService.login(email, password);
//    }
//
//
//}
