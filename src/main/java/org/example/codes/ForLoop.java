package org.example.codes;

import java.util.Scanner;

public class ForLoop {
	

	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int in=sc.nextInt();
		for (i=in;i<=100;i=i+2) {
			System.out.println("Value of i is :"+i);
		}
			sc.close();
	}
	

}
