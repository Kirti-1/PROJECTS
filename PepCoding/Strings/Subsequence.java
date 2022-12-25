import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList<String> ss = gssNaiveOrderDifferent(str);
        System.out.println(ss);
    }

    public static ArrayList<String> gssNaiveOrderDifferent(String str) {
        int len = str.length();
        int n = (int)Math.pow(2,len);
        ArrayList<String> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add("");
            int k = 0;
            int temp = i;
            while(k<len){
                int rem = temp%2;
                if(rem==1){
                    a.set(i,a.get(i) + str.charAt(k));
                }else{
                    a.set(i,a.get(i) + "");
                }
                temp/=2;
                k++;
            }
        }
        return a;
    }
    private static int[] bin(int n){
        
    }
    public static ArrayList<String> gssNaiveCorrectOrder(String str){
        int len = str.length();
        int n = (int)Math.pow(2,len);
        ArrayList<String> a = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            a.add("");
            int k = 0;
            int temp = i;
            while(k<len){
                int rem = temp%2;
                if(rem==1){
                    a.set(i,a.get(i) + str.charAt(k));
                }else{
                    a.set(i,a.get(i) + "");
                }
                temp/=2;
                k++;
            }
        }
        return a;
     }

}