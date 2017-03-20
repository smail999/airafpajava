/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import data.AccessBackoffice;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccessBackofficeDAO extends DAO<AccessBackoffice, Long> {

    public AccessBackofficeDAO() {
        super();
    }

    @Override
    public AccessBackoffice create(AccessBackoffice abo) {
        AccessBackoffice accesback = new AccessBackoffice();
         if (this.bddmanager.connect()) {
        try {

            
            PreparedStatement creatabdao = this.bddmanager.getConnection().prepareStatement("insert into access_backoffice values(?,?,?)");

            creatabdao.setLong(1, abo.getUsersid());
            creatabdao.setString(2, abo.getNickname());
            creatabdao.setString(3, abo.getPassword());
            creatabdao.executeUpdate();
            accesback = this.find(abo.getUsersid());
           
            
            
            abo = this.find(abo.getUsersid());

        } catch (SQLException ex) {
            ex.printStackTrace();
            return abo;
        }
         }

        return abo;
    }
    

    @Override
    public AccessBackoffice update(AccessBackoffice obj) {
       AccessBackoffice success = new AccessBackoffice ();

        if (this.bddmanager.connect()) {

            try {

                // create requete 
                String requete = "Update access_backoffice set nickname = ?,password = ? WHERE user_id = ?";
                // prepared requete 
                PreparedStatement pst = this.bddmanager.getConnection().prepareStatement(requete);
                // insert value in requete
                pst.setString(1, obj.getNickname());
                pst.setString(2, obj.getPassword());
                pst.setLong(3, obj.getUsersid());
                // excute update row in table
                int insert = pst.executeUpdate();
                // if insert in table 
                if (insert != 0) {
                    
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                return success;
            }

        }
        return success;   
    }

    @Override
    public boolean  delete(Long id) {
        
       boolean success = false;

        if (this.bddmanager.connect()) {

            try {

                // create requete 
                String requete = "DELETE FROM access_backoffice WHERE user_id = ?" ;
                // prepared requete 
                PreparedStatement ps = this.bddmanager.getConnection().prepareStatement(requete);
                // insert value in requete
                ps.setLong(1,id);
                
                // excute delete row in table
                int insert = ps.executeUpdate();
                // if insert in table 
                if (insert != 0) {
                    success = true;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                
                return success;
            }

       
        }
        return success;

    }


    @Override
    public AccessBackoffice find(Long id) {

       AccessBackoffice compte = new AccessBackoffice();
        if (this.bddmanager.connect()) {

            try {
                Statement st = this.bddmanager.getConnection().createStatement();
                String requete = "SELECT * FROM access_backoffice WHERE user_id = " + id;
                ResultSet rs = st.executeQuery(requete);
                
                rs.next();
                  
                compte = new AccessBackoffice(rs.getLong("user_id"), rs.getString("nickname"), rs.getString("password"));
                

            } catch (SQLException ex) {
                
                ex.printStackTrace();
                return compte;
            }

        } else {
            return compte;
        }
        return compte;
    }

    @Override
    public ArrayList<AccessBackoffice> getall() {
       ArrayList<AccessBackoffice> listAccessBackoffice = new ArrayList<>();
        if (this.bddmanager.connect()) {

            try {
                Statement st = this.bddmanager
                                .getConnection()
                                .createStatement();
                String requete = "SELECT * FROM access_backoffice";
                ResultSet rs = st.executeQuery(requete);

                while (rs.next()) {
                      AccessBackoffice abdoall = new AccessBackoffice(rs.getLong("user_id"), rs.getString("nickname"), rs.getString("password"));
                    listAccessBackoffice.add(abdoall);
                            
                    
                    listAccessBackoffice.add(abdoall);

                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                return listAccessBackoffice;
            }

       
        }

        return listAccessBackoffice;
    }
    
    @Override
    public boolean isValid(AccessBackoffice obj) {
        if(obj.getUsersid()== -1 || obj.getNickname() == null || obj.getPassword() == null){
            return false;
        }
        return true;
    }

   
    }


