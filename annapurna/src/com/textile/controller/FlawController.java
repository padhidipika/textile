/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.controller;

import com.textile.dal.hibernate.entity.flaw.FabricFlaw;
import com.textile.services.api.FlawService;
import com.textile.services.impl.FlawServiceImpl;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author dipuviky
 */
public class FlawController {

    private FlawService flawService = new FlawServiceImpl();

    public Vector GetFlaws() throws Exception {
        try {
            Vector tableData = new Vector();
            List results = flawService.getFlawList();
            for (Object o : results) {
                FabricFlaw flaw = (FabricFlaw) o;
                Vector<Object> oneRow = new Vector<Object>();
                oneRow.add(flaw.getFlawId());
                oneRow.add(flaw.getFlawName());
                oneRow.add(flaw.getFlawDesc());
                oneRow.add(flaw.getLastModified());
                oneRow.add("Edit");
                oneRow.add("Delete");
                tableData.add(oneRow);
            }
            return tableData;
        } catch (Exception e) {
            throw new Exception("Exception while retreiving flaws ", e);
        }
    }

    public void AddFlaw(String flawName, String flawDesc) throws Exception {
        try {
            flawService.insertFlaw(flawName, flawDesc);
        } catch (Exception e) {
            throw new Exception("Exception while adding flaw - " + flawName, e);
        }
    }

    public void EditFlaw(int flawID, String flawName, String flawDesc) throws Exception {
        try {
            flawService.updateFlaw(flawID, flawName, flawDesc);
        } catch (Exception e) {
            throw new Exception("Exception while editing flaw " + flawName, e);
        }
    }

    public void deleteFlaw(int flawID)throws Exception {
        try {
            flawService.deleteFlaw(flawID);
        } catch (Exception e) {
            throw new Exception("Exception while deleting flaw " + flawID, e);
        }
    }

}
