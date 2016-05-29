/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.dal.hibernate.entity.beam;

/**
 *
 * @author dipuviky
 */
public class BeamStats {
    
    private final int beamSNo;
    private final int lotNo;
    private final int machineNo;
    private final int expTaka;
    private final int expMeters;
    private final int prodTaka;
    private final int prodMeters;
    private final String issueDate;
    private final String lastModifiedDate;
    private final String completionDate;

    public BeamStats(int beamSNo, int lotNo, int machineNo, int expTaka, 
                    int expMeters, int prodTaka, int prodMeters, String issueDate, 
                    String lastModifiedDate, String completionDate) {
        this.beamSNo = beamSNo;
        this.lotNo = lotNo;
        this.machineNo = machineNo;
        this.expTaka = expTaka;
        this.expMeters = expMeters;
        this.prodTaka = prodTaka;
        this.prodMeters = prodMeters;
        this.issueDate = issueDate;
        this.lastModifiedDate = lastModifiedDate;
        this.completionDate = completionDate;
    }

    public int getBeamSNo() {
        return beamSNo;
    }

    public int getLotNo() {
        return lotNo;
    }

    public int getMachineNo() {
        return machineNo;
    }

    public int getExpTaka() {
        return expTaka;
    }

    public int getExpMeters() {
        return expMeters;
    }

    public int getProdTaka() {
        return prodTaka;
    }

    public int getProdMeters() {
        return prodMeters;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public String getCompletionDate() {
        return completionDate;
    }

    @Override
    public String toString() {
        return "BeamStats{" + "beamSNo=" + beamSNo + ", lotNo=" + lotNo + ", machineNo=" + machineNo + ", expTaka=" + expTaka + ", expMeters=" + expMeters + ", prodTaka=" + prodTaka + ", prodMeters=" + prodMeters + ", issueDate=" + issueDate + ", lastModifiedDate=" + lastModifiedDate + ", completionDate=" + completionDate + '}';
    }
    
    
           
    
}
