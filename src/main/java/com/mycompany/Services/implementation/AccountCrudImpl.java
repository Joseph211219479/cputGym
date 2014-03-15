/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Services.implementation;

import com.mycompany.Gym.Account;
import com.mycompany.Services.AccountCrudServ;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class AccountCrudImpl implements AccountCrudServ {
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Account find(String id) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Account persist(Account entity) {
    return null;
    }

    @Override
    @Transactional (propagation = Propagation.REQUIRES_NEW)
    public Account merge(Account entity) {
    return null;
    }
    
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Account remove(Account entity) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List findAll() {
    return null;
    }

   
    
}
