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
public final class Visitor {

    private String name;
    private String visitorId;
    private String hostId;
    
    private Visitor(){}
    
    private Visitor(Builder build)
    {
        this.name = build.name;
        this.visitorId = build.visitorId;
        this.hostId = build.hostId;
    }
    
    public static class Builder
    {
         private String name;
        private String visitorId;
        private String hostId;
        
        public Builder(String visitorId)
        {
            this.visitorId = visitorId;
        }
        
        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        public Builder hostId(String hostId)
        {
            this.hostId = hostId;
            return this;
        }
        public Visitor build()
        {
            return new Visitor (this);
        }
    }
    
    public String getName() {
        return name;
    }

    public String getVisitorId() {
        return visitorId;
    }

    public String getHostId() {
        return hostId;
    }
    
    @Override
    public int hashCode()
            {
                int hash = Integer.parseInt(hostId + visitorId);
                return hash;
            }
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null || getClass() != obj.getClass())
            return false;
        if(this == obj)
            return true;
        
        Visitor visit = (Visitor) obj;
        if(!visitorId.equals(visit.getVisitorId()))
            return false;
        return true;
        
    }
    
}
