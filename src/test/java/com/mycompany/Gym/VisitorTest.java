/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Gym;

import org.testng.Assert;
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
public class VisitorTest {
    
    public VisitorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void VisitCreate() 
     {
         Visitor obj = new Visitor.Builder("1432").
                 hostId("12346").
                 name("Someone").
                 build();
         Assert.assertEquals("12346", obj.getHostId(), "creation error");
          Assert.assertEquals("Someone", obj.getName(), "creation error");
     }
      @Test
     public void VisitUpdaTE() 
     {
         Visitor obj = new Visitor.Builder("1432").
                 hostId("8745").
                 name("Someone").
                 build();
         Assert.assertEquals("8745", obj.getHostId(), "update error");
          Assert.assertEquals("Someone", obj.getName(), "update error");
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
