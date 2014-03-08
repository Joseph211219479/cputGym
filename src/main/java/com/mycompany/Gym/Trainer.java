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
public final class Trainer {
    private String name;
    private String trainerId;
    private String number;
    
    private Trainer(){}
    private Trainer(Build builder)
    {
        this.name = builder.name;
        this.trainerId = builder.trainerId;
        this.number = builder.number;
    }

    public String getName() {
        return name;
    }

    public String getTrainerId() {
        return trainerId;
    }

    public String getNumber() {
        return number;
    }
    
    public static class Build
    {
        private String name;
        private String trainerId;
        private String number;
        
        public Build(String trainerId)
        {
            this.trainerId = trainerId;
        }
        public Build name(String name)
        {
            this.name = name;
            return this;
        }
        public Build number(String number)
        {
            this.number = number;
            return this;
        }
        public Trainer builder()
        {
            return new Trainer(this);
        }
    }
    
    @Override
    public int hashCode()
    {
        int hash = Integer.parseInt(trainerId);
        return hash;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null || getClass() != obj.getClass())
            return false;
        if(obj == this)
            return true;
        
        Trainer trainer = (Trainer) obj;
        if(!trainerId.equals(trainer.trainerId))
            return false;
        return true;
    }
    
}
