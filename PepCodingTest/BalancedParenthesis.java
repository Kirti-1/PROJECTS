/****
1.Take as input String.

Write a recursive function which tests if the brackets in expression are balanced or not and returns a Boolean value. Print the value returned.

Input Format

String representing S.

Constraints

Size of String may be large.

Output Format

print the output

Sample Input 0

[a+{b+(c+d)+e}+f]
Sample Output 0

true
*/


/**
Submission
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean ans = isBalancedParenthesis(str);
        System.out.println(ans);
    }
    public static boolean isBalancedParenthesis(String str){
        Stack<Character> st = new Stack<>();
        
       
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '[' || ch == '(' || ch == '{')
                st.push(ch);
            else if(ch == ']' || ch == ')' || ch == '}'){
                char temp = st.peek();
                if((ch == '}' &&  temp!= '{') || (ch == ')' && temp != '(') || (ch == ']' && temp != '[')){
                    return false;
                } else{
                    st.pop();
                }
            } 
        }
        return true;
        
    }
}

*/


import java.io.*;
import java.util.*;

public class BalancedParenthesis {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}