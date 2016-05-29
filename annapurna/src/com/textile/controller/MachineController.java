/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.controller;

import com.textile.dal.dao.services.impl.MachineDaoServiceImpl;
import com.textile.dal.dao.services.api.MachineDaoService;

/**
 *
 * @author dipuviky
 */
public class MachineController {
    
    MachineDaoService machineService = new MachineDaoServiceImpl();
    
    public Object[] getMachineComboModel(String defaultString) throws Exception {
        return machineService.getComboItems(defaultString).toArray();
    }  
    
}
