package org.example.codes;

import java.util.HashMap;

public class AnagramEx {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listent ";

        boolean isAnagram = true;
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                isAnagram = false;
                break;
            } else {
                charCount.put(c, charCount.get(c) - 1);
            }
        }
        if (isAnagram) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
