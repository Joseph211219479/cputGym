/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Services.implementation;

import com.mycompany.Gym.Excercise;
import com.mycompany.Services.ExcersiceCrudServ;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class ExcersiceCrudImpl implements ExcersiceCrudServ{

     @Override
    @Transactional (propagation = Propagation.SUPPORTS)
    public Excercise find(String id) {
return null;    }

     @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Excercise persist(Excercise entity) {
return null;    }

     @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Excercise merge(Excercise entity) {
return null;    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
        public Excercise remove(Excercise entity) {
return null;    }

   @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Excercise> findAll() {
return null;    }
    
}
