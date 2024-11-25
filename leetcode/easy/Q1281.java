package leetcode.easy;

public class Q1281 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

    // Subtract the Product and Sum of Digits of an Integer
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            product = product * digit;
            sum = sum + digit;
            n /= 10;
        }
        return product - sum;
    }
}
