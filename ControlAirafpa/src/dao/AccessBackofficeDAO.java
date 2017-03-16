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

public class AccessBackofficeDAO extends DAO<AccessBackoffice, Integer> {

    public AccessBackofficeDAO() {

        super();
    }

    @Override
    public AccessBackoffice create(AccessBackoffice abo) {
      
        try {

            Statement st = this.bddmanager.getConnection().createStatement();
            PreparedStatement creatabdao = this.bddmanager.getConnection().prepareStatement("insert into emp values(?,?,?)", Statement.RETURN_GENERATED_KEYS);

            creatabdao.setInt(1, 23);
            creatabdao.setString(2, "Roshan");
            creatabdao.setString(3, "CEO");
            creatabdao.executeUpdate();
            ResultSet keys = creatabdao.getGeneratedKeys();
            keys.next();
            int key = keys.getInt(1);
            abo = this.find(abo.getUsersid());

        } catch (SQLException ex) {
            ex.printStackTrace();
            return abo;
        }

        return abo;
    }

    @Override
    public AccessBackoffice update(AccessBackoffice obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean  delete(Integer abod) {
        
       boolean success = false;

        if (this.bddmanager.connect()) {

            try {

                // create requete 
                String requete = "DELETE FROM airports WHERE id = ?";
                // prepared requete 
                PreparedStatement pst = this.bddmanager.getConnection().prepareStatement(requete);
                // insert value in requete
                pst.setString(1,);
                // excute delete row in table
                int insert = pst.executeUpdate();
                // if insert in table 
                if (insert != 0) {
                    success = true;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                return success;
            }

        } else {
            return success;
        }
        return success;

    }


    @Override
    public AccessBackoffice find(Integer id) {

       AccessBackoffice compte = new AccessBackoffice();
        if (this.bddmanager.connect()) {

            try {
                Statement st = this.bddmanager.getConnection().createStatement();
                String requete = "SELECT * FROM airports WHERE id = ? " ;
                ResultSet rs = st.executeQuery(requete);
                while (rs.next()) {
                    compte.setUsersid(rs.getInt("id"));
                    compte.setNickname(rs.getString("name"));
                    compte.setPassword(rs.getString("password"));
                }

            } catch (SQLException ex) {
                
                ex.printStackTrace();
                return compte;
            }

        } else {
            return compte;
        }
        return compte;
    }

}
