package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//Given n number of words and an incomplete word w. You need to auto-complete that word w.
        //That means, find and print all the possible words which can be formed using the incomplete word w.
        //Note : Order of words does not matter.
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



