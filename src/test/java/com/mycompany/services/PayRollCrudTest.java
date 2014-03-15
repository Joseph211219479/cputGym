/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.services;

import com.mycompany.Gym.PayRoll;
import com.mycompany.Services.PayRollCrudServ;
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
public class PayRollCrudTest {
    
    public PayRollCrudTest() {
    }

     @Mock
    PayRollCrudServ pserv;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        pserv = Mockito.mock(PayRollCrudServ.class);
    }

    @Test
    public void testCreate() throws Exception {
            PayRoll obj = new PayRoll.Builder(3000.00).staffId(12345).build();
            
        PayRoll returnP = pserv.persist(obj);
        when(pserv.persist(obj)).thenReturn(returnP);
        Mockito.verify(pserv).persist(obj);
    }

    @Test
    public void testRead() throws Exception {
        PayRoll obj = new PayRoll.Builder(3000.00).staffId(12345).build();

        //PayRoll returnP = pserv.find(obj.getStaffId());
        //when(pserv.find(obj.getStaffId())).thenReturn(returnP);
        //Mockito.verify(pserv).find(obj.getStaffId());

    }
    @Test
    public void testUpdate() throws Exception {
                PayRoll obj = new PayRoll.Builder(3000.00).staffId(12345).build();

        
                PayRoll update = new PayRoll.Builder(3000.00).staffId(1234).build();

        
        obj = pserv.merge(update);
        when(pserv.merge(update)).thenReturn(obj);
        Mockito.verify(pserv).merge(update);
         

    }

    @Test
    public void testDelete() throws Exception {

                PayRoll obj = new PayRoll.Builder(3000.00).staffId(12345).build();
        PayRoll returnP = pserv.remove(obj);
        when(pserv.remove(obj)).thenReturn(returnP);
        Mockito.verify(pserv).remove(obj);

    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

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
