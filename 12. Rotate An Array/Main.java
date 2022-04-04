import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
    int len = a.length;
    int [] res = new int[len];
    k = k%len;
    if(k<0)
    k = len+k;
    int p=0;
    for(int i=len-k; i<len; i++)
    {
      res[p] = a[i];
      p++;
    }
    for(int i=0; i<len-k; i++)
    {
      res[p] =a[i];
      p++;
    }
    for (int i=0; i<len; i++) {
      a[i] = res[i];
    }

  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}