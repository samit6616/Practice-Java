package org.example.codes;

import java.util.*;

public class ArraySearch {

	public static int findIndex(int arr[], int t) {

		if (arr == null) {
			return -1;
		}
		int len = arr.length;
		int i = 0;

		while (i < len) {
			if (arr[i] == t) {
				return i;
			} else {
				i = i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };
		System.out.println("Enter a number to search: ");
		int inp = sc.nextInt();
		System.out.println("Index position of " + inp + " is: " + findIndex(my_array, inp));
		sc.close();

	}
}