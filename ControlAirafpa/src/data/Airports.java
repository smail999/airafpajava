/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Formation
 */
public class Airports {
     private String aita ;
    private String city ; 
    private String pays ;

    public Airports(String aita, String city, String pays) {
        this.aita = aita;
        this.city = city;
        this.pays = pays;
    }

    public String getAita() {
        return aita;
    }

    public String getCity() {
        return city;
    }

    public String getPays() {
        return pays;
    }

    public void setAita(String aita) {
        this.aita = aita;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
    
    
}
