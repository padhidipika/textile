/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.controller;

import com.textile.dal.dao.services.impl.LotDaoServiceImpl;
import com.textile.dal.dao.services.api.LotDaoService;


/**
 *
 * @author dipuviky
 */
public class LotController {
    
    LotDaoService lotService = new LotDaoServiceImpl();
    
     public Object[] getLotComboModel(String defaultString) throws Exception {
      return lotService.getComboItems(defaultString).toArray();  
    }
}
