/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.services;

import com.mycompany.Gym.Ads;
import com.mycompany.Services.AdsCrudServ;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
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
public class TestAdsCrud {
    
    public TestAdsCrud() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Mock
     private static AdsCrudServ adsObj ;
    
     @BeforeMethod
     public void setUp() throws Exception
     {         
         MockitoAnnotations.initMocks(this);
        adsObj = Mockito.mock(AdsCrudServ.class);
     }
     
     @Test
     public void testCreate() throws Exception
     {
         Ads ad = new Ads.Build("98645").
                endDate("23/04/2014").
                startdate("10/04/2014").
                build();
         
         Ads returnAds = adsObj.persist(ad);
        when(adsObj.persist(ad)).thenReturn(returnAds);
        Mockito.verify(adsObj).persist(ad);
     }
     
     @Test
     public void testRead() throws Exception
     {
         Ads ad = new Ads.Build("98645").
                endDate("23/04/2014").
                startdate("10/04/2014").
                build();

         Ads returnAds = adsObj.
                 find(ad.getId());
        when(adsObj.persist(ad)).thenReturn(returnAds);
        Mockito.verify(adsObj).find(ad.getId());
     }
     
     @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

      //   Account accountTemp = new Account.Builder("1285").accountHolder("Joseph").amountDue(234.55).build();

    //    Account returnAccount = accountobj.merge(accountTemp);
  //      when(accountobj.merge(accountTemp)).thenReturn(returnAccount);
//        Mockito.verify(accountobj).merge(returnAccount);

    }
    
     @Test
    public void testDelete() throws Exception {

         Ads ad = new Ads.Build("98645").
                endDate("23/04/2014").
                startdate("10/04/2014").
                build();
        Ads returnAccount = adsObj.remove(ad);
        when(adsObj.remove(ad)).thenReturn(returnAccount);
        Mockito.verify(adsObj).remove(ad);

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
