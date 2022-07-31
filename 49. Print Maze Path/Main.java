import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getMazePaths(1,1,n,m));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sc == dc && sr == dr){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<String>();
        if(sc < dc){
            hpaths = getMazePaths(sr, sc+1, dr, dc);
        }
        if(sr < dr){
            vpaths = getMazePaths(sr+1, sc, dr, dc);
        }
        ArrayList<String> finalres = new ArrayList<String>();

        for (String i : hpaths) {
            finalres.add("h"+i);
        }
        for (String i : vpaths) {
            finalres.add("v"+i);
        }

        return finalres;
    }

}