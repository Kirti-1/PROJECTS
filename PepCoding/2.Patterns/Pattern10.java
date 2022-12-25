/************************ PATTERN 10 **************************\
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

                *
        *               *
*                               *
        *               *
                *

*/

import java.util.*;
public class Pattern10{
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
        int nsp1 = n/2;
        int nsp2 = 0;
        for(int i=1;i<=n;i++){
            for(int sp=1;sp<=nsp1;sp++){
                System.out.print("\t");
            }
            if(i!=1 && i!=n)
                System.out.print("*\t");
            for(int sp=1;sp<nsp2;sp++){
                System.out.print("\t");
            }
            System.out.println("*\t");
            if(i<=n/2){
                nsp1--;
                nsp2+=2;
            }else{
                nsp1++;
                nsp2-=2;
            }
        }
    }

    public static void recursivePrinting(int i, int j, int n, int nsp1, int nsp2){
        if(i == n+1){
            return;
        }
        if(j>(nsp1+nsp2+1)){
            System.out.println();
            if(i<=n/2)
                recursivePrinting(i+1, 1, n, nsp1-1, nsp2+2);
            else
                recursivePrinting(i+1, 1, n, nsp1+1, nsp2-2);
        }else if(j<=nsp1){
            System.out.print("\t");
            recursivePrinting(i, j+1, n, nsp1, nsp2);
        }else if(j == nsp1+1 || j == (nsp1+nsp2+1)){
            System.out.print("*\t");
            recursivePrinting(i, j+1, n, nsp1, nsp2);
        }else{
            System.out.print("\t");
            recursivePrinting(i, j+1, n, nsp1, nsp2);
        }
    
    }
    public static void recursivePrinting(int i, int j, int n){
        int nsp1 = n/2;
        int nsp2 = 0;
        recursivePrinting(i, j, n, nsp1, nsp2);
    }

}