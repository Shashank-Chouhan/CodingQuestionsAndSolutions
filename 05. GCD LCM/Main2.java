import java.io.*;
import java.util.*;

public class Main2 {
    public static int gcd(int n1, int n2) {
        while (true) {
            int rem = n1 % n2;
            if (rem == 0) {
                return n2;
            } else {
                n1 = n2;
                n2 = rem;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int gcd = gcd(n1, n2);
        System.out.println(gcd);
        System.out.println(lcm(n1, n2));

    }

    private static int lcm(int n1, int n2) {
        return n1*n2/gcd(n1, n2);
    }
}