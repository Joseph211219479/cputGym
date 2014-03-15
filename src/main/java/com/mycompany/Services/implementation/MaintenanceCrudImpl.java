/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Services.implementation;

import com.mycompany.Gym.Maintenance;
import com.mycompany.Services.MaintenanceCrudServ;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class MaintenanceCrudImpl implements MaintenanceCrudServ {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Maintenance find(String id) {
return null;    }

    
    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Maintenance persist(Maintenance entity) {
return null;      }

    
     @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Maintenance merge(Maintenance entity) {
return null;      }

    
     @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Maintenance remove(Maintenance entity) {
return null;      }

    
     @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Maintenance> findAll() {
return null;      }
    
}
