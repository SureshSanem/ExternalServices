package com.jocata.externalservices.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Aadhar")
public class AadharDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "aadhar_id")
    private String aadharNum;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "gender")
    private String gender;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "status")
    private String status;

    @Column(name = "issue_date")
    private Date issueDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

