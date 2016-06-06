/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.controller;

import com.textile.dal.dao.services.impl.BeamDaoServiceImpl;
import com.textile.dal.dao.services.api.BeamDaoService;
import com.textile.dal.hibernate.entity.beam.Beam;

/**
 *
 * @author dipuviky
 */
public class BeamController {

    BeamDaoService beamService = new BeamDaoServiceImpl();
    
    public void issueBeam(int beamSno, int lotId, int machineId, int noOfTaka,
                        long meterPerTaka, long totalMeter, String issueDate) throws Exception {
        try {
            beamService.insertBeam(beamSno, lotId, machineId, noOfTaka, 
                                    meterPerTaka, totalMeter, issueDate);
        } catch (Exception ex) {
            throw new Exception("Exception while issuing new beam "  , ex);
        }
    }
    
    public void updateBeam(int beamId, int beamSno, int lotId, int machineId, int noOfTaka,
                        long meterPerTaka, long totalMeter, String issueDate) throws Exception {
        try {
            beamService.updateBeam(beamId, beamSno, lotId, machineId, noOfTaka, 
                                    meterPerTaka, totalMeter, issueDate);
        } catch (Exception ex) {
            throw new Exception("Exception while updating beam "  , ex);
        }
    }

    public Beam getBeam(int beamId) throws Exception {
        try {
            return beamService.getBeamDetails(beamId);
        } catch (Exception ex) {
            throw new Exception("Exception while retreiving beam details for beam ID-" + beamId  , ex);
        }
    }
}
