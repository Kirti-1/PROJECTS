/************************** PATTERN 6 **************************
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

*       *       *               *       *       *       
*       *                               *       *
*                                               *
*       *                               *       *
*       *       *               *       *       *

*/

import java.util.Scanner;

public class Pattern6{
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
        int nsp = 1; // n is odd, so no need to do, n/2-1(for even value of n)
        int nstr = n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nstr;j++){
                System.out.print("*\t");
            }
            for(int sp=1;sp<=nsp;sp++){
                System.out.print("\t");
            }
            for(int j=1;j<=nstr;j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                nsp+=2;
                nstr--;
            }else{
                nsp-=2;
                nstr++;
            }
            System.out.println();
        }
    }
    public static void recursivePrinting(int i, int j, int n, int nsp, int nstr){
        if(i == n+1){
            return;
        }
        if(j>(nsp+(2*nstr))){
            System.out.println();
            if(i<=n/2){
                recursivePrinting(i+1, 1, n, nsp+2, nstr-1);
            }else{
                recursivePrinting(i+1, 1, n, nsp-2, nstr+1);
            }
        }
        else if(j<=nstr){
            System.out.print("*\t");
            recursivePrinting(i, j+1, n, nsp, nstr);
        }else if(j<=(nstr+nsp)){
            System.out.print("\t");
            recursivePrinting(i, j+1, n, nsp, nstr);
        }else{
            System.out.print("*\t");
            recursivePrinting(i, j+1, n, nsp, nstr);
        }
        
    }

    public static void recursivePrinting(int i, int j, int n){
        int nsp = 1;
        int nstr = n/2+1;
        recursivePrinting(i, j, n, nsp, nstr);    
    }

}