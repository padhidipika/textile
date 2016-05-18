/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.services.api;

import java.util.List;

/**
 *
 * @author dipuviky
 */
public interface FlawService {
    
    /**
     *
     * @param flawName
     * @param flawDescription
     * @throws java.lang.Exception
     */
    void insertFlaw(String flawName, String flawDescription) throws Exception;

    /**
     *
     * @param flawId
     * @param flawName
     * @param flawDescription
     * @throws java.lang.Exception
     */
    void updateFlaw(int flawId, String flawName, String flawDescription) throws Exception;

    /**
     *
     * @param flawId
     * @throws java.lang.Exception
     */
    void deleteFlaw(int flawId) throws Exception;

    /**
     * get all flaws
     * @return 
     * @throws java.lang.Exception
     */
    List getFlawList() throws Exception;

}
