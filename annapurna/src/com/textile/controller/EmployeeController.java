/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.controller;

import com.textile.dal.dao.services.impl.EmployeeDaoServiceImpl;
import com.textile.dal.hibernate.entity.employee.Employee;
import java.util.Date;

/**
 *
 * @author dipika.padhi
 */
public class EmployeeController {
    
    EmployeeDaoServiceImpl employeeService = new EmployeeDaoServiceImpl();
    
    public void addEmployee(String firstName, String middleName, 
                                String lastName, String address, String city, 
                                String state, int pincode, Date dateOfBirth,
                                String emailId) throws Exception {
        try {
            employeeService.insertEmployee(firstName, middleName, lastName, address, city, state, pincode, dateOfBirth, emailId);
        } catch (Exception ex) {
            throw new Exception("Exception while adding employee "  , ex);
        }
    }
    
    public void editEmployee(int empId, String firstName, String middleName, 
                                String lastName, String address, String city, 
                                String state, int pincode, Date dateOfBirth,
                                String emailId) throws Exception {
        try {
            employeeService.updateEmployee(empId, firstName, middleName, lastName, address, city, state, pincode, dateOfBirth, emailId);
        } catch (Exception ex) {
            throw new Exception("Exception while updating employee "  , ex);
        }
    }
    
    

    public Employee getEmployee(int empId) throws Exception {
        try {
            return employeeService.getEmployeeDetails(empId);
        } catch (Exception ex) {
            throw new Exception("Exception while retreiving employee details for emp ID-" + empId  , ex);
        }
    }
    
}
