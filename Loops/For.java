package Loops;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            System.out.print(i + " --> ");
            if (i % 2 == 0) {
                System.out.println("Even");

            } else {
                System.out.println("Odd");
            }
        }
    }
}
