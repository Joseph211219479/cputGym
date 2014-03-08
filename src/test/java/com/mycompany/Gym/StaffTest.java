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
public class StaffTest {
    
    public StaffTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void create() 
     {
         Staff obj = new Staff.Builder("777").isTrainer("yes").name("arnold").number("765345").builder();
         Assert.assertEquals(true, obj.isIsTrainer());
     }
     
     @Test
     public void update() 
     {
         Staff obj = new Staff.Builder("777").isTrainer("yes").name("hulk").number("765345").builder();
         Assert.assertEquals(true, obj.isIsTrainer());
         Assert.assertEquals("hulk", obj.getName());
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
