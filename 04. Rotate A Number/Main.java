import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int k = sc.nextInt();
     int res =0; int len = 0; int temp = n;
     //find length
     while(temp>0)
     {
      temp /= 10;
      len++;
     }

     k=k%len;// this line is important.
     if(k<0)
      k = len + k;
     
     int mul =1; int div = 1;

     for(int i=0; i<len; i++)
     {
       if(i<k)
       {
         div *= 10;
       }
       else
       {
         mul *= 10;
       }
     }
     
     int rem = n % div;
     rem = rem*mul;
     int quo = n /div;
     res = rem + quo;
     System.out.println(res);
    }
   }