/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Services.implementation;

import com.mycompany.Gym.PayRoll;
import com.mycompany.Services.PayRollCrudServ;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class PayRollCrudImpl implements PayRollCrudServ {
@Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public PayRoll find(String id) {
return null;    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public PayRoll persist(PayRoll entity) {
return null;    }

     @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public PayRoll merge(PayRoll entity) {
return null;    }

     @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public PayRoll remove(PayRoll entity) {
return null;    }

     @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<PayRoll> findAll() {
return null;    }
    
}
