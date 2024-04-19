package org.example.codes;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int temp = 0;
		System.out.println("Enter all elements: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Enter " + i + " element if the array: ");
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.println("**********************");
		System.out.println("Sorted elements in ascending order:");
		System.out.println("***********************************");
		System.out.println("Original input provided: ");
		for (int i = 0; i < n; i++) {
			System.out.println(b[i] + " ");
		}
		System.out.println("\nSorted Array:");
		for (int i = 0; i < n; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println("Smallest Element of the array: " + a[0]);
		System.out.println("Largest Element of the array: " + a[n - 1]);
		System.out.println("Reverse order of the sorted element: ");
		for (int i = n-1; i >= 0; i--) {
			System.out.println(a[i] + " ");
		}

	}

}
