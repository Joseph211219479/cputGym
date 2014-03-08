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
public final class PayRoll {
     private int staffId;
    private double amount;
    private List<Staff> staff;
    
    private PayRoll()
    {}
    
    private PayRoll( Builder builder )
    {
        amount = builder.amount;
        staffId = builder.staffId;
        staff = builder.staff;
    }
    
    public static class Builder
    {
        private int staffId;
        private double amount;
        private List<Staff> staff;
        
        public Builder( double amount )
        {
            this.amount = amount;
        }
        
        public Builder staffId( int value )
        {
            staffId = value;
            return this;
        }
        
        public Builder staff( List<Staff> values )
        {
            staff = values;
            return this;
        }
        
        public PayRoll build()
        {
            return new PayRoll(this);
        }
    }

    public int getStaffId() {
        return staffId;
    }

    public double getAmount() {
        return amount;
    }

    public List<Staff> getStaff() {
        return staff;
    }
    
    

    @Override
    public int hashCode() {
        int hash =  16 * this.staffId;
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
        final PayRoll other = (PayRoll) obj;
        if (this.staffId != other.staffId) {
            return false;
        }
        return true;
    }
}
