package com.textile.dal.hibernate.entity.lot;
// Generated May 16, 2016 11:41:18 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Lot generated by hbm2java
 */
@Entity
@Table(name="LOT"
    ,catalog="textile"
)
public class Lot  implements java.io.Serializable {


     private Integer lotId;
     private int lotNumber;
     private int takaSno;
     private Date lastModified;

    public Lot() {
    }

    public Lot(int lotNumber, int takaSno, Date lastModified) {
       this.lotNumber = lotNumber;
       this.takaSno = takaSno;
       this.lastModified = lastModified;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="lot_id", unique=true, nullable=false)
    public Integer getLotId() {
        return this.lotId;
    }
    
    public void setLotId(Integer lotId) {
        this.lotId = lotId;
    }

    
    @Column(name="lot_number", nullable=false)
    public int getLotNumber() {
        return this.lotNumber;
    }
    
    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }

    
    @Column(name="taka_sno", nullable=false)
    public int getTakaSno() {
        return this.takaSno;
    }
    
    public void setTakaSno(int takaSno) {
        this.takaSno = takaSno;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_modified", nullable=false, length=19)
    public Date getLastModified() {
        return this.lastModified;
    }
    
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }




}

