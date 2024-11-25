package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number");
            sc.close();
            return;
        }

        int a = 0, b = 1;
        System.out.print(a + " ");
        if (n > 1) {
            System.out.print(b + " ");
        }
        for (int i = 3; i <= n; i++) {
            int fibo = a + b;
            System.out.print(fibo + " ");
            a = b;
            b = fibo;
        }
        sc.close();
    }
}
