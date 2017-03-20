/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import data.AccessSite;
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
public class AccessSiteDAOTest {
    
    public AccessSiteDAOTest() {
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
     * Test of create method, of class AccessSiteDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        AccessSite accessite = new AccessSite(97, "Komaji", "blurps31");
        AccessSiteDAO instance = new AccessSiteDAO();
        String result = instance.create(accessite).toString();
        String expResult = accessite.toString();
        
        
       assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class AccessSiteDAO.
     */
   @Test
    public void testUpdate() {
        System.out.println("update");
        long keyss = 94;
        AccessSite obj = new AccessSite(keyss, "toto", "password");
        AccessSiteDAO instance = new AccessSiteDAO();
        String unexpResult = instance.find(keyss).toString();
        String result = instance.update(obj).toString();
        assertNotEquals(unexpResult, result);
    }

    /**
     * Test of find method, of class AccessSiteDAO.
     */
   @Test
    public void testFind() {
        System.out.println("find");
        long id = 20;
        AccessSiteDAO instance = new AccessSiteDAO();
        String expResult = "AccessSite{user_id=20, nickname=accumsan, password=4b6cfa124411971901869dc6e1b00e5d3de5f1cc}";
        String result = instance.find(id).toString();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of delete method, of class AccessSiteDAO.
     */
 @Test
    public void testDelete() {
        System.out.println("delete");
        AccessSite accesssite = new AccessSite();
        long id = 97;
        AccessSiteDAO instance = new AccessSiteDAO();
        instance.delete(id);
        accesssite = instance.find(id);
        assertFalse(instance.isValid(accesssite));
        
    }
    
    // Creation of my method getAll to find something on my ArrayList
    
 @Test
 public void TestGetAll(){
     System.out.println("get all");
     String result = "";
     String expResult = "";
     AccessSiteDAO instance = new AccessSiteDAO();
     ArrayList<AccessSite> arrayOfResult = instance.getall();
        for (AccessSite accessSite : arrayOfResult) {
            result += accessSite.toString();
            expResult += instance.find(accessSite.getUser_id()).toString();
        }
     
     assertEquals(expResult, result);
    
 } 
}
