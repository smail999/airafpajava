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
public class Airports {
     private String aita ;
    private String city ; 
    private String country ;

    public Airports(String aita, String city, String country) {
        this.aita = aita;
        this.city = city;
        this.country = country;
    }
    public Airports (){
        
    } 

    public String getAita() {
        return aita;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setAita(String aita) {
        this.aita = aita;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.aita);
        hash = 79 * hash + Objects.hashCode(this.city);
        hash = 79 * hash + Objects.hashCode(this.country);
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
        final Airports other = (Airports) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Airports{" + "aita=" + aita + ", city=" + city + ", country=" + country + '}';
    }
    
    
}
