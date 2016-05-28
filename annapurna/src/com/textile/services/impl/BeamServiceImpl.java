/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.services.impl;

import com.textile.dal.hibernate.entity.beam.*;
import com.textile.dal.hibernate.util.HibernateUtil;
import com.textile.dal.properties.HBMEntitiesRepo;
import com.textile.services.api.BeamService;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Gaurav
 */
public class BeamServiceImpl implements BeamService {

    @Override
    public void insertBeam(int beamSno, int lotId, int machineId, int noOfTaka, long meterPerTaka, long totalMeter, String issueDate, String completionDate) throws Exception {
         try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Beam bm = new Beam( beamSno,lotId,machineId,noOfTaka,meterPerTaka,totalMeter,issueDate,completionDate);
            session.save(bm);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception ("Exception while adding Beam ", e);
        }
    }

    @Override
    public void updateBeam(int beamId, int beamSno, int lotId, int machineId, int noOfTaka, long meterPerTaka, long totalMeter, String issueDate) throws Exception {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Beam bm = new Beam( beamSno,lotId,machineId,noOfTaka,meterPerTaka,totalMeter,issueDate);
            bm.setBeamId(beamId);
            session.update(bm);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception ("Exception while updating beam ", e);
        }
    }

    @Override
    public void updateDateOfCompletion(int beamId, String completionDate) throws Exception {
       try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Beam bm = new Beam( beamId,completionDate);
            bm.setBeamId(beamId);
            session.update(bm);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception ("Exception while updating beam ", e);
        }
    }

    @Override
    public void deleteBeam(int beamId) throws Exception {
         try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Beam bm = new Beam();
            bm.setBeamId(beamId);
            session.delete(bm);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception ("Exception while deleting beam ", e);
        }    
    }

    @Override
    public List getBeamList() throws Exception {
         try {
           List beamList = executeHQLQuery("from " + HBMEntitiesRepo.BEAM_ENTITY); 
           return beamList; 
        } catch (Exception e) {
            throw new Exception ("Exception while retrieving beam list", e);
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
            throw new Exception ("Exception while retrieving beam list", he);
        }
    }
}
