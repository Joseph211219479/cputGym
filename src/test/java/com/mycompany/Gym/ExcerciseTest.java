/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Gym;

//import junit.framework.Assert;
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
public class ExcerciseTest {
    
    public ExcerciseTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void create() 
    {
        Excercise ex = new Excercise.Builder("9478").name("dumbbell curls").primaryTarget("Biceps").build();
        Assert.assertEquals("dumbbell curls", ex.getName());
    }
    
    @Test
    public void update() 
    {
        Excercise ex = new Excercise.Builder("9478").name("dumbbell press").primaryTarget("chest/shoulders").build();
        Assert.assertEquals("dumbbell press", ex.getName());
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
