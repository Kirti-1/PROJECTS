/*
**********************        DUPLICATE BRACKETS           *************************
1. You are given a string exp representing an expression.
2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
3. But, some of the pair of brackets maybe extra/needless. 
4. You are required to print true if you detect extra brackets and false otherwise.

e.g.'
((a + b) + (c + d)) -> false
(a + b) + ((c + d)) -> true
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;


class DuplicateBrackets {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        // String exp = "(a+b)+(c+(d+e))";
        boolean ans = isDuplicateBracketPresent(exp);
        System.out.println(ans);
    }
    public static boolean isDuplicateBracketPresent(String exp) {
        char[] data = new char[exp.length()];

        // if character of string is opening bracket - then insert into the array - O(1)
        // if operand or operation encountered - a-zA-Z0-9 +,-,%,/ then insert into array - O(1)
        // if closing bracket encountered then remove till opening bracket encountered - opening bracket will be encountered as brackets are balanced
        int idx = -1;
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch == '('){
                idx = idx + 1;
                data[idx] = ch;
            }else if((ch>='a' && ch<='z') || ch == '+' || ch == '-' || ch =='/' || ch == '%'){
                idx = idx + 1;
                data[idx] = ch;
            }else if(ch == ')'){
                // closing bracket
                int flag = 0;
                while(data[idx]!='('){
                    flag = 1;
                    idx = idx - 1;
                }
                idx = idx - 1;
                if(flag == 0){
                    return true;
                }
            }
        }
        return false;
    }
}