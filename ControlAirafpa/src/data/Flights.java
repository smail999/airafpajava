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
public class Flights {
private int id ;
private String departingaita;
private String arrivalaita;
private int duration ;
private double price ;
private int pilote ;
private int copilote ;
private int staff1;
private int staff2;
private int staff3;

    public Flights(int id, String departingaita, String arrivalaita, int duration, double price, int pilote, int copilote, int staff1, int staff2, int staff3) {
        this.id = id;
        this.departingaita = departingaita;
        this.arrivalaita = arrivalaita;
        this.duration = duration;
        this.price = price;
        this.pilote = pilote;
        this.copilote = copilote;
        this.staff1 = staff1;
        this.staff2 = staff2;
        this.staff3 = staff3;
    }

    public int getId() {
        return id;
    }

    public String getDepartingaita() {
        return departingaita;
    }

    public String getArrivalaita() {
        return arrivalaita;
    }

    public int getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    public int getPilote() {
        return pilote;
    }

    public int getCopilote() {
        return copilote;
    }

    public int getStaff1() {
        return staff1;
    }

    public int getStaff2() {
        return staff2;
    }

    public int getStaff3() {
        return staff3;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartingaita(String departingaita) {
        this.departingaita = departingaita;
    }

    public void setArrivalaita(String arrivalaita) {
        this.arrivalaita = arrivalaita;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPilote(int pilote) {
        this.pilote = pilote;
    }

    public void setCopilote(int copilote) {
        this.copilote = copilote;
    }

    public void setStaff1(int staff1) {
        this.staff1 = staff1;
    }

    public void setStaff2(int staff2) {
        this.staff2 = staff2;
    }

    public void setStaff3(int staff3) {
        this.staff3 = staff3;
    }
        
  
}
