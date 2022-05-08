import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        transpose(arr, n);
        // display(arr);

        reverseTheTranspose(arr, n);
       
        
        display(arr);


    }
    public static void transpose(int[][] arr, int n){
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void reverseTheTranspose(int[][] arr, int n){
        int lo= 0;
        int hi= n-1;

        while(lo<=hi)
        {
            for(int i=0; i<n; i++)
            {
                int temp= arr[i][lo];
                arr[i][lo] = arr[i][hi];
                arr[i][hi] = temp;
            }
            lo++;
            hi--;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}