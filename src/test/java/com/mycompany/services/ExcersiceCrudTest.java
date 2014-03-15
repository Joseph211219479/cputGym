/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.services;

import com.mycompany.Gym.Equipment;
import com.mycompany.Gym.Excercise;
import com.mycompany.Services.ExcersiceCrudServ;
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
public class ExcersiceCrudTest {
    
    public ExcersiceCrudTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Mock
     ExcersiceCrudServ eObj;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        eObj = Mockito.mock(ExcersiceCrudServ.class);
    }
    
     @Test
    public void testCreate() throws Exception {
        
        Excercise e = new Excercise.Builder("9478").name("dumbbell curls").primaryTarget("Biceps").build();
        
        Excercise returnE = eObj.persist(e);
        when(eObj.persist(e)).thenReturn(returnE);
        Mockito.verify(eObj).persist(e);
    }

    @Test
    public void testRead() throws Exception {
        Excercise e = new Excercise.Builder("9478").name("dumbbell curls").primaryTarget("Biceps").build();
          
        Excercise returnE = eObj.find(e.getExcersiceId());
        when(eObj.find(e.getExcersiceId())).thenReturn(returnE);
        Mockito.verify(eObj).find(e.getExcersiceId());

    }
    
    @Test
    public void testUpdate() throws Exception {      
        Excercise e = new Excercise.Builder("9478").name("dumbbell curls").primaryTarget("Biceps").build();
    
        Excercise update = new Excercise.Builder("9478").primaryTarget("Biceps/chest").build();

        e = eObj.merge(update);
        when(eObj.merge(update)).thenReturn(e);
        Mockito.verify(eObj).merge(update);
         

    }
    
      @Test
    public void testDelete() throws Exception {
        Excercise e = new Excercise.Builder("9478").name("dumbbell curls").primaryTarget("Biceps").build();

        Excercise returnAccount = eObj.remove(e);
        when(eObj.remove(e)).thenReturn(returnAccount);
        Mockito.verify(eObj).remove(e);

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
