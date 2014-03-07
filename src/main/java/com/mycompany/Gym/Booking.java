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
public final class Booking {
    private List<Member> member;
    //private List<Schedule> schedule;
    private String bookingId;
    private int avail;
    
    private Booking(){}
    
    private Booking (Builder builder)
    {
        this.member = builder.member;
        //this.schedule = builder.schedule;
        this.bookingId = builder.bookingId;
        this.avail = builder.avail;
        
    }

    public List<Member> getMember() {
        return member;
    }

    public String getBookingId() {
        return bookingId;
    }
    public int getAvail()
    {
        return avail;
    }
    
    public static class Builder
    {
        private List<Member> member;
        //private List<Schedule> schedule;
        private String bookingId;
        private int avail;
        
        public Builder(String bookingId)
        {
            this.bookingId = bookingId;
        }
        public Builder avail(int avail)
        {
            this.avail = avail;
            return this;
        }
        public Builder member(List<Member> member)
        {
            this.member = member;
            return this;
        }
        /////////
        
        
        
        /////////
        public Booking builder()
        {
            return new Booking(this);
        }
    }
    
    @Override
    public int hashCode()
    {
        int hash = Integer.parseInt(bookingId);
        return hash;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null || getClass() != obj.getClass())
            return false;
        if(this == obj)
            return true;
        
        Booking booking = (Booking) obj;
        if(!bookingId.equals(booking.bookingId))
            return false;
        
        return true;
    }
            
    
}
