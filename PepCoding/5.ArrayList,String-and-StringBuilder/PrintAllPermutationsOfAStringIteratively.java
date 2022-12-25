import java.util.*;
import java.io.*;

class PrintAllPermutationsOfAStringIteratively{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str  = br.readLine();
        allPermutations(str);        
    }
    public static void allPermutations(String str){
        int len = str.length();
        int tnp = 1;
        int i = len;
        for(;i>0;tnp*=i,i--);
        for(;i<tnp;i++){
            int temp = i;
            StringBuilder sb = new StringBuilder(str);
            int k = len;
            while(k>0){
                int rem = temp%k;
                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
                temp/=k;
                k--;
            }
            System.out.println();
        }

    }
}