/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Gym;

import java.util.Date;

/**
 *
 * @author student
 */
public final class Contrack {
    private String type;
    private String contrackCode;
    private String signUp;
    private String endDate;
    private  String duration;
    
    private Contrack(){}
    
    private Contrack(Builder builder)
    {
        contrackCode = builder.contrackCode;
        signUp = builder.signUp;
        type = builder.type;
        endDate = builder.endDate;
        duration = builder.duration;
    }
    
    public String getduration()
    {
        return duration;
    }
    public String getendDate()
    {
        return endDate;
    }
    public String getsignUp()
    {
        return signUp;
    }
    public String gettype()
    {
        return type;
    }
    
    
    public static class Builder
    {
         private String type;
        private  String contrackCode;
        private  String signUp;
        private  String endDate;
        private  String duration;
        
        public Builder(String val)
        {
            this.contrackCode = val;
        }
        
        public Builder duration(String val)
        {
            duration= val;
            return this;
        }
        
        public Builder endDate(String val)
        {
            endDate= val;
            return this;
        }
        public Builder type(String val)
        {
            type= val;
            return this;
        }
        public Builder signUp(String val)
        {
            signUp = val;
            return this;
        }
        
        public Contrack build()
        {
            return new Contrack(this);
        }
    }
    
    @Override
    public int hashCode()
    {
        int hash = Integer.parseInt(contrackCode);
        return hash;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
            return false;
        if(obj == this)
            return true;
        if(getClass() != obj.getClass() )
        {
            return false;
        }
        
        Contrack contrack = (Contrack) obj;
        if(!contrackCode.equals(contrack.contrackCode))
            return false;
                
        return true;
    }
    
    
    
}
