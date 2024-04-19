package org.example.codes;

import java.util.Scanner;

public class MainClassInner {

	public static void main(String[] args) {
		InheritanceDemo inheritanceDemo = new CalC();
		CalC calC = (CalC) inheritanceDemo;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please select A for Add" + "\n" + "S for Substract" + "\n" + "M for Multiply" + "\n"
					+ "D for Divide");
			String inp = sc.next();
			if (inp.equalsIgnoreCase("A")) {
				int add = calC.add(10, 5);
				System.out.println(add);
			} else if (inp.equalsIgnoreCase("S")) {
				int sub = calC.sub(10, 5);
				System.out.println(sub);
			} else if (inp.equalsIgnoreCase("M")) {
				int mul = calC.Multi(10, 5);
				System.out.println(mul);
			} else if (inp.equalsIgnoreCase("D")) {
				int div = calC.Div(10, 5);
				System.out.println(div);
			} else {
				System.out.println("Please enter valid operation...");
				break;
			}

		}
		sc.close();
	}

}
