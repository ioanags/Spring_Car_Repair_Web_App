package com.carshoprepair.carshop.forms;

import com.carshoprepair.carshop.domain.TypeEnum;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class RegisterForm {
    private static final String USERNAME_PATTERN = "^[a-zA-Z0-9]*$";

    private static final String PASSWORD_PATTERN = "^[a-zA-Z0-9@#$%^&]*$";

    private static final String MAIL_PATTERN = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{1,63}$";

    private static final int PASSWORD_MINSIZE = 6;

    @Pattern(regexp = USERNAME_PATTERN, message = "username.empty")
    private String firstname;

    @Pattern(regexp = USERNAME_PATTERN, message = "username.empty")
    private String lastname;

    @Pattern(regexp = PASSWORD_PATTERN, message = "Invalid Password")
    @Size(min = PASSWORD_MINSIZE, message = "Invalid Password Size")
    private String password;

    @Pattern(regexp = MAIL_PATTERN, message = "Invalid Mail")
    private String email;

    private String Afm;

    private String Address;

    private TypeEnum type;

    private Long person_id;


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getAfm() {
        return Afm;
    }

    public String getAddress() {
        return Address;
    }

    public TypeEnum getType() {
        return type;
    }

    public Long getPerson_id() {
        return person_id;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAfm(String afm) {
        Afm = afm;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public void setPerson_id(Long person_id) {
        this.person_id = person_id;
    }
}
