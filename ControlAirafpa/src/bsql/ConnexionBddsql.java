/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Formation
 */
public class ConnexionBddsql {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/airafpa";
    private static final String DB_JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_USER = "airafpa";
    private static final String DB_PASSWORD = "airafpa";

    private Connection cn = null;

    private ConnexionBddsql() {

        try {
            Class.forName(ConnexionBddsql.DB_JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.exit(1);
        }

    }

    public static ConnexionBddsql getInstance() {
        return ConnexionBddsqlHolder.INSTANCE;
    }

    private static class ConnexionBddsqlHolder {

        private static final ConnexionBddsql INSTANCE = new ConnexionBddsql();
    }

    public boolean connect(){
        if (this.cn == null) {
            try {
                this.cn = DriverManager.getConnection(ConnexionBddsql.DB_URL, ConnexionBddsql.DB_USER, ConnexionBddsql.DB_PASSWORD);
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        } else {
            try {
                Statement st = this.cn.createStatement();
                String requete = "SELECT 1";
                st.executeQuery(requete);
            } catch (SQLException ex) {
                try {
                    this.cn = DriverManager.getConnection(ConnexionBddsql.DB_URL, ConnexionBddsql.DB_USER, ConnexionBddsql.DB_PASSWORD);
                } catch (SQLException exx) {
                    exx.printStackTrace();
                    return false;
                }
            }
        }
        return true;
    }
    public Connection getConnection(){
        return this.cn;
    }
}
