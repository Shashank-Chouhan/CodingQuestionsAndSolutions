import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int k){
       // write code here
       int num =0; int p =0;
       while(n != 0)
       {
           int rem = n%k;
           num += rem*Math.pow(10, p);
           p++;
           n /= k;
       }
       return num;
   }
  }