package org.example.codes;

import java.util.*;

public class TestStream {
    private final String name;
    private final double salary;

    public TestStream(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TestStream{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<TestStream> list = Arrays.asList(
                new TestStream("Amit", 20000.0),
                new TestStream("Amod", 4000.0),
                new TestStream("Pintu", 24000.0),
                new TestStream("Rahul", 4500.0));
        Optional<TestStream> secHighSal = list.stream().sorted(Comparator.comparingDouble(TestStream::getSalary).reversed()).skip(1).findFirst();
        secHighSal.ifPresentOrElse(
                testStream -> System.out.println("The Second highest salary is: " + testStream.getSalary() + " (Employee: " + testStream.getName() + ")"),
                () -> System.out.println("There is less than 2 employees")
        );
    }
}

