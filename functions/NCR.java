package functions;

public class NCR {
    public static void main(String[] args) {
        System.err.println(nCr(13, 0));
    }

    public static int nCr(int n, int c) {
        if (c > n) {
            return 0;
        }
        return factorial(n) / (factorial(c) * factorial(n - c));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
