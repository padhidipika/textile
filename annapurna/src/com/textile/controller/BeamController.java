/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.controller;

import com.textile.dal.dao.services.impl.BeamDaoServiceImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.textile.dal.dao.services.api.BeamDaoService;

/**
 *
 * @author dipuviky
 */
public class BeamController {

    BeamDaoService beamService = new BeamDaoServiceImpl();
    
    public void IssueBeam(int beamSno, int lotId, int machineId, int noOfTaka,
                        long meterPerTaka, long totalMeter, String issueDate) {
        try {
            
            beamService.insertBeam(beamSno, lotId, machineId, noOfTaka, 
                                    meterPerTaka, totalMeter, issueDate);
            
        } catch (Exception ex) {
            Logger.getLogger(BeamController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 

    
    
}
