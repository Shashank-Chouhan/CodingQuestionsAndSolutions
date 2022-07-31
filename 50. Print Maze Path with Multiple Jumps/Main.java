import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (String var : getMazePaths(1,1,n,m)) {
            System.out.println(var);
        }
        
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        //base
        if(sr==dr && sc==dc){
            ArrayList<String> name = new ArrayList<String>();
            name.add("");
            return name;
        }
        ArrayList<String> res = new ArrayList<>();
        
        ArrayList<String> horPaths = new ArrayList<>();
        ArrayList<String> verPaths = new ArrayList<>();
        ArrayList<String> diagPaths = new ArrayList<>();



        for (int movesize = 1; movesize <= dc-sc; movesize++) {
            horPaths = getMazePaths(sr, sc+movesize, dr, dc);
            for (String hpath : horPaths) {
                res.add("h" + movesize + hpath);
            }
        }
        for (int movesize = 1; movesize <= dr-sr; movesize++) {
            verPaths = getMazePaths(sr+movesize, sc, dr, dc);
            for (String vpath : verPaths) {
                res.add("v" + movesize + vpath);
            }
        }
        for (int movesize = 1; movesize<=dc-sc && movesize<=dr-sr; movesize++) {
            diagPaths = getMazePaths(sr+movesize, sc+movesize, dr, dc);
            for (String dpath : diagPaths) {
                res.add("d" + movesize + dpath);
            }
        }

   
        return res;
   }

}