/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.services.api;

import java.util.List;

/**
 *
 * @author Gaurav
 */
public interface LotService {
    
     /**
     * @param lotNumber
     * @param  takaSno
     * @throws java.lang.Exception
     */
    void insertLot(int lotNumber,int takaSno) throws Exception;

    /**
     * @param lotId
     * @param lotNumber
     * @param  takaSno
     * @throws java.lang.Exception
     */
    void updateLot(int lotId,int lotNumber,int takaSno) throws Exception;

    /**
     *
     * @param LotId
     * @throws java.lang.Exception
     */
    void deleteLot(int LotId) throws Exception;

    /**
     * get all lots
     * @return 
     * @throws java.lang.Exception
     */
    List getLotList() throws Exception;
    
}
