/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.io.Serializable;

/**
 *
 * @author andrew
 */
public class User implements Serializable {
    private String firstName;
    private String email;
    private String phone;
    private String program;
    private String year;

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhone() {
        return phone;
    }

    public String getProgram() {
        return program;
    }

    public String getYear() {
        return year;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    

    public User(String firstName, String email, String phone, String program, String year) {
        this.firstName = firstName;
        this.email = email;
        this.phone = phone;
        this.program = program;
        this.year = year;
    }
}
