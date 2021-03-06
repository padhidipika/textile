package com.textile.dal.hibernate.entity.taka;
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
 * TakaEmp generated by hbm2java
 */
@Entity
@Table(name="TAKA_EMP"
    ,catalog="textile"
)
public class TakaEmp  implements java.io.Serializable {


     private Integer takaEmpId;
     private int takaId;
     private int empId;
     private Date productionDate;
     private Long takaLength;
     private Date lastModified;

    public TakaEmp() {
    }

	
    public TakaEmp(int takaId, int empId, Date lastModified) {
        this.takaId = takaId;
        this.empId = empId;
        this.lastModified = lastModified;
    }
    public TakaEmp(int takaId, int empId, Date productionDate, Long takaLength, Date lastModified) {
       this.takaId = takaId;
       this.empId = empId;
       this.productionDate = productionDate;
       this.takaLength = takaLength;
       this.lastModified = lastModified;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="taka_emp_id", unique=true, nullable=false)
    public Integer getTakaEmpId() {
        return this.takaEmpId;
    }
    
    public void setTakaEmpId(Integer takaEmpId) {
        this.takaEmpId = takaEmpId;
    }

    
    @Column(name="taka_id", nullable=false)
    public int getTakaId() {
        return this.takaId;
    }
    
    public void setTakaId(int takaId) {
        this.takaId = takaId;
    }

    
    @Column(name="emp_id", nullable=false)
    public int getEmpId() {
        return this.empId;
    }
    
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="production_date", length=10)
    public Date getProductionDate() {
        return this.productionDate;
    }
    
    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    
    @Column(name="taka_length", precision=10, scale=0)
    public Long getTakaLength() {
        return this.takaLength;
    }
    
    public void setTakaLength(Long takaLength) {
        this.takaLength = takaLength;
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


