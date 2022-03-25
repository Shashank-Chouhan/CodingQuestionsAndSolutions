import java.util.Scanner;
public class Main{

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int count = 1;
  int num = 0;
  while(n>0)
  {
    int rem = n%10;
    num += count*Math.pow(10, rem-1);
    n /= 10;
    count++;
  }
  System.out.println(num);
 }
}