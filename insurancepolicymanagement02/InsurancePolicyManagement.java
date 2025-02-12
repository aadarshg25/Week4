package com.tit.week04.day02.collections.insurancepolicymanagement02;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManagement {
    private Map<String, Policy> policyMap = new HashMap<>();
    private Map<String, Policy> orderedPolicyMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<Policy>> sortedByExpiry = new TreeMap<>();

    // Add a policy
    public void addPolicy(Policy policy) {
        policyMap.put(policy.policyNumber, policy);
        orderedPolicyMap.put(policy.policyNumber, policy);
        sortedByExpiry.computeIfAbsent(policy.expiryDate, k -> new ArrayList<>()).add(policy);
    }

    // Retrieve a policy by number
    public Policy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // List policies expiring within the next 30 days
    public List<Policy> getExpiringPolicies() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        List<Policy> expiringPolicies = new ArrayList<>();
        for (Map.Entry<LocalDate, List<Policy>> entry : sortedByExpiry.subMap(today, true, limit, true).entrySet()) {
            expiringPolicies.addAll(entry.getValue());
        }
        return expiringPolicies;
    }

    // List policies for a specific policyholder
    public List<Policy> getPoliciesByHolder(String policyHolder) {
        List<Policy> result = new ArrayList<>();
        for (Policy policy : policyMap.values()) {
            if (policy.policyHolder.equalsIgnoreCase(policyHolder)) {
                result.add(policy);
            }
        }
        return result;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        List<LocalDate> expiredDates = new ArrayList<>(sortedByExpiry.headMap(today, false).keySet());

        for (LocalDate date : expiredDates) {
            List<Policy> expiredPolicies = sortedByExpiry.remove(date);
            for (Policy policy : expiredPolicies) {
                policyMap.remove(policy.policyNumber);
                orderedPolicyMap.remove(policy.policyNumber);
            }
        }
    }

    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();

        system.addPolicy(new Policy("P001", "Alice", LocalDate.now().plusDays(10)));
        system.addPolicy(new Policy("P002", "Bob", LocalDate.now().plusDays(40)));
        system.addPolicy(new Policy("P003", "Alice", LocalDate.now().plusDays(5)));
        system.addPolicy(new Policy("P004", "Carol", LocalDate.now().minusDays(1))); // Expired

        System.out.println("Policy P002: " + system.getPolicyByNumber("P002"));
        System.out.println("Expiring Policies: " + system.getExpiringPolicies());
        System.out.println("Policies for Alice: " + system.getPoliciesByHolder("Alice"));

        system.removeExpiredPolicies();
        System.out.println("After removing expired policies: " + system.policyMap);
    }
}
