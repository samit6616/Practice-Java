package org.example.codes;

import java.util.Scanner;

public class FactorialCalculator extends Thread {
    private int number;
    private long factorial;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        factorial = calculateFactorial(number);
    }

    public long getFactorial() {
        return factorial;
    }

    private long calculateFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        FactorialCalculator calculator = new FactorialCalculator(num);
        calculator.start();
        try {
            calculator.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Factorial of " + num + " is: " + calculator.getFactorial());
    }
}

