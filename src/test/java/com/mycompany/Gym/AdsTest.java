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
public class AdsTest {
    
    public AdsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void create() 
    {
        Ads ad = new Ads.Build("98645").
                endDate("23/04/2014").
                startdate("10/04/2014").
                build();
        Assert.assertEquals(98645, ad.getId());
        
    }
    
    @Test
    public void update() 
    {
        Ads ad = new Ads.Build("98645").
                endDate("15/04/2014").
                startdate("10/04/2014").
                build();
        Assert.assertEquals(98645, ad.getId());
        
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
