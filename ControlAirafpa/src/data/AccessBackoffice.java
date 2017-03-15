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
public class AccessBackoffice {
   private int usersid ;
   private String nickname ;
   private String password ;

    public AccessBackoffice(int usersid, String nickname, String password) {
        this.usersid = usersid;
        this.nickname = nickname;
        this.password = password;
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
   
}
