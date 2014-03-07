package com.mycompany.Gym;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import java.lang.reflect.Member;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */

public class MemberTest {
    
    public MemberTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TestCreation() throws Exception
     {
         Member mobj = new Member.Builder("1234").firstName("Joseph").lastName("Davids").build();
         Assert.assertEquals("Joseph", mobj.getName(), "Your member was created");
     }
     
     @Test
     public void TestEdit()
     {
         Member mobj = new Member.Builder("1234").firstName("Hitman").lastName("Davids").build();
         Assert.assertEquals("Hitman", mobj.getName(), "Your member was updated");
         Assert.assertEquals("Davids",mobj.getSurname());
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
