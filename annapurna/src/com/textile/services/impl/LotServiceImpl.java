/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.services.impl;

import com.textile.dal.hibernate.entity.lot.*;
import com.textile.dal.hibernate.util.HibernateUtil;
import com.textile.dal.properties.HBMEntitiesRepo;
import com.textile.services.api.LotService;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Gaurav
 */
public class LotServiceImpl  implements LotService {

    @Override
    public void insertLot(int lotNumber, int takaSno) throws Exception {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Lot lt = new Lot(lotNumber,takaSno);
            session.save(lt);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception ("Exception while adding lot ", e);
        }
    }

    @Override
    public void updateLot(int lotId, int lotNumber, int takaSno) throws Exception {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Lot lt = new Lot(lotNumber,takaSno);
            lt.setLotId(lotId);
            session.update(lt);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception ("Exception while updating Lot ", e);
        }
    }

    @Override
    public void deleteLot(int lotId) throws Exception {
     try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Lot lt = new Lot();
            lt.setLotId(lotId);
            session.delete(lt);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception ("Exception while deleting lot ", e);
        }       
    }

    @Override
    public List getLotList() throws Exception {
     try {
           List lotList = executeHQLQuery("from " + HBMEntitiesRepo.LOT_ENTITY); 
           return lotList; 
        } catch (Exception e) {
            throw new Exception ("Exception while retrieving lot list", e);
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
            throw new Exception ("Exception while retrieving lot list", he);
        }
    }
 
}
