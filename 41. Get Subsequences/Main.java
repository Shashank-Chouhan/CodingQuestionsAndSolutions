import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> baseres = new ArrayList<String>();
            baseres.add("");
            return baseres;
        }
        char ch = str.charAt(0);        //a
        String ros = str.substring(1);  //bc
        ArrayList<String> rres = gss(ros);

        ArrayList<String> finalres = new ArrayList<String>();

        for (String item : rres) {
            finalres.add(""+item);
        }
        for (String item : rres) {
            finalres.add(ch+item);
        }
        return finalres;
   }

}