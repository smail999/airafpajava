/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Objects;

/**
 *
 * @author Formation
 */
public class Users {
private int id ;
private String firstname ;
private String lastname ;
private String address ;
private String city ;
private String country;
private String tel ;
private String mail ;
private int function ;

    public Users(int id, String firstname, String lastname, String address, String city, String country, String tel, String mail, int function) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.country = country;
        this.tel = tel;
        this.mail = mail;
        this.function = function;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getTel() {
        return tel;
    }

    public String getMail() {
        return mail;
    }

    public int getFunction() {
        return function;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setFunction(int function) {
        this.function = function;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.firstname);
        hash = 53 * hash + Objects.hashCode(this.lastname);
        hash = 53 * hash + Objects.hashCode(this.address);
        hash = 53 * hash + Objects.hashCode(this.city);
        hash = 53 * hash + Objects.hashCode(this.country);
        hash = 53 * hash + Objects.hashCode(this.tel);
        hash = 53 * hash + Objects.hashCode(this.mail);
        hash = 53 * hash + this.function;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Users other = (Users) obj;
        return true;
    }

}
