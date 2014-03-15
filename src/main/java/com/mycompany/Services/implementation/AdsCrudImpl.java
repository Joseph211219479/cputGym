/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Services.implementation;

import com.mycompany.Gym.Ads;
import com.mycompany.Services.AdsCrudServ;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class AdsCrudImpl implements AdsCrudServ{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Ads find(String id) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Ads persist(Ads entity) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Ads merge(Ads entity) {
    return null;
    }
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Ads remove(Ads entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Ads> findAll() {
        return null;
    }
    
    
}
