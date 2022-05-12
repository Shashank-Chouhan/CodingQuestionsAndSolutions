import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        // write ur code here
        if(idx == arr.length){
            int[] p = new int[0];
            return p;
        }
        int fele = arr[idx];
        int[] arr2 = allIndices(arr, x, idx+1, fsf);
        if(fele == x){
            int[] arr3 = new int[arr2.length+1];
            arr3[0]=idx;
            for (int i = 1; i < arr3.length; i++) {
                arr3[i] = arr2[i-1];
            }
            fsf = arr3.length; 
            return arr3;
        }
        else
        {
            fsf = arr2.length;
            return arr2;
        }
        
    }

}