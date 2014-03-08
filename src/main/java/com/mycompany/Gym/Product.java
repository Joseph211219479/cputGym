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
public class Product {
    private String name;
    private String id;
    private int stockAmount;
    private double price;
    
    private Product(){}
    private Product(Builder build)
    {
        this.id = build.id;
        this.name = build.name;
        this.price = build.price;
        this.stockAmount = build.stockAmount;
    }
    
    public static class Builder
    {
        private String name;
        private String id;
        private int stockAmount;
        private double price;
        
        public Builder(String id)
        {
            this.id = id;
        }
        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        public Builder stockAmount(int amount)
        {
            stockAmount = amount;
            return this;
        }
        public Builder price(double price)
        {
            this.price = price;
            return this;
        }
        public Product build()
        {
            return new Product(this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Product other = (Product) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public double getPrice() {
        return price;
    }
    
    
}
