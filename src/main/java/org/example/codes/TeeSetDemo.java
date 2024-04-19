package org.example.codes;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TeeSetDemo {

	public static void main(String[] args) {
		Employee1 employee = new Employee1(1, "Amod");
		Employee1 employee1 = new Employee1(2, "Amit");
		Set<Employee1> set = new TreeSet<>(new IdComparator());
		Set<Employee1> synchonizedSet = Collections.synchronizedSet(set);
		synchonizedSet.add(employee1);
		synchonizedSet.add(employee);
		synchonizedSet.stream().forEach(System.out::print);
		String s1 = "Amit";
		String s2 = "Amod";

		Set<String> setString = new TreeSet<>();
		setString.add(s2);
		setString.add(s1);

	}

}

class Employee1 implements Comparable<Employee1> {
	int id;
	String name;

	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {

		return "Employee [id=" + id + ", name=" + name + "]\n";
	}

	@Override
	public int compareTo(Employee1 o) {
		return o.name.compareTo(this.name);
	}
}

class IdComparator implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		return -o2.getId() - o1.getId();
	}

}

class NameComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Employee1 e1 = (Employee1) o1;
		Employee1 e2 = (Employee1) o2;
		return e1.name.compareTo(e2.name);
	}

}
