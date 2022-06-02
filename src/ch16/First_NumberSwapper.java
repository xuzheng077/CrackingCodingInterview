package ch16;

/**
 * @author Xu Zheng
 * @description
 */
public class First_NumberSwapper {

    public static void main(String[] args) {
        //approach 1
        int a = 1;
        int b = 2;
        System.out.println("a: " + a + " b: " + b);
        a = a - b;
        b = b + a;
        a = b - a;
        System.out.println("a: " + a + " b: " + b);

        //approach 2, this works for all data types
        int c = 1;
        int d = 2;
        System.out.println("c: " + c + " d: " + d);
        c = c ^ d;
        d = c ^ d;
        c = c ^ d;
        System.out.println("c: " + c + " d: " + d);

    }
}
