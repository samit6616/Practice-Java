package org.example.codes;
import java.util.*;

public class ForEachLoop {

	public static void main(String[] args) {
//		int a = 1;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the length");
//		int length = scan.nextInt();
//		int[] arr = new int[length];
//		for (int i = 0; i < length; i++) {
//			System.out.println("Enter element " + a);
//			int val = scan.nextInt();
//			arr[i] = val;
//			a++;
//		}
//
//		for (int i : arr) {
//			System.out.print(i + ", ");
//
//		}
//		scan.close();
		
		int a=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of array :");
		int ln=sc.nextInt();
		int arr[]=new int[ln];
		for(int i=0;i<ln;i++) {
			System.out.println("Enter element: "+a);
			int val=sc.nextInt();
			arr[i]=val;
			a++;
		}
		System.out.print("Your array is : [ ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.print("]");
		sc.close();
		}

		

	}


