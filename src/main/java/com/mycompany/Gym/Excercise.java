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
public final class Excercise {
    private String excersiceId;
    private String name;
    private String primaryTarget;
    
    private Excercise(){    }
    private Excercise(Builder build)
    {
        this.excersiceId = build.excersiceId;
        this.name = build.name;
        this.primaryTarget = build.primaryTarget;
    }

    public String getExcersiceId() {
        return excersiceId;
    }

    public String getName() {
        return name;
    }

    public String getPrimaryTarget() {
        return primaryTarget;
    }
    
    
    
    public static class Builder
    {
        private String excersiceId;
        private String name;
        private String primaryTarget;
        
        public Builder(String excersiceId)
        {
            this.excersiceId = excersiceId;
        }
        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        public Builder primaryTarget(String primaryTarget)
        {
            this.primaryTarget = primaryTarget;
            return this;
        }
        
        public Excercise build()
        {
            return new Excercise(this);
                }
    }
    
    @Override
    public int hashCode()
            {
                int hash = Integer.parseInt(excersiceId);
                return hash;
            }
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null || getClass()!= obj.getClass())
            return false;
        if(this== obj)
            return true;
        
        Excercise excercise =( Excercise) obj;
        if(!excersiceId.equals(excercise.excersiceId))
            return false;
        return true;
    }
    
    
}
