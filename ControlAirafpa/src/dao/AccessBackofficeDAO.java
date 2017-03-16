/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;



public class AccessBackofficeDAO extends DAO{

    @Override
    public boolean creer(Object obj) {
    Statement st = this.bddmanager.getConnection().createStatement();
    String requete =    
    PreparedStatement updateemp = connect.prepareStatement(
    "insert into emp values(?,?,?)");
    updateemp.setInt(1,23);
    updateemp.setString(2,"Roshan");
    updateemp.setString(3, "CEO");
    updateemp.executeUpdate();

    }

    @Override
    public boolean supprimer(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

    

     
    
}
