package org.example;

public class Fibonacci {
    public static void  Fibonacci(String[] args) {
        int n = 10;
        System.out.println("Secesión de Fibonacci" + n + ":");

        for (int i = 0; i < n; i++) {
            System.out.println(testcalcularFibonacci(i) + " ");
        }
    }

    public static int testcalcularFibonacci(int n){
        if (n <= 1) {
            return n;
        } else {
            return testcalcularFibonacci(n - 1) + testcalcularFibonacci(n - 2);
        }
    }
}