/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import data.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class AccessBackofficeDAO extends DAO{
    
    public AccessBackofficeDAO() {
        
    super ();
    
    }
    
    @Override
    public boolean creer(Object obj) {
        
        boolean succee = false;
        
        AccessBackoffice el = (AccessBackoffice) obj;
        
       if(this.bddmanager.connect()){
            
            try {
                
                Statement st = this.bddmanager.getConnection().createStatement();
                String requete ="INSERT into eleves (nomeleves, prenomeleves, classeeleves) VALUES " + "(\"" + el.getNomeleve()+ "\",\"" + el.getPrenomeleve() + "\", " + el.getClasseeleve() + ")";
                //System.out.println(requete);
                int resultat=st.executeUpdate(requete);
                
                
                                 
            } catch (SQLException ex) {
                ex.printStackTrace();
                return succee ;
            }
        }else {
            
            return succee ;
            
        }
       return succee;
    }


    @Override
    public boolean supprimer(Object obj) {
        return false;
    }

    @Override
    public ArrayList getAll() {
       
        ArrayList<AccessBackoffice> listEleves =new ArrayList<>();
        
        if(this.bddmanager.connect()){
            
            try {
                
                Statement st = this.bddmanager.getConnection().createStatement();
                String requete ="SELECT * FROM eleves";
                ResultSet rs = st.executeQuery(requete);
                
                while (rs.next()) {
                    AccessBackoffice el = new Eleve (rs.getInt("ideleves"),rs.getString("nomeleves"),rs.getString("prenomeleves"),rs.getInt("classeeleves"));
                    listEleves.add(el);
                    
                }
                                 
            } catch (SQLException ex) {
                ex.printStackTrace();
                return listEleves ;
            }
        }else {
            
            return listEleves ;
            
        }
        
        return listEleves;
        
    }

    
    
}
