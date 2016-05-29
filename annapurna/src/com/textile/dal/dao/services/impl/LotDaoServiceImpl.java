/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.dal.dao.services.impl;

import com.textile.dal.hibernate.entity.flaw.FabricFlaw;
import com.textile.dal.hibernate.entity.lot.*;
import com.textile.dal.hibernate.util.HibernateUtil;
import com.textile.dal.properties.HBMEntitiesRepo;
import com.textile.dto.ComboItem;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import com.textile.dal.dao.services.api.LotDaoService;

/**
 *
 * @author Gaurav
 */
public class LotDaoServiceImpl  implements LotDaoService {

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
    
    
    @Override
    public List<ComboItem> getComboItems(String defaultItem) throws Exception {
        List<ComboItem> lotItems =  new ArrayList<>();
        ComboItem item =   new ComboItem(0, "-" + defaultItem + "-");
        lotItems.add(item);
        try {
           List results = getLotList();
            for (Object o : results) {
                Lot lot = (Lot) o;
                item = new ComboItem(lot.getLotId(), String.valueOf(lot.getLotNumber()));
                lotItems.add(item);
            }
           return lotItems; 
        } catch (Exception e) {
            throw new Exception ("Exception while retrieving combo items for lot", e);
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
