package com.carshoprepair.carshop.service;

import com.carshoprepair.carshop.domain.Person;
import com.carshoprepair.carshop.models.LoginResponse;
import com.carshoprepair.carshop.repository.PersonJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    PersonJPARepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String lastname) throws UsernameNotFoundException {
        // here we would search into the repo for the user.
        // for not we are just going to send always a successful response.
        Person user = userRepository.findPersonByLastName(lastname);
        System.out.println(user.getLastName()+" "+user.getFirstName());

/*        List<SimpleGrantedAuthority> authorization = Collections.singletonList(new SimpleGrantedAuthority("ADMIN"));
        CharSequence password = "password";*/

        return new LoginResponse(user.getLastName(), user.getPassword(), Arrays.asList(new SimpleGrantedAuthority(user.getType().name())));


    }
}
