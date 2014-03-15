/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Services.implementation;

import com.mycompany.Gym.Contack;
import com.mycompany.Services.ContackCrudServ;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class ContackCrudImpl implements ContackCrudServ {

     @Transactional (propagation = Propagation.SUPPORTS)
    public Contack find(String id) {
return null;    }

     @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Contack persist(Contack entity) {
return null;     }

    
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Contack merge(Contack entity) {
return null;     }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Contack remove(Contack entity) {
return null;     }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Contack> findAll() {
return null;     }
    
}
