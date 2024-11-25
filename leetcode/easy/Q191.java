package leetcode.easy;

public class Q191 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }

    // Number of 1 Bits
    // Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n&1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
