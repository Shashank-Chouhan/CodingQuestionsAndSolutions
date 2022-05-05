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

        for(int row=0; row<n; row++){
//find Row
            int[] rowArray = new int[n];
            for(int j=0; j<n; j++){
                rowArray[j]= arr[row][j];
            }
//find minimum in rowArray
            int minInArray = minimum(rowArray);
//checking for minimum in row
            int colNo = 0;
            for(int j=0; j<n; j++){
                if(arr[row][j]== minInArray){
                    colNo = j;
                    break;
                }
            }
//getting the column array of minimum element of the row
            int[] colArray= new int[n];
            for(int i=0; i<n; i++){
                colArray[i]= arr[i][colNo];
            }
//find maximum in colArray
            int maxInArray = maximum(colArray);
//checking for max in colArray          
            if(arr[row][colNo]==maxInArray){
                System.out.println(arr[row][colNo]);
                break;
            }
            if(row==n-1)
            {
                System.out.println("Invalid input");
            }
            

            
        }


    }
    public static int minimum(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int var : arr) {
            if(var<min){
                min = var;
            }
        }
        return min;
    }
    public static int maximum(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int var : arr) {
            if(var>max){
                max = var;
            }
        }
        return max;
    }
}