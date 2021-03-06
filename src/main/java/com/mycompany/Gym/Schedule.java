/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Gym;

import java.util.List;

/**
 *
 * @author student
 */
public final class Schedule {
    private  String scheduleId;
    private String date;
    private String time;
    private boolean full;
    private List<Member> member;
    private List<Trainer> trainer;
    // private boolean full;
     
     public boolean getFull()
     {
         return full;
     }
     

    public String getScheduleId() {
        return scheduleId;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public boolean isFull() {
        return full;
    }

    public List<Member> getMember() {
        return member;
    }

    public List<Trainer> getTrainer() {
        return trainer;
    }
    
    private Schedule(){}
    private Schedule(Builder builder)
    {
        this.date = builder.date;
        this.full = builder.full;
        this.time = builder.time;
        this.member = builder.member;
        this.trainer = builder.trainer;
    }
    
    public static class Builder
    {
        private String date;
        private String time;
        private  String scheduleId;
        private boolean full;
        private List<Member> member;
        private List<Trainer> trainer;
        
        public Builder(String date , String time)
        {
            this.date = date;
            this.time = time;
            this.scheduleId=  date + time;
        }
        public Builder full(boolean full)
        {
            this.full = full;
            return this;
        }
        public Builder member(List<Member> member)
        {
            this.member = member;
            return this;
        }
        public Builder trainer(List<Trainer> trainer)
        {
            this.trainer = trainer;
            return this;
        }
        
        Schedule build()
        {
            return new Schedule(this);
        }
    }
    
    @Override
    public int hashCode()
    {
        int hash = 999;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null || getClass() != obj.getClass())
            return false;
        if(this == obj)
            return true;
        
        Schedule shedule = (Schedule)obj ;
        if(!scheduleId.equals(shedule.getScheduleId()))
            return false;
        
        return true;
    }
    
    
}
