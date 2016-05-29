package com.textile.dal.hibernate.entity.beam;
// Generated May 16, 2016 11:41:18 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Beam generated by hbm2java
 */
public class Beam  implements java.io.Serializable {


    private Integer beamId;
    private int beamSno;
    private int lotId;
    private int machineId;
    private int noOfTaka;
    private Long meterPerTaka;
    private Long totalMeter;
    private Date issueDate;
    private Date completionDate;
    private Date lastModified;

    public Beam() {
        
    }
            
     
    public Beam(int beamSno, int lotId, int machineId, int noOfTaka, Long meterPerTaka, Long totalMeter, Date issueDate) {
        this.beamSno = beamSno;
        this.lotId = lotId;
        this.machineId = machineId;
        this.noOfTaka = noOfTaka;
        this.meterPerTaka = meterPerTaka;
        this.totalMeter = totalMeter;
        this.issueDate = issueDate;
    }

    public Beam(Integer beamId, Date completionDate) {
        this.beamId = beamId;
        this.completionDate = completionDate;
    }

    public Beam(Integer beamId, int beamSno, int lotId, int machineId, int noOfTaka, Long meterPerTaka, Long totalMeter, Date issueDate) {
        this.beamId = beamId;
        this.beamSno = beamSno;
        this.lotId = lotId;
        this.machineId = machineId;
        this.noOfTaka = noOfTaka;
        this.meterPerTaka = meterPerTaka;
        this.totalMeter = totalMeter;
        this.issueDate = issueDate;
    }

    public Integer getBeamId() {
        return this.beamId;
    }
    
    public void setBeamId(Integer beamId) {
        this.beamId = beamId;
    }

    public int getBeamSno() {
        return this.beamSno;
    }
    
    public void setBeamSno(int beamSno) {
        this.beamSno = beamSno;
    }

    public int getLotId() {
        return this.lotId;
    }
    
    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public int getMachineId() {
        return this.machineId;
    }
    
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public int getNoOfTaka() {
        return this.noOfTaka;
    }
    
    public void setNoOfTaka(int noOfTaka) {
        this.noOfTaka = noOfTaka;
    }

    public Long getMeterPerTaka() {
        return this.meterPerTaka;
    }
    
    public void setMeterPerTaka(Long meterPerTaka) {
        this.meterPerTaka = meterPerTaka;
    }

    public Long getTotalMeter() {
        return this.totalMeter;
    }
    
    public void setTotalMeter(Long totalMeter) {
        this.totalMeter = totalMeter;
    }

    public Date getIssueDate() {
        return this.issueDate;
    }
    
    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getCompletionDate() {
        return this.completionDate;
    }
    
    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }


    public Date getLastModified() {
        return this.lastModified;
    }
    
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

}


