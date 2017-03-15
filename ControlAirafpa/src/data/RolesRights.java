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
public class RolesRights {
 private int userid;
 private boolean admin ;
 private boolean blocked ;

    public RolesRights(int userid, boolean admin, boolean blocked) {
        this.userid = userid;
        this.admin = admin;
        this.blocked = blocked;
    }

    public int getUserid() {
        return userid;
    }

    public boolean isAdmin() {
        return admin;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
 
}
