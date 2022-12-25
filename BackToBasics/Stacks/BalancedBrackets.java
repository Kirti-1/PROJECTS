/*
****************************************** BALANCED BRACKETS *********************************
1. You are given a string exp representing an expression.
2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

e.g.
[(a + b) + {(c + d) * (e / f)}] -> true
[(a + b) + {(c + d) * (e / f)]} -> false
[(a + b) + {(c + d) * (e / f)} -> false
([(a + b) + {(c + d) * (e / f)}] -> false
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class BalancedBrackets {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        boolean ans = isBracketBalanced(exp);
        System.out.println(ans);
    }
    public static boolean isBracketBalanced(String exp) {
        int len = exp.length();
        char[] data = new char[len];
        int idx = -1;
        for(int i=0;i<len;i++){
            char ch = exp.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                idx = idx + 1;
                if(idx>-1){
                    data[idx] = ch;
                }
            }else if(ch == ')' || ch == '}' || ch == ']') { 
                if(idx == -1){
                    return false;
                }
                if(idx>-1  && ((ch == '}' && data[idx]!='{') || (ch == ')' && data[idx]!='(') || (ch == ']' && data[idx]!='['))) {
                    return false;
                }
                idx = idx - 1; 
            }
        }
        if(idx!=-1){
            return false;
        }
        return true;
    }
}