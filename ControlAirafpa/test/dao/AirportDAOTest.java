/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import data.Airports;
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
public class AirportDAOTest {
    
    public AirportDAOTest() {
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
     * Test of create method, of class AirportDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        // create object airport
        Airports airport = new Airports("ACE", "île de Lanzarote, Canaries", "Espagne");
        AirportDAO airportDAO = new AirportDAO();
        // find airport  create 
        Airports expResult = airportDAO.find(airport.getAita());
        
        // if find aita is empty or null
        if (!airportDAO.isValid(expResult)) {
            // insert airport in table
            Airports result = airportDAO.create(airport);   
            // find airport
            expResult = airportDAO.find(airport.getAita());
            // delete airport
            airportDAO.delete(result.getAita());
            assertEquals(expResult, result);          
        }

    }

    /**
     * Test of update method, of class AirportDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        // create object airport
        Airports airportInsert = new Airports("AEK", "Aseki", "Papouasie-Nouvelle-Guinée");
        AirportDAO airportDAO = new AirportDAO();
        // find airport create 
        Airports findAirport = airportDAO.find(airportInsert.getAita());
        
        // if find airport is empty
        if (!airportDAO.isValid(findAirport)) {
            // Insert airport in table
            Airports resultAirport = airportDAO.create(airportInsert);  
            // find airport
            findAirport = airportDAO.find(resultAirport.getAita());    
        }
            // modify airport
            findAirport.setCity("update Aseki");
            findAirport.setCountry("update Papouasie-Nouvelle-Guinée");         
            
   
        // update airport
        Airports result = airportDAO.update(findAirport);   
        boolean expResult = true;
        // delete airport
        airportDAO.delete(findAirport.getAita());
        assertEquals(expResult, result);
    }
    /**
     * Test of delete method, of class AirportDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        AirportDAO airportDAO = new AirportDAO();
        
        // create object airport
        Airports airportInsert = new Airports("AGA", "agadir", "Maroc");
        // find airport  create 
        Airports findAirport = airportDAO.find(airportInsert.getAita());
        
        // if find airport is empty
       if (!airportDAO.isValid(findAirport)) {
            // Insert airport in table
            Airports resultAirport = airportDAO.create(airportInsert);  
            // find airport
            findAirport = airportDAO.find(resultAirport.getAita()); 
            // delete airport
            boolean result = airportDAO.delete(findAirport.getAita());
            boolean expResult = true;
            assertEquals(expResult, result);
        }
    }
    /**
     * Test of findAll method, of class AirportDAO.
     */
    @Test
    public void testGetdAll() {
        System.out.println("findAll");
        AirportDAO airportDAO = new AirportDAO();
        ArrayList<Airports> arrayAirport = airportDAO.getall();
        String expResult = "";
        String result = "";
        for (int i = 0; i < arrayAirport.size(); i++) {
            expResult += airportDAO.find(arrayAirport.get(i).getAita());
            result += arrayAirport.get(i);
        }
        assertEquals(expResult, result);

    }

    /**
     * Test of find method, of class AirportDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find"); 
        AirportDAO airportDAO = new AirportDAO();
        // assign primary key
        String primary_key = "DXB";
        // assign result exemple
        String expResult = "Airport{aita=DXB, city=Dubaï, country=Émirats arabes unis}";
        // find airport
        String result = airportDAO.find(primary_key).toString();
        
        assertEquals(expResult, result);
    }
}
