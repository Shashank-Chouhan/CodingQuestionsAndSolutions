import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int s = sc.nextInt();
        int r = sc.nextInt();

        int[] oneDArray = ringToOneDArray(arr, s);

        rotateOneDArray(oneDArray, r);

        replacingRingByRotatedArray(arr, oneDArray, s);
        display(arr);
    }

    private static void replacingRingByRotatedArray(int[][] arr, int[] oneDArray, int s) {
        int minr = s - 1;
        int maxr = arr.length - s;
        int minc = s - 1;
        int maxc = arr[0].length - s;

        int size = 2 * (maxr + maxc - minr - minc);
//      System.out.println(size);
        int count = 0;

        //traverse left wall
        for (int i = minr, j = minc; i <= maxr; i++) {
            arr[i][j]= oneDArray[count];
            count++;
        }
        //traverse bottom wall
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            arr[i][j]= oneDArray[count];
            count++;
        }
        //traverse right wall
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            arr[i][j]= oneDArray[count];
            count++;
        }
        //traverse up wall
        for (int i = minr, j = maxc - 1; j >= minc + 1; j--) {
            arr[i][j]= oneDArray[count];
            count++;
        }

    }

    private static void rotateOneDArray(int[] oneDArray, int r) {
        r = r % oneDArray.length;
        if (r < 0) {
            r += oneDArray.length;
        }
        rotate(oneDArray, 0, oneDArray.length-r-1);
        rotate(oneDArray, oneDArray.length-r, oneDArray.length-1);
        rotate(oneDArray, 0, oneDArray.length-1);
    }

    private static void rotate(int[] arr, int lo, int hi) {
        while(lo<hi){
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
    }

   

    public static int[] ringToOneDArray(int[][] arr, int s) {
        int minr = s - 1;
        int maxr = arr.length - s;
        int minc = s - 1;
        int maxc = arr[0].length - s;

        int size = 2 * (maxr + maxc - minr - minc);

        int count = 0;

        int[] oneDArray = new int[12];

        //traverse left wall
        for (int i = minr, j = minc; i <= maxr; i++) {
            oneDArray[count] = arr[i][j];
            count++;
        }
        //traverse bottom wall
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            oneDArray[count] = arr[i][j];
            count++;
        }
        //traverse right wall
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            oneDArray[count] = arr[i][j];
            count++;
        }
        //traverse up wall
        for (int i = minr, j = maxc - 1; j >= minc + 1; j--) {
            oneDArray[count] = arr[i][j];
            count++;
        }


        return oneDArray;
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}