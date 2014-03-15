/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Services.implementation;

import com.mycompany.Gym.Compitition;
import com.mycompany.Services.CompititionCrudServ;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class CompititionCrudImpl implements CompititionCrudServ {

    @Transactional (propagation = Propagation.SUPPORTS)
    public Compitition find(String id) {
return null;    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Compitition persist(Compitition entity) {
return null;    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Compitition merge(Compitition entity) {
return null;    }

     @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Compitition remove(Compitition entity) {
return null;    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Compitition> findAll() {
return null;    }
    
}
