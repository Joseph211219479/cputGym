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
public final class Invoice {
    private double total;
    private List<Product> product;
    private int id;
    
    private Invoice(){}
    private Invoice(Build build)
    {
        this.product = build.product;
        this.id = build.id;
        this.total = build. total;
    }

    public double getTotal() {
        return total;
    }

    public List<Product> getProduct() {
        return product;
    }

    public int getId() {
        return id;
    }
    
    public static class Build
    {
        private double total;
        private List<Product> product;
        private int id;
        
        public Build(int id)
        {
            this.id = id;
        }
        public Build total(double total)
        {
            this.total = total;
            return this;
        }
        public Build product(List<Product> product)
        {
            this.product = product;
            return this;
        }
        public Invoice build()
        {
            return new Invoice(this);
        }
       
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.id;
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
        final Invoice other = (Invoice) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
            
}
