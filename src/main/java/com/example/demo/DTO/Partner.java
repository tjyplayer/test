package com.example.demo.DTO;

import jakarta.persistence.*;

@Entity
@Table(name = "partners")
public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comId;
    private String company;
    private String salesRep;
    private String mail;

    // Default constructor for JPA
    public Partner() {
    }

    // Constructor with parameters
    public Partner(Long comId, String company, String salesRep, String mail) {
        this.comId = comId;
        this.company = company;
        this.salesRep = salesRep;
        this.mail = mail;
    }

    // Getters and setters
    public Long getComId() {
        return comId;
    }

    public void setComId(Long comId) {
        this.comId = comId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSalesRep() {
        return salesRep;
    }

    public void setSalesRep(String salesRep) {
        this.salesRep = salesRep;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    // toString method
    @Override
    public String toString() {
        return "Partner{" +
                "comId=" + comId +
                ", company='" + company + '\'' +
                ", salesRep='" + salesRep + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}

