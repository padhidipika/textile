/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.services.impl;


import com.textile.dal.hibernate.util.HibernateUtil;
import com.textile.dal.properties.HBMEntitiesRepo;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import com.textile.dal.hibernate.entity.employee.*;
import com.textile.services.api.EmployeeService;

        
 /**
 *
 * @author Gaurav
 */
public class EmployeeServiceImpl implements EmployeeService {
    
     @Override
     public void insertEmployee(String firstName, String middleName,String lastName,String address,String city,String state,int pincode,String dateOfBirth,String emailId) throws Exception {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Employee emp = new Employee(firstName, middleName,lastName,address,city,state,pincode,dateOfBirth,emailId);
            session.save(emp);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception ("Exception while adding employee ", e);
        }
    }
    @Override
    public void updateEmployee(int empId,String firstName, String middleName,String lastName,String address,String city,String state,int pincode,String dateOfBirth,String emailId) throws Exception {
       try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Employee emp = new Employee(firstName, middleName,lastName,address,city,state,pincode,dateOfBirth,emailId);
            emp.setempId(empId);
            session.update(emp);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception ("Exception while updating employee ", e);
        }
    }
    @Override
    public void deleteEmployee(int empId) throws Exception {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Employee emp = new Employee();
            emp.setempId(empId);
            session.delete(emp);
            session.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception ("Exception while deleting employee ", e);
        }    
    }

    @Override
    public List getEmployeeList() throws Exception{
        try {
           List empList = executeHQLQuery("from " + HBMEntitiesRepo.EMPLOYEE_ENTITY); 
           return empList; 
        } catch (Exception e) {
            throw new Exception ("Exception while retrieving employee list", e);
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
            throw new Exception ("Exception while retrieving employee list", he);
        }
    }

}
