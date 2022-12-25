/****************************** PATTERN 9 *************************
1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.

Input Format
A number n

Constraints
1 <= n <= 100
Also, n is odd.

Sample Input
5

Sample Output

*                               *       
        *               *
                *
        *               *
*                               *	

*/

import java.util.*;
public class Pattern9{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Iterative Solution
        iterativePrinting(n);

        System.out.println();
                
        // Recursive Solution
        // required - i(row), j(col), n(range of i and j)
        recursivePrinting(1,1,n);
    }
    public static void iterativePrinting(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((n-i+1)==j || i==j){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void recursivePrinting(int i, int j, int n){
        if(i == n+1){
            return;
        }
        if(j>n){
            System.out.println();
            recursivePrinting(i+1, 1, n);
        }else if(j == (n-i+1)){
            System.out.print("*\t");
            recursivePrinting(i, j+1, n);
        }else if(i==j){
            System.out.print("*\t");
            recursivePrinting(i, j+1, n);
        }else{
            System.out.print("\t");
            recursivePrinting(i, j+1, n);
        }
    
    }

}