/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Services.implementation;

import com.mycompany.Gym.Invoice;
import com.mycompany.Services.InvoiceCrudServ;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class InvoiceCrudImpl implements InvoiceCrudServ {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Invoice find(String id) {
return null;    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Invoice persist(Invoice entity) {
return null;      }

     @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Invoice merge(Invoice entity) {
return null;      }

     @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Invoice remove(Invoice entity) {
return null;      }

     @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Invoice> findAll() {
return null;      }
    
}
