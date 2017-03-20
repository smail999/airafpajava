/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import data.Bookings;
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
public class BookingDAOTest {
    
    public BookingDAOTest() {
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
     * Test of create method, of class BookingDAO.
     */
     @Test
    public void testCreate() {
        System.out.println("create");
        // create object booking    
        Bookings booking = new Bookings(0, 32, 2, 70);
        BookingDAO bookingDAO = new BookingDAO();
        // find booking  create 
        Bookings expResult = bookingDAO.find(booking.getId());

        // if find aita is empty or null
        if (!bookingDAO.isValid(expResult)) {           
            // insert booking in table
            Bookings result = bookingDAO.create(booking);
            // find booking
            expResult = bookingDAO.find(booking.getId());   
            // delete booking test
            bookingDAO.delete(result.getId());
            assertEquals(expResult, result); 
         
        }

    }

    /**
     * Test of update method, of class BookingDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        // create object booking      
        Bookings bookingInsert = new Bookings(0, 36, 2, 40);
        // instatied bookingDAO
        BookingDAO bookingDAO = new BookingDAO();
        // find booking create 
        Bookings findBooking = bookingDAO.find(bookingInsert.getId());
        // if find booking is empty
        if (!bookingDAO.isValid(findBooking)) {
            // Insert booking in table
            Bookings resultBooking = bookingDAO.create(bookingInsert);             
            // find booking
            findBooking = bookingDAO.find(resultBooking.getId());
        }
            // modify booking
            findBooking.setPlace(75);

        // update booking
        Bookings result = bookingDAO.update(findBooking);
        boolean expResult = true;
        // delete booking test
        bookingDAO.delete(findBooking.getId());
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class BookingDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        BookingDAO bookingDAO = new BookingDAO();

        // create object booking	
        Bookings bookingInsert =  new Bookings(0, 31, 2, 40);
        // find booking  create 
        Bookings findBooking = bookingDAO.find(bookingInsert.getId());

        // if find booking is empty
        if (!bookingDAO.isValid(findBooking)) {
            // Insert booking in table
            Bookings resultBooking = bookingDAO.create(bookingInsert);
            // find booking
            findBooking = bookingDAO.find(resultBooking.getId());
            // delete booking
            boolean result = bookingDAO.delete(findBooking.getId());
            boolean expResult = true;
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of findAll method, of class BookingDAO.
     */
    @Test
    public void testGetdAll() {
        System.out.println("findAll");
        BookingDAO bookingDAO = new BookingDAO();
        ArrayList<Bookings> arrayBooking = bookingDAO.getall();
        String expResult = "";
        String result = "";
        for (int i = 0; i < arrayBooking.size(); i++) {
            expResult += bookingDAO.find(arrayBooking.get(i).getId());
            result += arrayBooking.get(i);
        }
        assertEquals(expResult, result);

    }

    /**
     * Test of find method, of class BookingDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        BookingDAO bookingDAO = new BookingDAO();
        // assign primary key
        long primary_key = 1;
        // assign result exemple
        String expResult ="Booking{id=1, user_id=10, flight_id=1, place=1}";
        // find booking
  
        String result = bookingDAO.find(primary_key).toString();
        assertEquals(expResult, result);
    }
    
}
