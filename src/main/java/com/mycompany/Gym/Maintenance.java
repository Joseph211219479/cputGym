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
public final class Maintenance {
    private List<Equipment> equipment ;
    private String date;
    private double costs;
    private List<Staff> staff;
    
    private Maintenance(){}
    private Maintenance(Builder build)
    {
        this.costs = build.costs;
        this.date = build.date;
        this.staff = build.staff;
        this.equipment = build.equipment;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public String getDate() {
        return date;
    }

    public double getCosts() {
        return costs;
    }

    public List<Staff> getStaff() {
        return staff;
    }
    
    
    
    public static class Builder
    {
        private List<Equipment> equipment ;
        private String date;
        private double costs;
        private List<Staff> staff;
        
        
        public Builder(String date)
        {
            this.date = date;
        }
        public Builder cost(double cost)
        {
            this.costs = cost;
            return this;
        }
        public Builder staff(List<Staff> staff)
        {
            this.staff = staff;
            return this;
        }
        public Builder equipment(List<Equipment> equipment)
        {
            this.equipment = equipment;
            return this;
        }
        public Maintenance build()
        {
            return new Maintenance(this);
        }
        
    }
    
    @Override
    public int hashCode()
            {
                return 12;
            }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null || getClass()!= obj.getClass())
            return false;
        if(this== obj)
            return true;
        
        Maintenance maintenance =( Maintenance) obj;
        if(!date.equals(maintenance.date))
            return false;
        return true;
    }
    
}
