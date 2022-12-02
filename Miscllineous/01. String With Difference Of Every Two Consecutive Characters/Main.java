import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		String res = ""+str.charAt(0);
		int j = 1;
		while(j<str.length()){
		    char prevch = str.charAt(j-1);
			int prev = (int)prevch;
			char currch = str.charAt(j);
			int curr = (int)currch;
			int diff = (curr- prev);
			res += ""+diff + currch ;
			j++;
		}

		return res;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}