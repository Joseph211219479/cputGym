/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.services;

import com.mycompany.Gym.Maintenance;
import com.mycompany.Services.MaintenanceCrudServ;
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
public class MaintenanceCrudTest {
    
    public MaintenanceCrudTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     @Mock
     private static MaintenanceCrudServ testobj ;
    
     @BeforeMethod
     public void setUp() throws Exception
     {         
         MockitoAnnotations.initMocks(this);
        testobj = Mockito.mock(MaintenanceCrudServ.class);
     }
     
     @Test
     public void testCreate() throws Exception
     {         
         Maintenance obj =  new Maintenance.Builder("02/03/2014").cost(1423.4).build();

         
         Maintenance returnM = testobj.persist(obj);
        when(testobj.persist(obj)).thenReturn(returnM);
        Mockito.verify(testobj).persist(obj);
     }
     
     @Test
     public void testRead() throws Exception
     {
         Maintenance obj =  new Maintenance.Builder("02/03/2014").cost(1423.4).build();

         Maintenance returnM = testobj.find(obj.getDate());
        when(testobj.find(obj.getDate())).thenReturn(returnM);
        Mockito.verify(testobj).find(obj.getDate());
     }
     
     @Test
    public void testUpdate() throws Exception {
                 Maintenance obj =  new Maintenance.Builder("02/03/2014").cost(1423.4).build();
                 
                 Maintenance update =  new Maintenance.Builder("02/03/2014").cost(20.4).build();

        
        obj = testobj.merge(update);
        when(testobj.merge(update)).thenReturn(obj);
        Mockito.verify(testobj).merge(update);
       

    }
    
     @Test
    public void testDelete() throws Exception {

       Maintenance obj =  new Maintenance.Builder("02/03/2014").cost(1423.4).build();

        Maintenance returnAccount = testobj.remove(obj);
        when(testobj.remove(obj)).thenReturn(returnAccount);
        Mockito.verify(testobj).remove(obj);

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
