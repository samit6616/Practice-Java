package org.example.codes;

public class Pattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j <= 3; j++) {
				if (i + j > 4)
					System.out.print((i + j) - 4);
				else
					System.out.print(i + j);
			}
			System.out.println("");
		}
	}
}
