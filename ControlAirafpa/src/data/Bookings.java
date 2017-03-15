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
public class Bookings {
    private int id ;
    private int userid ; 
    private int flightid ;
    private int place ;

    public Bookings(int id, int userid, int flightid, int place) {
        this.id = id;
        this.userid = userid;
        this.flightid = flightid;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public int getUserid() {
        return userid;
    }

    public int getFlightid() {
        return flightid;
    }

    public int getPlace() {
        return place;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setFlightid(int flightid) {
        this.flightid = flightid;
    }

    public void setPlace(int place) {
        this.place = place;
    }
    
    
}
