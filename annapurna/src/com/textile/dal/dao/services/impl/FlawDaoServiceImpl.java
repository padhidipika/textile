/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.dal.dao.services.impl;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import com.textile.dal.hibernate.entity.flaw.FabricFlaw;
import com.textile.dal.properties.HBMEntitiesRepo;
import com.textile.dal.hibernate.util.HibernateUtil;
import com.textile.dal.dao.services.api.FlawDaoService;

/**
 *
 * @author dipuviky
 */
public class FlawDaoServiceImpl implements FlawDaoService {

    @Override
    public void insertFlaw(String flawName, String flawDescription) throws Exception {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            FabricFlaw flaw = new FabricFlaw(flawName, flawDescription);
            session.save(flaw);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception ("Exception while adding flaw ", e);
        }
    }

    @Override
    public void updateFlaw(int flawId, String flawName, String flawDescription) throws Exception {
       try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            FabricFlaw flaw = new FabricFlaw(flawName, flawDescription);
            flaw.setFlawId(flawId);
            session.update(flaw);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception ("Exception while updating flaw ", e);
        }
    }

    @Override
    public void deleteFlaw(int flawId) throws Exception {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            FabricFlaw flaw = new FabricFlaw();
            flaw.setFlawId(flawId);
            session.delete(flaw);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception ("Exception while deleting flaw ", e);
        }    
    }

    @Override
    public List getFlawList() throws Exception{
        try {
           List flawList = executeHQLQuery("from " + HBMEntitiesRepo.FLAW_ENTITY); 
           return flawList; 
        } catch (Exception e) {
            throw new Exception ("Exception while retrieving flaw list", e);
        }
    }

    private List executeHQLQuery(String hql) throws Exception{
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List resultList = q.list();
            
            session.getTransaction().commit();
            return resultList;
        } catch (HibernateException he) {
            throw new Exception ("Exception while retrieving flaw list", he);
        }
    }

}
