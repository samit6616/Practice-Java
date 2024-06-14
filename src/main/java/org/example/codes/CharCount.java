package org.example.codes;

import java.util.HashMap;

public class CharCount {
    public static void main(String[] args) {
        String str = "gshdC gDHGbcgcbcvh";
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (char c : charCount.keySet()) {
            System.out.println(c + ": " + charCount.get(c));
        }
    }
}
