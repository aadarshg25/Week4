package com.tit.week04.day02.collections.votingsystem;

public class Main {
    public static void main(String[] args) {
        VotingSystem voting = new VotingSystem();

        voting.castVote("Alice");
        voting.castVote("Bob");
        voting.castVote("Alice");
        voting.castVote("Charlie");
        voting.castVote("Bob");
        voting.castVote("Alice");

        voting.displayVotes();
        voting.displayVoteOrder();
        voting.displaySortedResults();
    }
}
