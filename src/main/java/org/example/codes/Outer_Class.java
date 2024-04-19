package org.example.codes;

import java.util.Scanner;

public class Outer_Class {

	private class Inner_Class {
		public void print() {
			int i, sum = 0;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int num = sc.nextInt();
			sc.close();
			if (num % 2 == 0) {
				System.out.println(num + " is an Even Number");
				for (i = 1; i < num; i++) {
					if (num % i == 0) {
						sum = sum + i;
					}
				}
				if (sum == num) {
					System.out.println("Congratulations!!! " + num + " is a perfect number.");
				} else {
					System.out.println("Oops!!! " + num + " is not a perfect number.");
				}

			} else {
				System.out.println(num + " is an Odd Number");
				for (i = 1; i < num; i++) {
					if (num % i == 0) {
						sum = sum + i;
					}
				}
				if (sum == num) {
					System.out.println("Congratulations!!! " + num + " is a perfect number.");
				} else {
					System.out.println("Oops!!! " + num + " is not a perfect number.");
				}

			}

		}
	}

	void display_Inner() {
		Inner_Class inner_Class = new Inner_Class();
		inner_Class.print();
	}
}
