/************************* PRINT FIBONACCI NUMBERS TILL N ************************
1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.

Input:
n

Output:
0
1
1
2
3
5
8
.. first n fibonaccis

Constraints:
1 <= n < 40

Sample Input:
10

Sample Output:
0
1
1
2
3
5
8
13
21
34

*/
import java.util.Scanner;
public class PrintFibonacciNumbersTillN{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int prev = 0;
        int curr = 1;
        for(int i=1;i<=n;i++){
            System.out.println(prev);
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
    }
}