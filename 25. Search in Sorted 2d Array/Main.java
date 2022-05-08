import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]= sc.nextInt();
            }             
        }
        int x = sc.nextInt();

        int a= 0;
        int b= n-1;

        for(int r=0; r<n; r++){
            if(arr[r][a]<x && x<arr[r][b]){
                for(int c=0; c<n; c++){
                    if(arr[r][c]==x){
                        System.out.println(r);
                        System.out.println(c);
                        return;
                    }
                }
            }
        }
        System.out.println("Not Found");
    }
}