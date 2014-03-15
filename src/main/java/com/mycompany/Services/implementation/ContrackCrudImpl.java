/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Services.implementation;

import com.mycompany.Gym.Contrack;
import com.mycompany.Services.ContrackCrudServ;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class ContrackCrudImpl implements ContrackCrudServ {
    
    @Override
    @Transactional (propagation = Propagation.SUPPORTS)
    public Contrack find(String id) {
return null;    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Contrack persist(Contrack entity) {
return null;    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Contrack merge(Contrack entity) {
return null;    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Contrack remove(Contrack entity) {
return null;    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Contrack> findAll() {
return null;    }
    
}
