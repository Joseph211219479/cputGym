/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Services.implementation;

import com.mycompany.Gym.Member;
import com.mycompany.Services.MemberCrudServ;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class MemebrCrudImpl implements MemberCrudServ {

    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Member find(String id) {
return null;    }

    
    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Member persist(Member entity) {
return null;     }

    
     @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Member merge(Member entity) {
return null;     }

    
     @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Member remove(Member entity) {
return null;     }

    
     @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Member> findAll() {
return null;     }
    
}
