import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> name =getKPC(str);
        System.out.println(name);
    }
    static String[] keys = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> p = new ArrayList<String>();
            p.add("");
            return p;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> resRos = getKPC(ros);
        String strCh = keys[ch - '0'];
        ArrayList<String> finalRes = new ArrayList<String>();

        for (int i = 0; i < strCh.length(); i++) {
            for (String s : resRos) {
                finalRes.add(strCh.charAt(i)+s);
            }
        }
        return finalRes;
    }

}