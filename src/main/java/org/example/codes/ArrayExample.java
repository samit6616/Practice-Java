package org.example.codes;

public class ArrayExample {

	public static void main(String[] args) {
		int arr[][] = new int[3][4];
		arr[0][0] = 5;
		arr[0][1] = 6;
		arr[0][2] = 7;
		arr[0][3] = 8;
		arr[1][0] = 6;
		arr[1][1] = 7;
		arr[1][2] = 8;
		arr[1][3] = 9;
		arr[2][0] = 9;
		arr[2][1] = 8;
		arr[2][2] = 7;
		arr[2][3] = 6;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
