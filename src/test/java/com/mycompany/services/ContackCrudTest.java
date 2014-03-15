/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.services;

import com.mycompany.Gym.Contack;
import com.mycompany.Services.ContackCrudServ;
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
public class ContackCrudTest {
    
    public ContackCrudTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Mock
    ContackCrudServ objContact;
    
    @BeforeMethod
     public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        objContact = Mockito.mock(ContackCrudServ.class);
    }
     
      @Test
    public void testCreate() throws Exception {
        Contack obj = new Contack.Builder("0741234567").name("Joseph").build();
        
        Contack returnContack = objContact.persist(obj);
        when(objContact.persist(obj)).thenReturn(returnContack);
        Mockito.verify(objContact).persist(obj);
    }
    
     @Test
    public void testRead() throws Exception {
         Contack obj = new Contack.Builder("0741234567").name("Joseph").build();
         
        Contack returnAccount = objContact. find(obj.getName());
        when(objContact.find(obj.getName())).thenReturn(returnAccount);
        Mockito.verify(objContact).find(obj.getName());

    }
    
    @Test
    public void testUpdate() throws Exception {
    Contack obj = new Contack.Builder("0741234567").name("Joseph").build();  
    
    Contack update = new Contack.Builder("0741234567").name("Craig").build();
        
        obj = objContact.merge(update);
        when(objContact.merge(update)).thenReturn(obj);
        Mockito.verify(objContact).merge(update);
         

    }
    
     @Test
    public void testDelete() throws Exception {

    Contack obj = new Contack.Builder("0741234567").name("Joseph").build(); 
    
        Contack returnContack = objContact.remove(obj);
        when(objContact.remove(obj)).thenReturn(returnContack);
        Mockito.verify(objContact).remove(obj);

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
