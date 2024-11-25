package leetcode.easy;

public class Q231 {
    public static void main(String[] args) {
        
    }

    // 231. Power of Two
    // Given an integer n, return true if it is a power of two. Otherwise, return false.
    // An integer n is a power of two, if there exists an integer x such that n == 2x.

    public static boolean isPowerOfTwo(int n) {
        int num = 1;
        for (int i = 0; i <= 30; i++) {
            if (num == n) {
                return true;
            }
            if (num < Integer.MAX_VALUE / 2) {
                num = num * 2;
            }
        }
        return false;
    }
}
