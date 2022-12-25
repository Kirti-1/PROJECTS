/************************* COUNT DIGITS IN A NUMBER *****************************
1. You've to count the number of digits in a number.
2. Take as input "n", the number for which the digits has to be counted.
3. Print the digits in that number.

Input:
"n" where n is any integer.

Output:
"d" where d is the number of digits in the number "n"

Constraints:
1 <= n < 10^9

Sample Input:
65784383

Sample Output:
8

*/
import java.util.Scanner;
public class CountNumberOfDigits{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = digitCount(n);
        System.out.println(d);
    }
    public static int digitCount(int n){
        int count = 0;
        //1st Method
        // while(n>0){
        //     count++;
        //     n/=10;
        // }
        //2nd Method
        // count = (int)Math.floor(Math.log10(n)+1);
        // 3rd Method
        for(;n>0;n/=10,count++);
        return count;
    }
}