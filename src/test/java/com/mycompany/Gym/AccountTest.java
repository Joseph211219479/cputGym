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
public class AccountTest {
    
    public AccountTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCreation() 
     {
         Account obj = new Account.Builder("479").
                                    accountHolder("Joseph").
                                    amountDue(150.00).
                                    build();
         Assert.assertEquals("Joseph",obj.getAccountHolder(),"Creation error");
                 
     }
     @Test
     public void testUpdate()
     {
         Account obj = new Account.Builder("479").
                                    accountHolder("hitman").
                                    amountDue(150.00).
                                    build();
         Assert.assertEquals("hitman",obj.getAccountHolder(),"update error");
         Assert.assertEquals(150.00,obj.getAmountDue(),"update error");
             
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
