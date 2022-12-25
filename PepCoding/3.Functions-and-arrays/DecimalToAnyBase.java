/******************* DECIMAL TO ANY BASE ******************
1. You are given a decimal number n.
2. You are given a base b.
3. You are required to convert the number n into its corresponding value in base b.

Input:
A number n
A base b

Output:
A number representing corresponding value of n in number system of base b

Constraints:
0 <= d <= 512
2 <= b <= 10
*/
import java.util.Scanner;
public class DecimalToAnyBase{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int ans = DecimalTobBase(n,b);
        System.out.print(ans);
    }
    private static int DecimalTobBase(int n, int b){
        int pow = 1;
        int ans = 0;
        while(n>0){
            int rem = n%b;
            ans += rem*pow;
            pow *= 10;
            n /= b;
        }
        return ans;
    }
}