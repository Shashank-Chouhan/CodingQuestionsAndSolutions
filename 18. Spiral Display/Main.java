import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int m= sc.nextInt();
    int [][]arr = new int[n][m];

    for(int i=0; i<n; i++)
    {
        for(int j=0; j<m;j++)
        {
            arr[i][j]= sc.nextInt();
        }
    }

    int count=0;
    int te = m*n;
    int minr =0;
    int minc =0;
    int maxr =n-1;
    int maxc =m-1;
    while(count<te)
    {
        for(int i=minr, j=minc; i<=maxr && count<te; i++){
            System.out.println(arr[i][j]);
            count++;
        }minc++;
        for(int i=maxr, j=minc; j<=maxc && count<te; j++) {
            System.out.println(arr[i][j]);
            count++;
        }maxr--;
        for(int i=maxr, j=maxc; i>=minr && count<te; i--){
            System.out.println(arr[i][j]);
            count++;
        }maxc--;
        for(int i=minr, j=maxc; j>=minc && count<te; j--){
            System.out.println(arr[i][j]);
            count++;
        }minr++;
    }
}
}