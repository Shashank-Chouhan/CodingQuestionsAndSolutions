import java.io.*;
import java.util.*;

public class Main{
    public static void sumOfTwoArrays(int[] arr1, int n1, int[] arr2, int n2) {
        int m = Math.max(n1, n2)+1;
        int []res = new int[m];
        int carry =0;
        int a = n1-1;
        int b = n2-1;

        for(int i=m-1; i>=0; i--)
        {
            int X; int Y;
            if(a>=0) X=arr1[a]; else X=0;
            if(b>=0) Y=arr2[b]; else Y=0;

            int sum = X + Y + carry;
            
            int rem = sum%10;
            carry = sum/10;
            
            res[i] = rem;

            a--; b--;
        }
        if(res[0]==0)
        {
            for(int i=1; i<m; i++)
            System.out.println(res[i]);
        }
        else{
            for (int var : res) {
            System.out.println(var);
        }
        }
        
    }

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int []arr1 = new int[n1];
    for(int i=0; i<n1; i++){
        arr1[i] = sc.nextInt();
    }
    int n2 = sc.nextInt();
    int []arr2 = new int[n2];
    for(int i=0; i<n2; i++){
        arr2[i] = sc.nextInt();
    }

    sumOfTwoArrays(arr1, n1, arr2, n2);
 }

}