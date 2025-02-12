package com.tit.week04.day02.collections.insurancepolicymanagement02;

import java.time.LocalDate;

class Policy {
    String policyNumber;
    String policyHolder;
    LocalDate expiryDate;

    public Policy(String policyNumber, String policyHolder, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyHolder='" + policyHolder + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}



