/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Gym;

/**
 *
 * @author student
 */
public class Account {
    private String accountId;
    private String accountHolder;
    private double amountDue;
    
    private Account(){}
    
    private Account(Builder build)
    {
        this.accountId      =  build.accountId;
        this.accountHolder  =  build.accountHolder;
        this.amountDue      =  build.amountDue;
                        
    }
    
         public String getAccountId()
         {
            return accountId;
         }
         public String getAccountHolder()
         {
             return accountHolder;
         }
         public double getAmountDue()
         {
             return amountDue;
         }
    
    public static class Builder
    {
           private String accountId;
           private String accountHolder;
           private double amountDue;
           
        public Builder(String accountId)
        {
            this.accountId = accountId;
        }
    
        
        public Builder amountDue(double amountDue)
        {
            this.amountDue = amountDue;
            return this;
        }
        public Builder accountHolder(String accountHolder)
        {
            this.accountHolder = accountHolder;
            return this;
        }
        
        public Account build()
        {
            return new Account(this);
        }
    }
    
    @Override
    public int hashCode()
    {
        int hash = Integer.parseInt(accountId);
        return hash;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null || getClass() != obj.getClass())
            return false;
        if(this ==obj)
            return true;
        
        Account account = (Account) obj;
        if(!accountId.equals(account.getAccountId()))
            return false;
        
            return true;
    }
      
}
