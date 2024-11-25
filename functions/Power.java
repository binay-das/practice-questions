package functions;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(3,2));
    }


    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}
