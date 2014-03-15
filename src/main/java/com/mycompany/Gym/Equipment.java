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
public final class Equipment {
    private String name;
    private String code;
    private String buyDate;
    
    private Equipment(){}
    private Equipment(Builder build)
    {
        this.buyDate = build.buyDate;
        this.code = build.code;
        this.name = build.name;
    }
    
    public static class Builder
    {
        private String name;
        private String code;
        private String buyDate;
        
        public Builder(String code)
        {
            this.code = code;
        }
        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        public Builder buyDate(String buyDate)
        {
            this.buyDate = buyDate;
            return this;
        }
        public Equipment build()
        {
            return new Equipment(this);
        }
    }
    
     @Override
    public int hashCode()
            {
                int hash = Integer.parseInt(code);
                return hash;
            }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null || getClass()!= obj.getClass())
            return false;
        if(this== obj)
            return true;
        
        Equipment equipment =( Equipment) obj;
        if(!code.equals(equipment.code))
            return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getBuyDate() {
        return buyDate;
    }
    
    
}
