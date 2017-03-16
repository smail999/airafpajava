/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import data.AccessBackoffice;
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
        AccessBackoffice abo = null;
        AccessBackofficeDAO instance = new AccessBackofficeDAO();
        AccessBackoffice expResult = null;
        AccessBackoffice result = instance.create(abo);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of update method, of class AccessBackofficeDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        AccessBackoffice obj = null;
        AccessBackofficeDAO instance = new AccessBackofficeDAO();
        boolean expResult = false;
        boolean result = instance.update(obj);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of delete method, of class AccessBackofficeDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer id = null;
        AccessBackofficeDAO instance = new AccessBackofficeDAO();
        boolean expResult = false;
        boolean result = instance.delete(id);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of find method, of class AccessBackofficeDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Integer id = null;
        AccessBackofficeDAO instance = new AccessBackofficeDAO();
        AccessBackoffice expResult = null;
        AccessBackoffice result = instance.find(id);
        assertEquals(expResult, result);
        
    }
    
}
