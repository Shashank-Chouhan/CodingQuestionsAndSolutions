import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer[] arr = new Integer[n];
    for(int i=0; i<n; i++)
    {
        arr[i] = sc.nextInt();
    }
    int max = Collections.max(Arrays.asList(arr));

    for(int i=max; i>0; i--)
    {
        for(int j=0; j<arr.length; j++)
        {
            if(arr[j]==max)
                {System.out.print("*\t");
                arr[j] -= 1;}
            else
                System.out.print("\t");
        }
        max--;
        System.out.println();
    }
 }

}