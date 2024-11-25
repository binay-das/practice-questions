package leetcode.medium;

public class Q7 {
    public static void main(String[] args) {
        System.out.println(reverse(1012));
    }
    // 7. Reverse Integer

    //Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
    //Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

    public static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }

        return ans;
    }

}
