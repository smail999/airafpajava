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
public class AccessBackoffice {
   private int usersid ;
   private String nickname ;
   private String password ;

    public AccessBackoffice(int usersid, String nickname, String password) {
        this.usersid = usersid;
        this.nickname = nickname;
        this.password = password;
    }
    public AccessBackoffice () {
        
    }

    public int getUsersid() {
        return usersid;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setUsersid(int usersid) {
        this.usersid = usersid;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AccessBackoffice{" + "usersid=" + usersid + ", nickname=" + nickname + ", password=" + password + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.usersid;
        hash = 59 * hash + Objects.hashCode(this.nickname);
        hash = 59 * hash + Objects.hashCode(this.password);
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
        final AccessBackoffice other = (AccessBackoffice) obj;
        return true;
    }
   
}
