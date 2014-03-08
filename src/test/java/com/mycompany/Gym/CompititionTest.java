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
public class CompititionTest {
    
    public CompititionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void create() 
     {
         Compitition com = new Compitition.Build("687364").date("02/06/2014").name("arnold").prize("glory").build();
         Assert.assertEquals("arnold", com.getName());
     }
      @Test
     public void update() 
     {
         Compitition com = new Compitition.Build("687364").date("02/06/2014").name("arnold").prize("free membership extention").build();
         Assert.assertEquals("arnold", com.getName());
         Assert.assertEquals("free membership extention", com.getPrize());
         
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
