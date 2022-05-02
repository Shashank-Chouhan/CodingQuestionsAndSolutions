import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i]= sc.nextInt();
    } 
    int target = sc.nextInt();

    int li = -1;
    int fi = -1;
    //First Index
    int lo = 0;
    int hi = n-1;
    while(lo<=hi)
    {
        int mid = lo + (hi-lo)/2;
        if(arr[mid]==target)
        {
            fi = mid;
            hi = mid-1;
        }
        else if(arr[mid]<target)
        {
            lo = mid+1;
        }
        else
        {
            hi = mid-1;
        }
    }
    //Last Index
    lo = 0;
    hi = n-1;
    while(lo<=hi)
    {
        int mid = lo + (hi-lo)/2;
        if(arr[mid]==target)
        {
            li = mid;
            lo = mid+1;
        }
        else if(arr[mid]<target)
        {
            lo = mid+1;
        }
        else
        {
            hi = mid-1;
        }
    }
    System.out.println(fi);
    System.out.println(li);

 }
}