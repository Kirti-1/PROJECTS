/*********************** DIGITS OF A NUMBER ********************************
1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.

Input:
"n" where n is any integer.

Output:
d1
d2
d3
... digits of the number

Constraints:
1 <= n < 10^9

Sample Input:
65784383

Sample Output:
6
5
7
8
4
3
8
3

Be aware of edge cases like 298721000, last zeros - if you're travelling from left to right and extracting first digit at once.

 */
import java.util.Scanner;
public class DigitsOfaNumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // first digit
        int pow = power(n);
        printSequence(n,pow);
    }
    public static int power(int n){
        int pow = 1;
        while(n>=10){
            n/=10;
            pow*=10;
        }
        return pow;
    }
    public static void printSequence(int n, int pow){
        while(pow>0){ // to handle the edge case i.e. 123200
        // or else you could handle it using number of digits and extracting first digit.
        // till numberOfDigits>0 run the loop 
            System.out.println(n/pow);
            n = n%pow;    
            pow/=10;
        }
    }
}