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
        long test = 4;
        AccessBackoffice abo = new AccessBackoffice( test , "smail1","elmoussaoui1");
        AccessBackofficeDAO instance = new AccessBackofficeDAO();
        String result = instance.create(abo).toString(); 
        String expResult = abo.toString();
       
        assertEquals(expResult, result);
     
    }

//    /**
//     * Test of update method, of class AccessBackofficeDAO.
//     */
//    @Test
//    public void testUpdate() {
//        System.out.println("update");
//        AccessBackoffice obj = null;
//        AccessBackofficeDAO instance = new AccessBackofficeDAO();
//        boolean expResult = false;
//        boolean result = instance.update(obj);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of delete method, of class AccessBackofficeDAO.
//     */
//    @Test
//    public void testDelete() {
//        System.out.println("delete");
//        Long id = null;
//        AccessBackofficeDAO instance = new AccessBackofficeDAO();
//        boolean expResult = false;
//        boolean result = instance.delete(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of find method, of class AccessBackofficeDAO.
//     */
//    @Test
//    public void testFind() {
//        System.out.println("find");
//        Long id = null;
//        AccessBackofficeDAO instance = new AccessBackofficeDAO();
//        AccessBackoffice expResult = null;
//        AccessBackoffice result = instance.find(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getall method, of class AccessBackofficeDAO.
//     */
//    @Test
//    public void testGetall() {
//        System.out.println("getall");
//        AccessBackofficeDAO instance = new AccessBackofficeDAO();
//        ArrayList<AccessBackoffice> expResult = null;
//        ArrayList<AccessBackoffice> result = instance.getall();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isValid method, of class AccessBackofficeDAO.
//     */
//    @Test
//    public void testIsValid() {
//        System.out.println("isValid");
//        AccessBackoffice obj = null;
//        AccessBackofficeDAO instance = new AccessBackofficeDAO();
//        boolean expResult = false;
//        boolean result = instance.isValid(obj);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}

