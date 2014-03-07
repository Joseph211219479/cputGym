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
public class Contack {
    private String name ;
    private String number;
    
    //private Contack(){}
    private Contack(Builder builder)
    {
        this.name = builder.name;
        this.number = builder.number;
        
    }
    
    public String getName()
    {
        return name;
    }
    
    public static class Builder
    {
         private String name ;
         private String number;
         
         public Builder(){};
         public Builder(String number)
         {
             this.number = number;
         }
         
         public Builder name(String name)
         {
             this.name = name;
             return this;
         }
         
         public Contack build()
         {
             return new Contack(this);
         }
    }
    
    @Override
    public int hashCode()
    {
        int hash = Integer.parseInt(number);
        return hash;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null || getClass() != obj.getClass())
            return false;
        if(obj == this)
            return true;
        
        Contack contack = (Contack) obj;
        if(!number.equals(contack.number))
              return false;
        return true;
    }
    
}
