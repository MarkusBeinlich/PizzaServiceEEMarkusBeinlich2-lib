/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.beinlich.markus.pizzaservice.model;

import java.io.Serializable;

/**
 *
 * @author schulung
 */
public class Customer1 implements Serializable{

    private static final long serialVersionUID = 6041779523439137448L;
    private String email;
    private String password;

    public Customer1() {
    }

    
    
    public Customer1(String email, String password) {
        this.email = email;
        this.password = password;
    }

    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
