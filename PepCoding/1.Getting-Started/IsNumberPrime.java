/************************ IS NUMBER PRIME ***************************

1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

Input : 
A number t
A number n
A number n
.. t number of times

Output:
prime
not prime
not prime
.. t number of times

Constraints:
1 <= t <= 10000
2 <= n < 10^9

Sample Input:
5
13
2
3
4
5

Sample Output:
prime
prime
prime
not prime
prime

************************/
import java.util.*;

public class IsNumberPrime {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int flag = 0;
            int n = scn.nextInt();
            for(int div=2;div*div<=n;div++){
                if(n%div==0){
                    flag = 1;
                    break;
                }
            }
            if(flag!=1){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }
        
    }
}