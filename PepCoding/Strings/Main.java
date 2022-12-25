import java.io.*;
import java.util.*;

public class Main {
    

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        printEncodings(str);
    }

    public static void printEncodings(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        if(str.charAt(0) == '0'){
            return;
        }
        // mapping character for single call
        char ch0 = str.charAt(0);
        char mchs = (char)((ch0 - '0') + 'a' - 1);
        // Single call
        String ros1 = str.substring(1);
        printEncodings(ros1, asf + mchs);

        // pairing 
        if(str.length()>=2){
            //double call
            char ch1 = str.charAt(1);
            int u = ch1 - '0';
            int t = ch0 - '0';
            int val = t * 10 + u;

            if(val<=26){
                String ros2 = str.substring(2);
                // character for paired integers less than 27  
                char mchp = (char)(val + 'a' - 1);
                printEncodings(ros2,asf + mchp);
            }
        }
                
    }

}