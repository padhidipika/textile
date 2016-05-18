package com.textile.dal.hibernate.entity.employee;
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
 * Employee generated by hbm2java
 */
@Entity
@Table(name="EMPLOYEE"
    ,catalog="textile"
)
public class Employee  implements java.io.Serializable {


     private Integer empId;
     private String firstName;
     private String middleName;
     private String lastName;
     private String address;
     private String city;
     private String state;
     private Integer pincode;
     private Date dateOfBirth;
     private String emailId;
     private byte[] identityImage;
     private byte active;
     private Date lastModified;

    public Employee() {
    }

	
    public Employee(String firstName, byte active, Date lastModified) {
        this.firstName = firstName;
        this.active = active;
        this.lastModified = lastModified;
    }
    public Employee(String firstName, String middleName, String lastName, String address, String city, String state, Integer pincode, Date dateOfBirth, String emailId, byte[] identityImage, byte active, Date lastModified) {
       this.firstName = firstName;
       this.middleName = middleName;
       this.lastName = lastName;
       this.address = address;
       this.city = city;
       this.state = state;
       this.pincode = pincode;
       this.dateOfBirth = dateOfBirth;
       this.emailId = emailId;
       this.identityImage = identityImage;
       this.active = active;
       this.lastModified = lastModified;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="emp_id", unique=true, nullable=false)
    public Integer getEmpId() {
        return this.empId;
    }
    
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    
    @Column(name="first_name", nullable=false, length=100)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="middle_name", length=100)
    public String getMiddleName() {
        return this.middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    
    @Column(name="last_name", length=100)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="address", length=300)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="city", length=100)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="state", length=100)
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    
    @Column(name="pincode")
    public Integer getPincode() {
        return this.pincode;
    }
    
    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_of_birth", length=10)
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    
    @Column(name="email_id", length=200)
    public String getEmailId() {
        return this.emailId;
    }
    
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    
    @Column(name="identity_image")
    public byte[] getIdentityImage() {
        return this.identityImage;
    }
    
    public void setIdentityImage(byte[] identityImage) {
        this.identityImage = identityImage;
    }

    
    @Column(name="active", nullable=false)
    public byte getActive() {
        return this.active;
    }
    
    public void setActive(byte active) {
        this.active = active;
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

