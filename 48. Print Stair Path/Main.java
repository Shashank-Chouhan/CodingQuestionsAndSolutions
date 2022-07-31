import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> al = getStairPaths(n);
        for (String var : al) {
            System.out.println(var);
        }
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }
        if(n<0){
            ArrayList<String> bres = new ArrayList<String>();
            return bres;
        }
        ArrayList<String> A = getStairPaths(n-1);
        ArrayList<String> B = getStairPaths(n-2);
        ArrayList<String> C = getStairPaths(n-3);

        ArrayList<String> res = new ArrayList<String>();
        for(String i: A){
            res.add("1"+i);
        }
        for(String i: B){
            res.add("2"+i);
        }
        for(String i: C){
            res.add("3"+i);
        }
        return res;
    }

}