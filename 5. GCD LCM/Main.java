import java.util.*;
    
    public class Main{
    
    public static int gcd(int a, int b) {
      int res = 0;
      int min = a<b ? a : b;
      for(int i=min; i>=1; i--)
      {
        if(a%i==0 && b%i==0)
          {
          res= i;
          break;
          }
      }
      return res;
    }
    public static int lcm(int a, int b) {
      int res = 0;
      int max = a>b ? a : b;
      for(int i= max; true; i++)
      {
        if(i%a==0 && i%b==0)
          {
          res=  i;
          break;
          }
      }
      return res;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();

      System.out.println(gcd(num1, num2));
      System.out.println(lcm(num1, num2));

     }
    }