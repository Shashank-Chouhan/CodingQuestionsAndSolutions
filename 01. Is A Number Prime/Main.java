import java.util.*;
  
  public class Main{
  
  public static void isPrime(int n) {
    String res = "prime";
    for(int i=2; i*i<=n;i++)
    {
      if(n%i == 0)
      res = "not prime";
    }
    System.out.println(res);
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for(int k=0; k<t; k++)
      {
        int n = sc.nextInt();
        isPrime(n);
      }
       
   }
  }