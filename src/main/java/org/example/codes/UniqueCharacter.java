package org.example.codes;

import java.util.HashMap;

public class UniqueCharacter {
    String str = "This is a test";
    HashMap<Character, Integer> uniqueChar = new HashMap<>();

    public UniqueCharacter() {
        for (int i = 0; i < str.length(); i++) {
            if (!uniqueChar.containsKey(str.charAt(i))) {
                uniqueChar.put(str.charAt(i), i);
            }
        }
    }

    public static void main(String[] args) {
        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        System.out.println(uniqueCharacter.uniqueChar);
    }
}
