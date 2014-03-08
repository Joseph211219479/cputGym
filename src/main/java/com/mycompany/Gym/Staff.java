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
public final class Staff {
    private String name;
    private String number;
    private String staffId;
    //Maintenance string maintenace ;
    private boolean isTrainer;

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getStaffId() {
        return staffId;
    }

    public boolean isIsTrainer() {
        return isTrainer;
    }
    
    
    
    private Staff(){}
    private Staff(Builder build)
    {
        this.staffId = build.staffId;
        this.isTrainer = build.isTrainer;
        this.name = build.name;
        this.number = build.number;
    }
    public static class Builder
            {
                private String name;
                private String number;
                private String staffId;
                //Maintenance string maintenace ;
                private boolean isTrainer;
                
                public Builder(String staffId)
                {
                    this.staffId = staffId;
                }
                public Builder name(String name)
                {
                    this.name = name;
                    return this;
                }
                public Builder number(String number)
                {
                    this.number = number;
                    return this;
                }
                public Builder staffId(String staffId)
                {
                    this.staffId = staffId;
                    return this;
                }
                public Builder isTrainer(String certified )
                {
                    if(certified == "yes")
                    {
                        this.isTrainer = true;
                    }
                    else 
                        this.isTrainer = false;
                    return this;
                }
                
                public Staff builder()
                {
                    return new Staff(this);
                }
            }
            @Override
            public int hashCode()
            {
                int hash = Integer.parseInt(staffId);
                return hash;
            }
            @Override
            public boolean equals(Object obj)
            {
                if(obj == null || getClass() != obj.getClass())
                    return false;
                if(this == obj)
                    return true;
                
                Staff staff = (Staff) obj;
                if(!staffId.equals(staff.staffId))
                    return false;
                return true;
            }
}
