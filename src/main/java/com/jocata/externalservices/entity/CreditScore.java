package com.jocata.externalservices.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class CreditScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int creditScoreId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private int score;
    private String scoreDate;

    // Getters and setters
    public int getCreditScoreId() {
        return creditScoreId;
    }

    public void setCreditScoreId(int creditScoreId) {
        this.creditScoreId = creditScoreId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getScoreDate() {
        return scoreDate;
    }

    public void setScoreDate(String scoreDate) {
        this.scoreDate = scoreDate;
    }
}
