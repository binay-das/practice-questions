package Bitwise;

public class Bitwise {
    public static void main(String[] args) {
        int a = 4, b = 6;
        System.out.println(a + " " + b);   
        
        System.out.println("a & b: " + (a&b));
        System.out.println("a | b: " + (a|b));
        System.out.println("~a:   " + (~a));
        System.out.println("a ^ b: " + (a^b));

        int i = 7;
        System.out.println(i);
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(i--);
        System.out.println(--i);
    }

}
