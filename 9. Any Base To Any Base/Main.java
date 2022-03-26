import java.util.*;
  
  public class Main{
       public static int anyBaseToAnyBase(int n, int b1, int b2){
         int res =0;
         int intermediate = anyBaseToDecimal(n, b1);
         res = decimalToAnyBase(intermediate, b2);
         return res;
       }
        
      public static int decimalToAnyBase(int n, int k){
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
    public static int anyBaseToDecimal(int n, int b){
      int num =0; int p=0;
      while(n>0)
      {
          int rem = n%10;
          num += rem * Math.pow(b, p);
          p++;
          n /= 10;
      }
      return num;
   }
  
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     System.out.println(anyBaseToAnyBase(n, sourceBase, destBase));
   }   
  }