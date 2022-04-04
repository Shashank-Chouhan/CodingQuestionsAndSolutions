import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }

    for(int i=0; i<Math.pow(2, n); i++)
    {
        String ans=""; 
        int temp = i;
        for(int j=n-1; j>=0; j--)
        {
            int rem = temp%2;
            temp /= 2;
            if(rem==1)
            {
                ans= arr[j] +"\t"+ans;
            }
            else
            {
                ans = "-\t"+ans;
            }
        }
        System.out.println(ans);
    }
    
 }

}