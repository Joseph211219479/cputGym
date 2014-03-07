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
public class ProfileTest {
    
    public ProfileTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TestCreation() 
     {
         Profile obj = new Profile.Builder("4329").
                 age(22).
                 goal("bulk").
                 height(1.67).
                 weight(65.00).
                 name("Joseph").
                 surname("Davids").
                 build();
         
         Assert.assertEquals("4329", obj.getMemberId(), "creation error");
         Assert.assertEquals("bulk", obj.getGoal(), "creation error");
     }
     
      @Test
     public void TestUpdate() 
     {
         Profile obj = new Profile.Builder("4329").
                 age(22).
                 goal("tone").
                 height(1.67).
                 weight(82.00).
                 name("Joseph").
                 surname("Davids").
                 build();
         
         Assert.assertEquals("4329", obj.getMemberId(), "edit error");
         Assert.assertEquals("tone", obj.getGoal(), "edit error");
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
