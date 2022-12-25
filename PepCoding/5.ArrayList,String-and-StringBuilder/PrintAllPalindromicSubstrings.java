/************************** PRINT ALL PALINDROMIC SUBSTRINGS **************************
1. You are given a string. 
2. You have to print all palindromic substrings of the given string.

Input:
A String

Output:
All palindromic substrings(one in a line).
First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.

Constraints:
1 <= length of string <= 500

*/
import java.util.*;
import java.io.*;

class PrintAllPalindromicSubstrings{
    private static Boolean isPalindromic(String str){
        for(int i=0,j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){ // str[i]!=str[j] ERROR - array required, but String found
                return false;
            }
        }
        return true;
    }
    public static void palindromicSubstrings(String str){
        int len = str.length();
        for(int sp=0;sp<len;sp++){
            for(int ep=sp;ep<len;ep++){
                String subStr = str.substring(sp,ep+1);
                if(isPalindromic(subStr)){
                    System.out.println(subStr);
                }
            }
        }
    } 
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        palindromicSubstrings(str);
    }
}