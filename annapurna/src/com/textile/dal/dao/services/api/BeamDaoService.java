/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.dal.dao.services.api;

import com.textile.dal.hibernate.entity.beam.Beam;
import java.util.List;

/**
 *
 * @author Gaurav
 */
public interface BeamDaoService {
  /**
     *
     * @param beamSno
     * @param lotId
     * @param machineId
     * @param noOfTaka
     * @param meterPerTaka
     * @param totalMeter
     * @param issueDate
     * @throws java.lang.Exception
     */
    void insertBeam(int beamSno, int lotId, int machineId, int noOfTaka,
                    long meterPerTaka, long totalMeter, String issueDate) throws Exception;

    /**
     *
     * @param beamId
     * @param beamSno
     * @param lotId
     * @param machineId
     * @param noOfTaka
     * @param meterPerTaka
     * @param totalMeter
     * @param issueDate
     * @throws java.lang.Exception
     */
    void updateBeam(int beamId, int beamSno, int lotId, int machineId,
                    int noOfTaka, long meterPerTaka, long totalMeter,
                    String issueDate) throws Exception;

    /**
     *
     * @param beamId
     * @throws java.lang.Exception
     */
    
    /**
     *
     * @param beamId
     * @param completionDate
     * @throws java.lang.Exception
     */
    void updateDateOfCompletion(int beamId, String completionDate) throws Exception;

    /**
     *
     * @param beamId
     * @throws java.lang.Exception
     */
    void deleteBeam(int beamId) throws Exception;

    /**
     * get all flaws
     * @return 
     * @throws java.lang.Exception
     */
    List getBeamList() throws Exception;
    
     /**
     * get all flaws
     * @param machineId
     * @return 
     * @throws java.lang.Exception
     */
    List getBeamList(int machineId) throws Exception;

    /**
     *
     * @param beamId
     * @return
     */
    Beam getBeamDetails(int beamId) throws Exception ;
    
    
}
