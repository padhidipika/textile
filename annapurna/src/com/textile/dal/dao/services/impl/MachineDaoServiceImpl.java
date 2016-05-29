/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.dal.dao.services.impl;

import com.textile.dal.hibernate.entity.lot.Lot;
import com.textile.dal.hibernate.entity.machine.*;
import com.textile.dal.hibernate.util.HibernateUtil;
import com.textile.dal.properties.HBMEntitiesRepo;
import com.textile.dto.ComboItem;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import com.textile.dal.dao.services.api.MachineDaoService;

/**
 *
 * @author Gaurav
 */
public class MachineDaoServiceImpl implements MachineDaoService {

    @Override
    public void insertMachine(int machineNumber) throws Exception {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Machine mch = new Machine(machineNumber);
            session.save(mch);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception ("Exception while adding machine ", e);
        }
    }

    @Override
    public void updateMachine(int machineId, int machineNumber) throws Exception {
       try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Machine mch = new Machine(machineNumber);
            mch.setMachineId(machineId);
            session.update(mch);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception ("Exception while updating machine ", e);
        }
    }

    @Override
    public void deleteMachine(int machineId) throws Exception {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Machine mch = new Machine();
            mch.setMachineId(machineId);
            session.delete(mch);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception ("Exception while deleting machine ", e);
        }    
    }

    @Override
    public List getMachineList() throws Exception{
        try {
           List machineList = executeHQLQuery("from " + HBMEntitiesRepo.MACHINE_ENTITY); 
           return machineList; 
        } catch (Exception e) {
            throw new Exception ("Exception while retrieving machine list", e);
        }
    }

     @Override
    public List<ComboItem> getComboItems(String defaultItem) throws Exception {
        List<ComboItem> machineItems =  new ArrayList<>();
        ComboItem item =   new ComboItem(0, "-" + defaultItem + "-");
        machineItems.add(item);
        try {
           List results = getMachineList();
            for (Object o : results) {
                Machine machine = (Machine) o;
                item = new ComboItem(machine.getMachineId(), String.valueOf(machine.getMachineNumber()));
                machineItems.add(item);
            }
           return machineItems; 
        } catch (Exception e) {
            throw new Exception ("Exception while retrieving combo items for machine", e);
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
            throw new Exception ("Exception while retrieving machine list", he);
        }
    }
    
}
