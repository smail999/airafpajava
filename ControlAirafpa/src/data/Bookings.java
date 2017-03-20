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
    private long id ;
    private long user_id ; 
    private long flight_id ;
    private int place ;

    public Bookings(long id, long user_id, long flight_id, int place) {
        this.id = id;
        this.user_id = user_id;
        this.flight_id = flight_id;
        this.place = place;
    }
    public Bookings () {
        
    }

    public long getId() {
        return id;
    }

    public long getUser_id() {
        return user_id;
    }

    public long getFlight_id() {
        return flight_id;
    }

    public int getPlace() {
        return place;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUser_id(long userid) {
        this.user_id = userid;
    }

    public void setFlight_id(long flightid) {
        this.flight_id = flightid;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 61 * hash + (int) (this.user_id ^ (this.user_id >>> 32));
        hash = 61 * hash + (int) (this.flight_id ^ (this.flight_id >>> 32));
        hash = 61 * hash + this.place;
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
        final Bookings other = (Bookings) obj;
        return true;
    }

   

    

    @Override
    public String toString() {
        return "Bookings{" + "id=" + id + ", userid=" + user_id + ", flightid=" + flight_id + ", place=" + place + '}';
    }
    
    
}
