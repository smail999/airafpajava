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
   private Long users_id ;
   private String nickname ;
   private String password ;

    public AccessBackoffice(Long usersid, String nickname, String password) {
        this.users_id = usersid;
        this.nickname = nickname;
        this.password = password;
    }
    public AccessBackoffice () {
        
    }

    public Long getUsersid() {
        return users_id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setUsersid(Long usersid) {
        this.users_id = usersid;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AccessBackoffice{" + "usersid=" + users_id + ", nickname=" + nickname + ", password=" + password + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.users_id);
        hash = 29 * hash + Objects.hashCode(this.nickname);
        hash = 29 * hash + Objects.hashCode(this.password);
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
