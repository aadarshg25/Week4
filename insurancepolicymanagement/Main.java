package com.tit.week04.day02.collections.insurancepolicymanagement;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        manager.addPolicy(new InsurancePolicy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 5000));
        manager.addPolicy(new InsurancePolicy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 6000));
        manager.addPolicy(new InsurancePolicy("P003", "Charlie", LocalDate.now().plusDays(20), "Home", 5500));
        manager.addPolicy(new InsurancePolicy("P004", "Dave", LocalDate.now().plusDays(5), "Health", 5200));
        manager.addPolicy(new InsurancePolicy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 5000)); // Duplicate

        manager.displayAllPolicies();
        manager.displayExpiringSoon();
        manager.displayByCoverageType("Health");
        manager.findDuplicatePolicies();

        System.out.println("\nPerformance Comparison:");
        manager.comparePerformance();
    }
}
