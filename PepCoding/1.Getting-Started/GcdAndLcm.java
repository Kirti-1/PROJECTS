/************************ GCD AND LCM **********************
1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
3. Take input "num1" and "num2" as the two numbers.
4. Print their GCD and LCM.

Input:
num1
num2
.. the numbers whose GCD and LCM we have to find.

Output:
a
b
.. where 'a' and 'b' are the GCD and LCM respectively.

Constraints:
2 <= n <= 10^9

Sample Input:
36
24

Sample Output:
12
72

*/
import java.util.Scanner;
public class GcdAndLcm{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int gcd = gcdOfNumbers(num1,num2);
        int lcm = (num1*num2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
    public static int gcdOfNumbers(int n1,int n2){
        // while(n1!=n2){
        //     if(n1>n2){
        //         n1 = n1 - n2;
        //     }else{
        //         n2 = n2 - n1;
        //     }
        // }
        // return n1;

        // Euclidean Method
        int divisor = n1;
        int dividend = n2;
        while(divisor%dividend!=0){
            int rem = dividend%divisor;
            dividend = divisor;
            divisor = rem;
        }
        return dividend;
    }
}