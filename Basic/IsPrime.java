package Basic;
import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a number: ");
        int n = sc.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
                return;
            } 
        }
        System.out.println(n + " is a prime number");
        sc.close();
    }
}
