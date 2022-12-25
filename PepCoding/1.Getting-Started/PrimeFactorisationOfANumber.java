/*********************  PRIME FACTORISATION OF A NUMBER  ****************************
1. You are required to display the prime factorization of a number.
2. Take as input a number n.
3. Print all its prime factors from smallest to largest.

Input:
n, an integer.

Output:
p1  p2  p3  p4.. all prime factors of n.

Constraints:
2 <= n < 10 ^ 9

Sample Input:
1440

Sample Output:
2 2 2 2 2 3 3 5

*/
import java.util.Scanner;
public class PrimeFactorisationOfANumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printPrimeSequence(n);
    }
    public static void printPrimeSequence(int n){
        for(int div=2;div*div<=n;div++){
            while(n%div==0){
                System.out.print(div+" ");
                n/=div; // exhausting value of n by removing all of its prime factors.
            }
        } 
        if(n>1){ 
// what if the number itself is prime or after exhausting all the possibility the number generated is prime,
// thus is itself a prime factor of itself.
        System.out.print(n);
        }
    }
}