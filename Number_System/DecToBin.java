package Number_System;

import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        System.out.println(DecToBinEq(n));
        sc.close();
    }

    public static int DecToBinEq(int n) {
        int ans = 0;
        int i = 0;

        while (n != 0) {
            int bit = n & 1;    // Get the least significant bit
            ans += bit * (int)(Math.pow(10, i));
            n >>= 1;    // Right shift the number to process the next bit
            i++;
        }

        return ans;
    }
}
