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
public final class Sales {
    private List<Product> product;
    private int amount;
    private double price;
    private List<Invoice> invoice;
    private int id;
    
    private Sales(){}
    private Sales(Build build)
    {
        this.amount = build.amount;
        this.price = build.price;
        this.product = build.product;
    }
    
    public static class Build
    {
        private List<Product> product;
    private int amount;
    private double price;
    private List<Invoice> invoice;
    private int id;
    
        public Build(int id)
        {
            this.id = id;
        }
        public Build amount(int amount)
        {
            this.amount = amount;
            return this;
        }
        public Build price(double price)
        {
            this.price = price;
            return this;
        }
        public Build invoice(List<Invoice> invoice)
        {
            this.invoice = invoice;
            return this;
        }
        public Sales build()
        {
            return new Sales(this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.id;
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
        final Sales other = (Sales) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public List<Product> getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public List<Invoice> getInvoice() {
        return invoice;
    }

    public int getId() {
        return id;
    }
    
}
