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
public class TrainerTest {
    
    public TrainerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void create() {
        Trainer obj = new Trainer.Build("002").
                name("Joseph").
                number("074567892").
                builder();
        Assert.assertEquals("Joseph", obj.getName(), "creating error");
        
                }
     
      @Test
     public void update() {
        Trainer obj = new Trainer.Build("002").
                name("Joseph").
                number("074588888").
                builder();
        Assert.assertEquals("Joseph", obj.getName(), "update error");
        Assert.assertEquals("074588888",obj.getNumber());
        
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
