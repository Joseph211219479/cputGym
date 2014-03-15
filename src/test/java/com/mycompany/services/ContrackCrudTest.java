/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.services;

import com.mycompany.Gym.Contrack;
import com.mycompany.Services.ContrackCrudServ;
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
public class ContrackCrudTest {
    
    public ContrackCrudTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
     @Mock
    ContrackCrudServ contrackObj;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        contrackObj = Mockito.mock(ContrackCrudServ.class);
    }
    
     @Test
    public void testCreate() throws Exception {
        Contrack obj = new Contrack.Builder("435").
                                     type("debit").
                                     signUp("02/02/2014").
                                     endDate("02/02/2015").
                                     duration("1 year").
                                     build();
        
        Contrack returnContrack = contrackObj.persist(obj);
        when(contrackObj.persist(obj)).thenReturn(returnContrack);
        Mockito.verify(contrackObj).persist(obj);
    }
    
    @Test
    public void testRead() throws Exception {
          Contrack obj = new Contrack.Builder("435").
                                     type("debit").
                                     signUp("02/02/2014").
                                     endDate("02/02/2015").
                                     duration("1 year").
                                     build();
          
        Contrack returnAccount = contrackObj.
                                find(obj.gettype());
        when(contrackObj.find(obj.gettype())).thenReturn(returnAccount);
        Mockito.verify(contrackObj).
                                find(obj.gettype());

    }
    
    @Test
    public void testUpdate() throws Exception {
        Contrack obj = new Contrack.Builder("435").
                                     type("debit").
                                     signUp("02/02/2014").
                                     endDate("02/02/2015").
                                     duration("1 year").
                                     build();
        
        Contrack update = new Contrack.Builder("435").
                                     type("cash").
                                     build();
        
        obj = contrackObj.merge(update);
        when(contrackObj.merge(update)).thenReturn(obj);
        Mockito.verify(contrackObj).merge(update);
         

    }
    
    @Test
    public void testDelete() throws Exception {

Contrack obj = new Contrack.Builder("435").
                                     type("debit").
                                     signUp("02/02/2014").
                                     endDate("02/02/2015").
                                     duration("1 year").
                                     build();
        Contrack returnAccount = contrackObj.remove(obj);
        when(contrackObj.remove(obj)).thenReturn(returnAccount);
        Mockito.verify(contrackObj).remove(obj);

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
