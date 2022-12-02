import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printEncodings(str, "");
    }

    public static void printEncodings(String que, String asf) {
        if(que.length()==0){
            System.out.println(asf);
            return;
        }
        else if(que.length()==1){
            char ch = que.charAt(0);
            if(ch=='0'){      // 0
                return;
            }
            else{           // 5, 6, 7
                int chv = ch - '0';
                char code = (char)('a'-1 + chv);
                asf = asf + code;
                System.out.println(asf);
            }
        }
        else{
            //taking first char only
            char ch = que.charAt(0);
            String roq = que.substring(1);

            if(ch=='0'){      // 0
                return;
            }
            else{           // 55, 632, 127
                int chv = ch - '0';
                char code = (char)('a'-1 + chv);
                printEncodings(roq, asf+code);
            }
            //taking two chars
            String ch12 = que.substring(0,2);
            String roq12 = que.substring(2);
            int ch12v = Integer.parseInt(ch12);
            if(ch12v <= 26){
                char code = (char)('a'-1 + ch12v);
                printEncodings(roq12, asf+code);

            } 
        }        
    }

}