/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.services;

import com.mycompany.Gym.Member;
import com.mycompany.Services.MemberCrudServ;
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
public class MemberCrudTest {
    
    public MemberCrudTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Mock
     MemberCrudServ MObj;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        MObj = Mockito.mock(MemberCrudServ.class);
    }
    
     @Test
    public void testCreate() throws Exception {
        
         Member mobj = new Member.Builder("1234").firstName("Joseph").lastName("Davids").build();
        
        Member returnM = MObj.persist(mobj);
        when(MObj.persist(mobj)).thenReturn(returnM);
        Mockito.verify(MObj).persist(mobj);
    }

    @Test
    public void testRead() throws Exception {
         Member mobj = new Member.Builder("1234").firstName("Joseph").lastName("Davids").build();
          
        Member returnE = MObj.find(mobj.getId());
        when(MObj.find(mobj.getId())).thenReturn(returnE);
        Mockito.verify(MObj).find(mobj.getId());
        
    }
    
    @Test
    public void testUpdate() throws Exception {      
         Member mobj = new Member.Builder("1234").firstName("Joseph").lastName("Davids").build();
    
         Member update = new Member.Builder("1234").firstName("Piet").build();

        mobj = MObj.merge(update);
        when(MObj.merge(update)).thenReturn(mobj);
        Mockito.verify(MObj).merge(update);
         

    }
    
      @Test
    public void testDelete() throws Exception {
         Member mobj = new Member.Builder("1234").firstName("Joseph").lastName("Davids").build();

        Member returnM = MObj.remove(mobj);
        when(MObj.remove(mobj)).thenReturn(returnM);
        Mockito.verify(MObj).remove(mobj);
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
