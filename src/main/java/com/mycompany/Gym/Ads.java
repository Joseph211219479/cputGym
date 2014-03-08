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
public final class Ads {
    
    private int id;
    private String startdate;
    private String endDate;
    
    private Ads(){}
    private Ads(Build build)
    {
        this.endDate = build.endDate;
        this.startdate = build.startdate;
        this.id = build.id;
    }
    
    public static class Build
    {
        private int id;
    private String startdate;
    private String endDate;
    
        public Build(int id)
        {
            this.id = id;
        }
        public Build startdate(String startdate)
        {
            this.startdate = startdate;
            return this;
        }
        public Build endDate(String endDate)
        {
            this.endDate = endDate;
            return this;
        }
        public Ads build()
        {
            return new Ads(this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ads other = (Ads) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public String getStartdate() {
        return startdate;
    }

    public String getEndDate() {
        return endDate;
    }
    
    
    
}
