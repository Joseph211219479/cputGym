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
public class ProductTest {
    
    public ProductTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void create() 
     {
         Product obj = new Product.Builder("87645").name("usn mass gainer").price(500.00).stockAmount(20).build();
         Assert.assertEquals(500.00, obj.getPrice());
     }
     @Test
     public void update() 
     {
         Product obj = new Product.Builder("87645").name("usn mass gainer").price(450.00).stockAmount(20).build();
         Assert.assertEquals(450.00, obj.getPrice());
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
