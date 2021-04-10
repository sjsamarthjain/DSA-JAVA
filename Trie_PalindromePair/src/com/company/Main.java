package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//Given 'n' number of words, you need to find if there exist any two words which can be joined
        // to make a palindrome or any word, which itself is a palindrome.
        //The function should return either true or false. You don't have to print anything.
    }
}

class TrieNode {
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


