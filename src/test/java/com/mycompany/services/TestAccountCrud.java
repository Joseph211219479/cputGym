/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.services;

import com.mycompany.Gym.Account;
import com.mycompany.Services.AccountCrudServ;
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
public class TestAccountCrud {
    
    public TestAccountCrud() {
    }
    
     @Mock
    AccountCrudServ accountobj;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        accountobj = Mockito.mock(AccountCrudServ.class);
    }

    @Test
    public void testCreate() throws Exception {
        Account accountTemp = new Account.Builder("1285").accountHolder("Joseph").amountDue(234.55).build();
        Account returnQuestion = accountobj.persist(accountTemp);
        when(accountobj.persist(accountTemp)).thenReturn(returnQuestion);
        Mockito.verify(accountobj).persist(accountTemp);
    }

    @Test
    public void testRead() throws Exception {
         Account accountTemp = new Account.
                 Builder("1285").
                 accountHolder("Joseph").
                 amountDue(234.55).
                 build();
        Account returnAccount = accountobj.find(accountTemp.getAccountId());
        when(accountobj.find(accountTemp.getAccountId())).thenReturn(returnAccount);
        Mockito.verify(accountobj).
                                find(accountTemp.getAccountId());

    }
    @Test
    public void testUpdate() throws Exception {
        Account accountTemp = new Account.
                 Builder("1285").
                 accountHolder("Joseph").
                 amountDue(234.55).
                 build();
        
        Account accountUpdate = new Account.
                 Builder("1285").
                 amountDue(123.55).
                 build();
        
        accountTemp = accountobj.merge(accountUpdate);
        when(accountobj.merge(accountUpdate)).thenReturn(accountTemp);
        Mockito.verify(accountobj).merge(accountUpdate);
         

    }

    @Test
    public void testDelete() throws Exception {

         Account accountTemp = new Account.Builder("1285").accountHolder("Joseph").amountDue(234.55).build();
        Account returnAccount = accountobj.remove(accountTemp);
        when(accountobj.remove(accountTemp)).thenReturn(returnAccount);
        Mockito.verify(accountobj).remove(accountTemp);

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

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
