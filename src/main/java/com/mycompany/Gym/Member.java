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
public final class Member   {
    private String memberId;
    private String firstname;
    private String lastname;
    
    private Member(){ }
    
//    public String get
        
    
    private Member(Builder builder)
    {
       // memberId    = builder.memberId;
        firstname   = builder.firstname;
        lastname    = builder.lastname;
    }
    
    public static class Builder
    {
        private String memberId;
        private String firstname;
        private String lastname;
        
        public Builder(String memberId)
        {
            this.memberId = memberId;
        }
        public Builder firstName(String val)
        {
            firstname = val;
            return this;
        }
        public Builder lastName(String val)
        {
            lastname = val;
            return this;
        }
        
        public Member build()
        {
            return new Member(this);
        }
        
    }
    public String getName()
    {
        return firstname;
    }
    public String getSurname()
    {
        return lastname;
    }
    public String getId()
    {
        return memberId;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null || getClass() != obj.getClass() )
        {
            return false;
        }
        if(this == obj)
            return true;
        
        Member member = (Member) obj;
        
        if(!memberId.equals(member.memberId))
          return false;
        
        return true;
    }
    @Override
    public int hashCode()
    {
        int id = Integer.parseInt(memberId);
        return id;
    }
}
