/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.services;

import com.mycompany.Gym.Invoice;
import com.mycompany.Services.InvoiceCrudServ;
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
public class InvoiceCrudTest {
    
    public InvoiceCrudTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
     @Mock
     InvoiceCrudServ iObj;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        iObj = Mockito.mock(InvoiceCrudServ.class);
    }
    
     @Test
    public void testCreate() throws Exception {
        
         Invoice invoice = new Invoice.Build("4563").total(2345.65).build();
        
        Invoice returnI = iObj.persist(invoice);
        when(iObj.persist(invoice)).thenReturn(returnI);
        Mockito.verify(iObj).persist(invoice);
    }

    @Test
    public void testRead() throws Exception {
         Invoice invoice = new Invoice.Build("563").total(2345.65).build();
          
        Invoice returnE = iObj.find(invoice.getId());
        when(iObj.find(invoice.getId())).thenReturn(returnE);
        Mockito.verify(iObj).find(invoice.getId());
        
    }
    
    @Test
    public void testUpdate() throws Exception {      
         Invoice invoice = new Invoice.Build("4563").total(2345.65).build();
    
         Invoice update = new Invoice.Build("4563").total(200.65).build();

        invoice = iObj.merge(update);
        when(iObj.merge(update)).thenReturn(invoice);
        Mockito.verify(iObj).merge(update);
         

    }
    
      @Test
    public void testDelete() throws Exception {
         Invoice invoice = new Invoice.Build("4563").total(2345.65).build();

        Invoice returnAccount = iObj.remove(invoice);
        when(iObj.remove(invoice)).thenReturn(returnAccount);
        Mockito.verify(iObj).remove(invoice);
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
