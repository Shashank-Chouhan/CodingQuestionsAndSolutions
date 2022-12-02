// import java.io.*;
// import java.util.*;
// import java.util.Arrays;
// import java.util.Collections;

// public class Main{

// public static void main(String[] args) throws Exception {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     Integer[] arr = new Integer[n];
//     for(int i=0; i<n; i++)
//     {
//         arr[i] = sc.nextInt();
//     }
//     int max = Collections.max(Arrays.asList(arr));

//     for(int i=max; i>0; i--)
//     {
//         for(int j=0; j<arr.length; j++)
//         {
//             if(arr[j]==max)
//                 {System.out.print("*\t");
//                 arr[j] -= 1;}
//             else
//                 System.out.print("\t");
//         }
//         max--;
//         System.out.println();
//     }
//  }

// }



import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
     Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr =new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    int max = -1;
    for (int i = 0; i < n; i++) {
       if( arr[i]> max){
           max =  arr[i];
       }
    }
    int temp = max;
    for (int i = 0; i < max; i++) {
        for (int j = 0; j < n; j++) {
            if(arr[j] >= temp){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
        }
        System.out.println();
            temp--;
    }
 }

}