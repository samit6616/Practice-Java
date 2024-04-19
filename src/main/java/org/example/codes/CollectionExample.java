package org.example.codes;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		System.out.println("Your array list: ");
		lst.add(20);
		lst.add(30);
		lst.add(40);
		lst.add(50);
		lst.add(60);
		lst.add(30);
		for (int lst1 : lst) {
			System.out.print(lst1);
			System.out.print(", ");
		}
		System.out.println("\n");
		lst.remove(3);
		System.out.println("Remove Index 3");
		System.out.println("______________________");
		System.out.println(lst);
		lst.add(3, 0);
		System.out.println("Add 0 at 3 Index");
		System.out.println("______________________");
		System.out.println(lst);
		lst.addAll(lst);
		System.out.println("Add List to Existing List");
		System.out.println("______________________");
		System.out.println(lst);
		lst.addAll(0, lst);
		System.out.println("Add List to 0 index");
		System.out.println("______________________");
		System.out.println(lst);
		lst.contains(lst);
		System.out.println("Contains");
		System.out.println("______________________");
		System.out.println(lst);
		lst.equals(lst);
		System.out.println("Equals");
		System.out.println("______________________");
		System.out.println(lst);
		lst.clear();
		System.out.println("Clear List");
		System.out.println("______________________");
		System.out.println(lst);
	}

}
