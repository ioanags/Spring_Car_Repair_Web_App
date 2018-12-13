//package com.carshoprepair.carshop;
//
//import com.example.demo.security.AccountLoginAuthenticationProvider;
//import com.example.demo.security.LoginSucessHandler;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private AccountLoginAuthenticationProvider accountLoginAuthenticationProvider;
//
//    @Autowired
//    private LoginSucessHandler loginSucessHandler;
//
//
//    @Override
//    protected void configure(final HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .formLogin()
//                .loginPage("/login")
//                .successHandler(loginSucessHandler)
//                .and()
//                .logout()
//                .logoutUrl("/logout")
//                .logoutSuccessUrl("/login")
//                .permitAll()
//                .and()
//                .authorizeRequests()
//                .antMatchers("/").permitAll()
//                .antMatchers("/login").anonymous()
//                .and()
//                .authenticationProvider(accountLoginAuthenticationProvider);
//        ;
//    }
//
//}
