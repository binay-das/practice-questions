package leetcode.easy;

public class Q1009 {
    public static void main(String[] args) {
        
    }

    // 1009. Complement of Base 10 Integer
    // The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

    public static int bitwiseComplement(int n) {
        if (n == 0) {   // edge case
            return 1;
        }
        int m = n;
        int mask= 0;

        while (m != 0) {
            mask = (mask << 1) | 1;
            m = m >> 1;
        }

        int ans = (~n) & mask;
        return ans;
    }
}
