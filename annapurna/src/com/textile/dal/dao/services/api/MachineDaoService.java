/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.dal.dao.services.api;

import com.textile.dto.ComboItem;
import java.util.List;

/**
 *
 * @author Gaurav
 */
public interface MachineDaoService {
    
    /**
     * @param machineNumber
     * @throws java.lang.Exception
     */
    void insertMachine(int machineNumber) throws Exception;

    /**
     *
     * @param machineId
     * @param machineNumber
     * @throws java.lang.Exception
     */
    void updateMachine(int machineId, int machineNumber) throws Exception;

    /**
     *
     * @param machineId
     * @throws java.lang.Exception
     */
    void deleteMachine(int machineId) throws Exception;

    /**
     * get all machines
     * @return 
     * @throws java.lang.Exception
     */
    List getMachineList() throws Exception;  
    
    /**
     *
     * @param defaultItem
     * @return
     * @throws Exception
     */
    List<ComboItem> getComboItems(String defaultItem) throws Exception;
}
