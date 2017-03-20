/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import data.AccessBackoffice;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class AccessBackofficeDAOTest {
    
    public AccessBackofficeDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class AccessBackofficeDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        long test = 2;
        AccessBackoffice aboc = new AccessBackoffice( test , "smail2","elmoussaoui2");
        AccessBackofficeDAO instance = new AccessBackofficeDAO();
        String result = instance.create(aboc).toString(); 
        String expResult = aboc.toString();
       
        assertEquals(expResult, result);
     
    }

    /**
     * Test of update method, of class AccessBackofficeDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        long keyss  = 5;
        AccessBackoffice abou = new AccessBackoffice( keyss  , "smail1","elmoussaoui1");
        AccessBackofficeDAO instance = new AccessBackofficeDAO();
        AccessBackoffice expResult = instance.find(keyss );
        AccessBackoffice result = instance.update(abou);       
        assertEquals(expResult, result);
       
    }

//    /**
//     * Test of delete method, of class AccessBackofficeDAO.
//     */
//    @Test
//    public void testDelete() {
//        
//        System.out.println("delete");
//       
//        long id = 3;
//        AccessBackofficeDAO instance = new AccessBackofficeDAO();
//        boolean result = instance.delete(id);
//                
//        
//        
//        
//        assertEquals(true, result);
//        
//    }
//
//    /**
//     * Test of find method, of class AccessBackofficeDAO.
//     */
    @Test
    public void testFind() {
        System.out.println("find");
        long id = 6 ;
        
        AccessBackofficeDAO instance = new AccessBackofficeDAO();
        String expResult = "AccessBackoffice{user_id=6, nickname=smail6, password=elmoussaoui6}";
        String result = instance.find(id).toString();
        
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getall method, of class AccessBackofficeDAO.
     */
    @Test
    public void testGetall() {
      System.out.println("get all");
     String result = "";
     String expResult = "";
     AccessBackofficeDAO instance = new AccessBackofficeDAO();
     ArrayList<AccessBackoffice> arrayOfResult = instance.getall();
        for (AccessBackoffice accessSite : arrayOfResult) {
            result += accessSite.toString();
            expResult += instance.find(accessSite.getUsersid()).toString();
        }
     
     assertEquals(expResult, result);
    }

   
    
}

