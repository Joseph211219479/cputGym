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
public final class Compitition {
    private String name;
    private String date;
    private String prize;
    private String id;
    
    private Compitition(){}
    private Compitition(Build build)
    {
        this.date = build.date;
        this.id = build.id;
        this.name = build.name;
        this.prize = build.prize;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getPrize() {
        return prize;
    }

    public String getId() {
        return id;
    }
    
    
    
    public static class Build
    {
        private String name;
    private String date;
    private String prize;
    private String id;
    
        public Build(String id)
        {
            this.id = id;
        }
        public Build name(String name)
        {
            this.name = name;
            return this;
        }
        public Build prize(String prize)
        {
            this.prize = prize;
            return this;
        }
        public Build date(String date)
        {
            this.date = date;
            return this;
        }
        Compitition build()
        {
            return new Compitition(this);
        }
    }
    
    @Override
    public int hashCode()
            {
                int hash = Integer.parseInt(id);
                return hash;
            }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null || getClass()!= obj.getClass())
            return false;
        if(this== obj)
            return true;
        
        Compitition compitition =( Compitition) obj;
        if(!id.equals(compitition.id))
            return false;
        return true;
    }
    
}
