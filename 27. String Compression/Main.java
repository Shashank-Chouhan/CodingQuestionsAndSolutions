import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
		String res = " ";
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) != res.charAt(res.length()-1)){
				res += Character.toString(str.charAt(i));
			}
			
		}

		return res.substring(1);
	}

	public static String compression2(String str){
		// write your code here
		str+="#";
		int i=0;
		int j=0;
		String res="";
		while(true){
			if(str.charAt(i)==str.charAt(j)){
				j++;
			}
			else if((j-i)!=1){
				res+=Character.toString(str.charAt(i))+(j-i);
				i = j;
			}
			else{
				res+=Character.toString(str.charAt(i));
				i = j;
			}
			if(j==str.length())
			break;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}