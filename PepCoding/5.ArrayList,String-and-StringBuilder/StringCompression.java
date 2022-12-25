/***************************  STRING COMPRESSION ******************************
1. You are given a string. 
2. You have to compress the given string in the following two ways - 
   First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
   For "aaabbccdee", the compressed string will be "abcde".
   Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
   For "aaabbccdee", the compressed string will be "a3b2c2de2".

Input: 
A String

Output:
Two strings representing first compressed string and second compressed string respectively.

Constraints:
1 <= length of string <= 1000

Sample Input:
wwwwaaadexxxxxx

Sample Output:
wadex
w4a3dex6
*/

import java.util.*;
import java.io.*;

class StringCompression{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
    public static String compression1(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = str.charAt(0);
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(ch!=str.charAt(i)){
                sb.append(str.charAt(i));
                ch = str.charAt(i);
            }
        }
        return sb.toString();

    }
    public static String compression2(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = str.charAt(0);
        sb.append(ch);
        int count = 1;
        for(int i=1;i<str.length();i++){
            if(ch!=str.charAt(i)){
                if(count!=1){
                    sb.append(count);
                }
                sb.append(str.charAt(i));
                ch = str.charAt(i);
                count = 1;
            }else{
                count+=1;
            }
        }
        if(count!=1){
            sb.append(count);
        }
        return sb.toString();

    }
}