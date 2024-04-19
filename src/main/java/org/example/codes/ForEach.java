package org.example.codes;

public class ForEach {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		int index = 0;
		for (int x : arr) {
			if (index != arr.length - 1) {
				System.out.println("Number: " + x + " is at index " + index++);
			} else {
				System.out.print("Number: " + x + " is at index " + index++);

			}
		}

	}

}
