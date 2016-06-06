/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.dal.dao.services.api;

import com.textile.dal.hibernate.entity.employee.Employee;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gaurav
 */
public interface EmployeeDaoService {
    
    /**
     *
     * @param firstName
     * @param middleName
     * @param lastName
     * @param address
     * @param city
     * @param state
     * @param pincode
     * @param dateOfBirth
     * @param emailId
     * @throws java.lang.Exception
     */
    void insertEmployee(String firstName, String middleName,String lastName,String address,String city,String state,int pincode,Date dateOfBirth,String emailId ) throws Exception;

    /**
     *
     * @param empId
     * @param firstName
     * @param middleName
     * @param lastName
     * @param address
     * @param city
     * @param state
     * @param pincode
     * @param dateOfBirth
     * @param emailId
     * @throws java.lang.Exception
     */
     void updateEmployee(int empId,String firstName, String middleName,String lastName,String address,String city,String state,int pincode,Date dateOfBirth,String emailId) throws Exception;

    /**
     *
     * @param empId
     * @throws java.lang.Exception
     */
     void deleteEmployee(int empId) throws Exception;
     
     /**
     *
     * @param empId
     * @param active
     * @throws java.lang.Exception
     */
     void activateEmployee(int empId, boolean active) throws Exception;

    /**
     * get all flaws
     * @return 
     * @throws java.lang.Exception
     */
    List getEmployeeList() throws Exception;
    
    /**
     *
     * @param ID
     * @return
     * @throws Exception
     */
    Employee getEmployeeDetails(int ID) throws Exception;
}
