package Loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int i = 0;
        while (i < n) {
            System.out.print(i + " --> ");
            if (i % 2 == 0) {
                System.out.println("Even");

            } else {
                System.out.println("Odd");
            }

            i++;
        }
    }
}
