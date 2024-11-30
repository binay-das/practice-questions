package leetcode.easy;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    // 69. Sqrt(x)
    // Given a non-negative integer x, return the square root of x rounded down to
    // the nearest integer. The returned integer should be non-negative as well.

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        long left = 1;
        long right = x;
        long result = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) result;
    }
}
