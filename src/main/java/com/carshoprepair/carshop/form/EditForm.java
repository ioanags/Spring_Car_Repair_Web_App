package com.carshoprepair.carshop.form;

import com.carshoprepair.carshop.domain.TypeEnum;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EditForm {
    private static final String USERNAME_PATTERN = "^[a-zA-Z0-9]*$";

    private static final String PASSWORD_PATTERN = "^[a-zA-Z0-9@#$%^&]*$";

    private static final String MAIL_PATTERN = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{1,63}$";

    private static final int PASSWORD_MINSIZE = 6;

    private long Afm;
    private String carModel;
    private String plate;
    private TypeEnum type;
    private String Address;
    private String id;

    @Pattern(regexp = USERNAME_PATTERN, message = "firstname.empty")
    private String firstName;
    @Pattern(regexp = USERNAME_PATTERN, message = "lastname.empty")
    private String lastName;
    @Pattern(regexp = PASSWORD_PATTERN, message = "Invalid Password")
    @Size(min = PASSWORD_MINSIZE, message = "Invalid Password Size")
    private String password;

    @Pattern(regexp = MAIL_PATTERN, message = "Invalid Mail")
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getAfm() {
        return Afm;
    }

    public void setAfm(long afm) {
        Afm = afm;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
