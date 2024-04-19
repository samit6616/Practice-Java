package org.example.codes;

public class StringPractice {
    public static void main(String[] args) {
        String fName="      Amit";
        String lName="Singh           ";
        String fullName = (fName+" "+lName).strip();
        int len = fullName.length();
        String java11="Repeat ".repeat(2);
        System.out.println(java11);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append("Java ");
        }
        String result = sb.toString();
        System.out.println(result);
        String userId=(fullName.charAt(0)+fullName.substring(4,len)).toLowerCase().replaceAll("\\s", "");
        System.out.println("My Student is "+fullName+". His name contains "+len+" letter. While his userId id "+userId+".");
    }

}
