package org.example.codes;

import java.util.Scanner;

public class PerNum {

	public static void main(String[] args) {
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		sc.close();
		for (i = 1; i < num; i++) {
			if (num % i == 0) {
				sum=sum+i;
			}
		}
		if (sum == num) {
			System.out.println("Congratulations!!! " + num + " is a perfect number.");
		} else {
			System.out.println("Oops!!! " + num + " is not a perfect number.");
		}
	}

}
