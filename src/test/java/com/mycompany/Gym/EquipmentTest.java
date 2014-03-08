/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Gym;

import junit.framework.Assert;
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
public class EquipmentTest {
    
    public EquipmentTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void create() 
     {
         Equipment e = new Equipment.Builder("007").buyDate("04/05/2012").name("smith mashine").build();
         Assert.assertEquals("smith mashine", e.getName());
     }
     
      @Test
     public void update() 
     {
         Equipment e = new Equipment.Builder("007").buyDate("04/05/2012").name("bench").build();
         Assert.assertEquals("bench", e.getName());
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
