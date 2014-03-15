/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Services.implementation;

import com.mycompany.Gym.Booking;
import com.mycompany.Services.BookingCrudServ;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class BookingCrudImpl implements BookingCrudServ{

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Booking find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Booking persist(Booking entity) {
    return null;    }

     @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Booking merge(Booking entity) {
    return null;    }

     @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Booking remove(Booking entity) {
    return null;    }

     @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Booking> findAll() {
    return null;    }
    
}
