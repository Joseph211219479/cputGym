/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Services.implementation;

import com.mycompany.Services.EquipmentCrudServ;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class EquipmentCrudImpl implements EquipmentCrudServ {

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Object find(Object id) {
return null;    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Object persist(Object entity) {
return null;    }

     @Override
    @Transactional (propagation = Propagation.REQUIRES_NEW)
    public Object merge(Object entity) {
return null;    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Object remove(Object entity) {
return null;    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List findAll() {
return null;    }
    
}
