package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//Given a list of n words and a pattern p that we want to search. Check if the pattern p is present
        // the given words or not. Return true if the pattern is present and false otherwise.
    }
}

class TrieNode{

    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}

