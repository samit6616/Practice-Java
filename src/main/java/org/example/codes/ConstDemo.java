package org.example.codes;

import java.util.Scanner;

public class ConstDemo {
	Scanner sc=new Scanner(System.in);
	public ConstDemo(String name) {
		System.out.println(name);
		System.out.println("This is Non-Parameterized constructor.");
	}
	public ConstDemo(int a) {
		System.out.println("Enter a number");
		a=sc.nextInt();
		System.out.println(a);
		sc.close();
	}

	public static void main(String[] args) {
		ConstDemo demo=new ConstDemo("Amit");

	}

}
