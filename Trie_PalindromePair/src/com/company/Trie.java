package com.company;

import java.util.ArrayList;

public class Trie {

    private TrieNode root;
    public int count;

    public Trie() {
        root = new TrieNode('\0');
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

    public boolean search(String word) {
        return search(root, word);
    }

    private void print(TrieNode root, String word) {
        if (root == null) {
            return;
        }

        if (root.isTerminating) {
            System.out.println(word);
        }

        for (TrieNode child : root.children) {
            if (child == null) {
                continue;
            }
            String fwd = word + child.data;
            print(child, fwd);
        }
    }

    public void print() {
        print(this.root, "");
    }


    public boolean isPalindromePair(ArrayList<String> vect) {
        //Your code goes here
        String input1, p = "";

        for (int i = 0; i < vect.size(); i++) {
            if (!search(root, vect.get(i)))
                add(vect.get(i));
        }

        for (int i = 0; i < vect.size(); i++) {
            p = "";
            input1 = vect.get(i);

            for (int k = 0; k < input1.length(); k++) {
                p = input1.charAt(k) + p;
            }

            if (search(root, p)) {
                return true;
            }
        }

        for (int i = 0; i < vect.size() - 1; i++) {
            for (int j = i + 1; j < vect.size(); j++) {
                String check_str = "";

                // concatenate both strings
                check_str = check_str + vect.get(i) + vect.get(j);

                // check if the concatenated string is
                // palindrome
                if (isPalindrome(check_str))
                    return true;

                check_str = vect.get(j) + vect.get(i);

                // check if the concatenated string is
                // palindrome
                if (isPalindrome(check_str))
                    return true;
            }
        }
        return false;
    }

    private static boolean isPalindrome(String str) {
        int len = str.length();

        for (int i = 0; i < len / 2; i++)
            if (str.charAt(i) != str.charAt(len - i - 1))
                return false;

        return true;
    }


}
