package com.jocata.externalservices.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "CIBIL")
public class CibilDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "pan_id")
    private String pan;

    @Column(name = "credit_score")
    private int creditScore;

    @Column(name = "credit_history")
    private String creditHistory;

    @Column(name = "total_outstanding_balance")
    private BigDecimal totalOutstandingBalance;

    @Column(name = "recent_credit_inquiries")
    private String recentCreditInquiries;

    @Column(name = "payment_history")
    private String paymentHistory;

    @Column(name = "credit_limit")
    private BigDecimal creditLimit;

    @Column(name = "status")
    private String status;

    @Column(name = "report_date")
    private Date reportDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

