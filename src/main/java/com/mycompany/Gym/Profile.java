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
public final class Profile {
    
    private String name;
    private String surname;
    private int age;
    private double weight;
    private double height;
    private String goal;
    private String memberId;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getGoal() {
        return goal;
    }

    public String getMemberId() {
        return memberId;
    }
    
    
    private Profile(){}
    private Profile(Builder build)
    {
        this.name = build.name;
        this.age = build.age;
        this.goal = build.goal;
        this.height = build.height;
        this.weight = build.weight;
        this.surname = build.surname;
        this.memberId = build.memberId;
    }
    
    public static class Builder
    {
        private String name;
        private String surname;
         private int age;
        private double weight;
        private double height;
        private String goal;
        private String memberId;
        
        public Builder(){};
        public Builder(String memberId)
        {
            this.memberId = memberId;
        }
        public Builder goal(String goal)
        {
            this.goal = goal;
            return this;
        }
        public Builder height (double height)
        {
            this.height = height;
            return this;
        }
        public Builder weight(double weight)
        {
            this.weight = weight;
            return this;
        }
        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        public Builder age(int age)
        {
            this.age = age;
            return this;
        }
        public Builder surname(String surname)
        {
            this.surname = surname;
            return this;
        }
        
        public Profile build()
        {
            return new Profile(this);
        }
    }
    
    @Override
    public int hashCode()
            {
                int hash = Integer.parseInt(memberId +weight +height );
                return  hash;
            }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null || getClass() != obj.getClass())
            return false;
        if(this == obj)
            return true;
        
        Profile profile =  (Profile)obj;
        if(!memberId.equals(profile.memberId))
            return false;
        
        return true;
        
    }
            
    
}
