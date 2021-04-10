package com.company;

import java.util.ArrayList;

public class Trie {

    private TrieNode root;
    public int count;

    public Trie() {
        root = new TrieNode('\0');
    }

    public boolean search(String word) {
        return search(root, word);
    }

    private boolean search(TrieNode root, String word) {
        if (word.length() == 0) {
            return root.isTerminating;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            return false;
        }
        return search(child, word.substring(1));
    }

    private void add(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminating = true;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        add(child, word.substring(1));
    }

    public void add(String word) {
        add(root, word);
    }


    public boolean patternMatching(ArrayList<String> input, String pattern) {
        // Write your code here
        for (int i = 0; i < input.size(); i++) {
            String temp = input.get(i);
            for (int j = 0; j < temp.length(); j++) {
                add(temp.substring(j));
            }
        }

        return search(root, pattern);

    }

}
