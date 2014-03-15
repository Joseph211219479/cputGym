/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.services;

import com.mycompany.Gym.Equipment;
import com.mycompany.Services.EquipmentCrudServ;
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
public class EquipmentCrudTest {
    
    public EquipmentCrudTest() {
    }
    @Mock
    EquipmentCrudServ eObj;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        eObj = Mockito.mock(EquipmentCrudServ.class);
    }
    
     @Test
    public void testCreate() throws Exception {
        
         Equipment e = new Equipment.Builder("007").buyDate("04/05/2012").name("smith mashine").build();
        
        Equipment returnE = eObj.persist(e);
        when(eObj.persist(e)).thenReturn(returnE);
        Mockito.verify(eObj).persist(e);
    }
    
     @Test
    public void testRead() throws Exception {
         Equipment e = new Equipment.Builder("007").buyDate("04/05/2012").name("smith mashine").build();
          
        Equipment returnE = eObj.find(e.getCode());
        when(eObj.find(e.getCode())).thenReturn(returnE);
        Mockito.verify(eObj).find(e.getCode());

    }
    
    @Test
    public void testUpdate() throws Exception {      
        Equipment e = new Equipment.Builder("007").buyDate("04/05/2012").name("smith mashine").build();

    
       Equipment update = new Equipment.Builder("007").name("pool").build();

        
        e = eObj.merge(update);
        when(eObj.merge(update)).thenReturn(e);
        Mockito.verify(eObj).merge(update);
         

    }
    
      @Test
    public void testDelete() throws Exception {
        Equipment e = new Equipment.Builder("007").buyDate("04/05/2012").name("smith mashine").build();

        Equipment returnAccount = eObj.remove(e);
        when(eObj.remove(e)).thenReturn(returnAccount);
        Mockito.verify(eObj).remove(e);

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
