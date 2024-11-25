package Number_System;

import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int n = sc.nextInt();
        System.out.println(BinToDecEq(n));
        sc.close();
    }

    public static int BinToDecEq(int n) {
        int ans = 0, i = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit == 1){
                ans += Math.pow(2, i);
            }
            n = n / 10;
            i++;            
        }
        return ans;
    }
}
