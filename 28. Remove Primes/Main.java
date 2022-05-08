import java.io.*;
import java.util.*;

public class Main {

	public static void solution(ArrayList<Integer> al){
		// for (int item : al) {
		// 	if(isPrime(item)){
		// 		al.remove(new Integer(item));
		// 	}
		// }
		// this didn't work because-----
		// The ConcurrentModificationException occurs when an object is tried to be modified concurrently when it is not permissible.
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			int x = (Integer)itr.next();
			if(isPrime(x)){
				itr.remove();
			}

		}
		
	}
	public static boolean isPrime(int n) {
		boolean flag = true;
		for (int i = 2; i*i <= n; i++) {
			if(n%i == 0)
				flag = false;
		}
		return flag;
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}