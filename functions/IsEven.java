package functions;

public class IsEven {
    public static void main(String[] args) {
        System.out.println(isEven(13));
    }

    public static boolean isEven(int num) {
        return (num & 1) != 1;
    }
}
