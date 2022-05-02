import java.io.*;
import java.util.*;

public class Main2 {
    public static void rotate(int[] a, int k) {
        int len = a.length;
        k = k % len;
        if (k < 0)
            k = len + k;
        int lo = 0;
        int hi = len - 1;
        while (lo < hi) {
            int temp = a[lo];
            a[lo] = a[hi];
            a[hi] = temp;
            lo++;
            hi--;
        }
        lo = 0;
        hi = k - 1;
        while (lo < hi) {
            int temp = a[lo];
            a[lo] = a[hi];
            a[hi] = temp;
            lo++;
            hi--;
        }
        lo = k;
        hi = len - 1;
        while (lo < hi) {
            int temp = a[lo];
            a[lo] = a[hi];
            a[hi] = temp;
            lo++;
            hi--;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {10, 20, 30, 40, 50};
        int k = -16;
        rotate(a, k);
        for (int var : a) {
            System.out.println(var);
        }
    }

}

