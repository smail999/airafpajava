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
    public AccessBackoffice create(AccessBackoffice obj) {
        AccessBackofficeDAO abdao = new AccessBackofficeDAO();
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
            abdao = this.find(key);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return abdao;
    }

    @Override
    public AccessBackoffice update(AccessBackoffice obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AccessBackoffice delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public AccessBackoffice find(Integer id) {

        AccessBackoffice accessite = new AccessBackoffice();

        try {

            Statement st = this.bddmanager.getConnection().createStatement();
            String requete = "SELECT * from accessite where id =id";
            ResultSet rs = st.executeQuery(requete);
            rs.next();
            rs.getInt(1);
            rs.getString(requete);

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

        return AccessBackoffice;
    }

}
