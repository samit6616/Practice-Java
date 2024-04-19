package org.example.codes;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("The entered value is "+a);
		while(a<100) {
			a++;
			System.out.println("The next value is "+a);
			
			
		}
		sc.close();
	}

}
