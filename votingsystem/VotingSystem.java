package com.tit.week04.day02.collections.votingsystem;

import java.util.*;

class VotingSystem {
    private Map<String, Integer> votes = new HashMap<>();
    private LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();
    private TreeMap<String, Integer> sortedVotes = new TreeMap<>();

    // Cast a vote for a candidate
    public void castVote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, votes.get(candidate));
        sortedVotes.put(candidate, votes.get(candidate));

        System.out.println("Vote cast for: " + candidate);
    }

    // Display all votes (unordered)
    public void displayVotes() {
        System.out.println("\nAll Votes (Candidate -> Vote Count):");
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Display votes in order of voting
    public void displayVoteOrder() {
        System.out.println("\nVote Order (As Cast):");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Display results sorted by candidate name
    public void displaySortedResults() {
        System.out.println("\nVoting Results (Sorted by Candidate Name):");
        for (Map.Entry<String, Integer> entry : sortedVotes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
