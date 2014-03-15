/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.services;

import com.mycompany.Gym.Compitition;
import com.mycompany.Services.CompititionCrudServ;
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
public class CompititionCrudTest {
    
    public CompititionCrudTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Mock
    CompititionCrudServ compserv ;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        compserv = Mockito.mock(CompititionCrudServ.class);
    }

    @Test
    public void testCreate() throws Exception {
        
         Compitition com = new Compitition.Build("687364").date("02/06/2014").name("arnold").prize("glory").build();
        Compitition returnComp = compserv.persist(com);
        when(compserv.persist(com)).thenReturn(returnComp);
        Mockito.verify(compserv).persist(com);
    }

    @Test
    public void testRead() throws Exception {
       Compitition com = new Compitition.Build("687364").date("02/06/2014").name("arnold").prize("glory").build();

        Compitition returnAccount = compserv.
                find(com.getId());
        when(compserv.find(com.getId())).
                thenReturn(returnAccount);
        Mockito.verify(compserv).
                                find(com.getId());

    }
    @Test
    public void testUpdate() throws Exception {
      Compitition obj1 = new Compitition.Build("687364").date("02/06/2014").name("arnold").prize("glory").build();
      Compitition objUpdate = new Compitition.Build("687364").name("Classic").build();
      
      obj1 = compserv.merge(objUpdate);
      when(compserv.merge(objUpdate)).thenReturn(objUpdate);
      Mockito.verify(compserv).merge(objUpdate);

         

    }

    @Test
    public void testDelete() throws Exception {

       Compitition com = new Compitition.Build("687364").date("02/06/2014").name("arnold").prize("glory").build();
        Compitition returnAccount = compserv.remove(com);
        when(compserv.remove(com)).thenReturn(returnAccount);
        Mockito.verify(compserv).remove(com);

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
