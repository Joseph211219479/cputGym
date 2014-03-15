/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.services;

import com.mycompany.Gym.Booking;
import com.mycompany.Services.BookingCrudServ;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class TestBookingCrud {
    
    
    public TestBookingCrud() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Mock
     private static BookingCrudServ bobj ;
    
     @BeforeMethod
     public void setUp() throws Exception
     {         
         MockitoAnnotations.initMocks(this);
        bobj = Mockito.mock(BookingCrudServ.class);
     }
     
     @Test
     public void testCreate() throws Exception
     {
         Booking obj = new Booking.Builder("6483").avail(4).builder();
                
         
         Booking returnBook = bobj.persist(obj);
        when(bobj.persist(obj)).thenReturn(returnBook);
        Mockito.verify(bobj).persist(obj);
     }
     
     @Test
     public void testRead() throws Exception
     {
         Booking obj = new Booking.Builder("6483").avail(4).builder();

         Booking returnAds = bobj.find(obj.getBookingId());
        when(bobj.persist(obj)).thenReturn(returnAds);
        Mockito.verify(bobj).find(obj.getBookingId());
     }
     
     @Test
    public void testUpdate() throws Exception {
       
         Booking obj = new Booking.Builder("6483").avail(4).builder();
         Booking update = new Booking.Builder("6483").avail(2).builder();
         
         obj = bobj.merge(update);
         when(bobj.merge(update)).thenReturn(obj);
         Mockito.verify(bobj).merge(update);

    }
    
     @Test
    public void testDelete() throws Exception {

         
         Booking obj = new Booking.Builder("6483").avail(4).builder();

        Booking returnAccount = bobj.remove(obj);
        when(bobj.remove(obj)).thenReturn(returnAccount);
        Mockito.verify(bobj).remove(obj);

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
