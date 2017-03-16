/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bsql.ConnexionBddsql;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public abstract class DAO <T>{
    
    
    protected ConnexionBddsql bddmanager = null ;

    public DAO() {
        this.bddmanager = ConnexionBddsql.getInstance();
    }
    public abstract T create(T obj);
    
    public abstract T delete(T obj);
    
    public abstract T find ();
    
}
