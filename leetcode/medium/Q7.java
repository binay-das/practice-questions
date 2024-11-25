package leetcode.medium;

public class Q7 {
    public static void main(String[] args) {
        System.out.println(reverse(1012));
    }
    // 7. Reverse Integer

    //Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
    //Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

    public static int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int rem = x % 10;
            if (reverse > Integer.MAX_VALUE / 10 || reverse == Integer.MAX_VALUE && rem > 7) {
                return 0;   
                
                // if reverse > Integer.MAX_VALUE / 10, multiplying it by 10 will cause overflow,
                // now if reverse = Integer.MAX_VALUE / 10, then the rem to be added should not be greater than 7, otherwise overflow will occur
            }
            if (reverse < Integer.MIN_VALUE / 10 || reverse == Integer.MIN_VALUE && rem < -8) {

                // if reverse < Integer.MIN_VALUE / 10, multiplying it by 10 will cause overflow,
                // now if reverse = Integer.MIN_VALUE / 10, then the rem to be added should not be lesser than -8, otherwise overflow will occur
                return 0;
            }
            reverse = reverse * 10 + rem;
            x /= 10;
        }

        return reverse;
    }

}
