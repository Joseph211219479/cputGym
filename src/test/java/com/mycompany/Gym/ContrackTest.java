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
public class ContrackTest {
    
    public ContrackTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createContrack() 
     {
         Contrack obj = new Contrack.Builder("435").
                                     type("debit").
                                     signUp("02/02/2014").
                                     endDate("02/02/2015").
                                     duration("1 year").
                                     build();
       
         Assert.assertEquals("debit",obj.gettype());
         Assert.assertEquals("02/02/2014",obj.getsignUp());
         Assert.assertEquals("1 year",obj.getduration());
         
         
     }
     
     @Test
     public void editContrack()
     {
         Contrack obj = new Contrack.Builder("435").
                                     type("cash").
                                     signUp("02/02/2014").
                                     endDate("02/02/2015").
                                     duration("1 year").
                                     build();
       
         Assert.assertEquals("cash",obj.gettype(),"contrack not created");
         Assert.assertEquals("02/02/2014",obj.getsignUp(),"get signup date error");
         Assert.assertEquals("1 year",obj.getduration(),"duration error");
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
