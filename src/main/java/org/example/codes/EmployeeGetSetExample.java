package org.example.codes;

import java.util.Scanner;

public class EmployeeGetSetExample {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Name: ");
		String name = sc.next();
		System.out.print("Enter Employee ID: ");
		String id = sc.next();
		System.out.print("Enter Employee Salary: ");
		double salary = sc.nextDouble();
		System.out.print("Enter Employee Mobile Number: ");
		String number = sc.next();
		System.out.print("Enter Employee Age: ");
		int age = sc.nextInt();
		employee.setName(name);
		employee.setEmployeeID(id);
		employee.setSalary(salary);
		employee.setNumber(number);
		employee.setEmployed(true);
		employee.setAge(age);

		System.out.println(employee.getName()+" age is "+employee.getAge());
		System.out.println("Employee ID: "+employee.getEmployeeID());
		System.out.println("Salary: "+employee.getSalary());
		System.out.println("Mobile Number: "+employee.getNumber());
		sc.close();
	}

}
