/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(n>0){
		    String data = br.readLine();
		    if(isLapindrome(data)){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		    n--;
		}
	}
	public static boolean isLapindrome(String data){
	    int l = data.length();
	    int flag = 1;
	    int []freq = new int[26];
	    for(int i=0,j=l-1;i<j;i++,j--){
	        freq[(int)data.charAt(i)-97]+=1;
	        freq[(int)data.charAt(j)-97]+=1;
	    }
	    for(int i=0;i<26;i++){
            // System.out.print(freq[i]+" ");
	        if(freq[i]%2!=0){
	            flag = 0;
	            break;
	        }
	    }
	    
	    return flag==1;
	}
}
