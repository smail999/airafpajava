/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import data.Flights;
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
public class FlightDAOTest {
    
    public FlightDAOTest() {
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
     * Test of create method, of class FlightDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        // create object flight    
        Flights flight = new Flights(0, "MRS", "FNJ",
                "2017-03-20 05:30:00.0", 400, 275.75, 1, 2, 3, 4, 5, true);
        FlightDAO flightDAO = new FlightDAO();
        // find flight  create 
        Flights expResult = flightDAO.find(flight.getId());

        // if find aita is empty or null
        if (!flightDAO.isValid(expResult)) {           
            // insert flight in table
            Flights result = flightDAO.create(flight);
            // find flight
            expResult = flightDAO.find(flight.getId());   
            // delete flight test
            flightDAO.delete(result.getId());
            assertEquals(expResult, result); 
         
        }

    }

    /**
     * Test of update method, of class FlightDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        // create object flight      
        Flights flightInsert = new Flights(0, "FNJ", "LAS", "2017-03-20 05:30:00",
                400, 478.75, 0, 0, 0, 0, 0, false);
        // instatied flightDAO
        FlightDAO flightDAO = new FlightDAO();
        // find flight create 
        Flights findFlight = flightDAO.find(flightInsert.getId());
        // if find flight is empty
        if (!flightDAO.isValid(findFlight)) {
            // Insert flight in table
            Flights resultFlight = flightDAO.create(flightInsert);             
            // find flight
            findFlight = flightDAO.find(resultFlight.getId());
        }
            // modify flight
            findFlight.setDeparting_aita("MRS");
            findFlight.setArrival_aita("FNJ");
            findFlight.setDeparting_hour("2017-03-21 05:30:00.0");
            findFlight.setDuration(400);
            findFlight.setPrice(278.75);
            findFlight.setId_pilot(1);
            findFlight.setId_copilot(0);
            findFlight.setId_staff1(0);
            findFlight.setId_staff2(0);
            findFlight.setId_staff3(5);
            findFlight.setPlanned(true);   

        // update flight
        Flights result = flightDAO.update(findFlight);
        boolean expResult = true;
        // delete flight test
        flightDAO.delete(findFlight.getId());
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class FlightDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        FlightDAO flightDAO = new FlightDAO();

        // create object flight	
        Flights flightInsert = new Flights(0, "TLS", "MRS", "2017-03-20 05:30:00",
                250, 175.75, 1, 2, 3, 4, 5, true);
        // find flight  create 
        Flights findFlight = flightDAO.find(flightInsert.getId());

        // if find flight is empty
        if (!flightDAO.isValid(findFlight)) {
            // Insert flight in table
            Flights resultFlight = flightDAO.create(flightInsert);
            // find flight
            findFlight = flightDAO.find(resultFlight.getId());
            // delete flight
            boolean result = flightDAO.delete(findFlight.getId());
            boolean expResult = true;
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of findAll method, of class FlightDAO.
     */
    @Test
    public void testGetdAll() {
        System.out.println("findAll");
        FlightDAO flightDAO = new FlightDAO();
        ArrayList<Flights> arrayFlight = flightDAO.getall();
        String expResult = "";
        String result = "";
        for (int i = 0; i < arrayFlight.size(); i++) {
            expResult += flightDAO.find(arrayFlight.get(i).getId());
            result += arrayFlight.get(i);
        }
        assertEquals(expResult, result);

    }

    /**
     * Test of find method, of class FlightDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        FlightDAO flightDAO = new FlightDAO();
        // assign primary key
        long primary_key = 5;
        // assign result exemple
        String expResult = "Flight{id=5, departing_aita=DXB, arrival_aita=ICN, "
                + "departing_hour=2017-05-01 08:00:00.0, duration=420, "
                + "price=358.67, id_pilot=1, id_copilot=0, id_staff1=4, "
                + "id_staff2=0, id_staff3=0, planned=false}";

        // find flight
        String result = flightDAO.find(primary_key).toString();

        assertEquals(expResult, result);
    }
}
