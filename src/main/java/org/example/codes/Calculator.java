package org.example.codes;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a1=sc.nextInt();
		String op=sc.next();
		int a2=sc.nextInt();
		
		switch(op) {
		
		case "+": System.out.println(a1+a2);
		break;
		case "-": System.out.println(a1-a2);
		break;
		case "*": System.out.println(a1*a2);
		break;
		case "/": System.out.println(a1/a2);
		break;
		default: System.out.println("Not a valid operator");
		}
sc.close();

	}

}
