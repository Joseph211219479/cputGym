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
public class SupplierTest {
    
    public SupplierTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void create() 
     {
         Supplier sup = new Supplier.Build("0463").name("zef").number("0877654675").build();
         Assert.assertEquals("0463", sup.getSupId());
     }
     
      @Test
     public void update() 
     {
         Supplier sup = new Supplier.Build("0463").name("chrome").number("0877654675").build();
         Assert.assertEquals("0463", sup.getSupId());
         Assert.assertEquals("chrome",sup.getName());
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
