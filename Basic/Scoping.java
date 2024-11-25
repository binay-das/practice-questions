package Basic;

public class Scoping {
    public static void main(String[] args) {
        int a = 6;
        System.out.println(a);
        a = 8;
        System.out.println(a);
        if (true) {
            int b = 10;
            System.out.println(b);
            // int a = 20;
        }
        // System.out.println(b);
    }
}
