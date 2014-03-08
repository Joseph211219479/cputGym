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
public final class Supplier {
    private String name;
    private String number;
    private String supId;
    
    private Supplier(){}
    private Supplier(Build build)
    {
        this.name = build.name;
        this.number = build.number;
        this.supId = build.supId;
      
            
        }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getSupId() {
        return supId;
    }
      
        public static class Build
        {
            private String name;
    private String number;
    private String supId;
    
            public Build(String supId)
            {
                this.supId = supId;
            }
            public Build number(String number)
            {
                this.number = number;
                return this;
            }
            public Build name(String name)
            {
                this.name = name;
                return this;
            }
            
            Supplier build()
            {
                return new Supplier(this);
            }
    }
        @Override
            public int hashCode()
            {
                int hash = Integer.parseInt(supId);
                return hash;
            }
            @Override
            public boolean equals(Object obj)
            {
                if(obj == null || getClass() != obj.getClass())
                    return false;
                if(this == obj)
                    return true;
                
                Supplier staff = (Supplier) obj;
                if(!supId.equals(staff.supId))
                    return false;
                return true;
            }
    
}
