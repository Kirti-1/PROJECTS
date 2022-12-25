/******************  PATTERN - 1  *******************

1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format

Input:
A number n
5

Output:
*       
*       *
*       *       *
*       *       *       *
*       *       *       *       * 

*/
import java.util.*;
class Pattern1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Iterative Solution
        iterativePrinting(n);
        
        // Recursive Solution
        // required - i(row), j(col), n(range of i and j)
        recursivePrinting(0,0,n);
    }
    public static void iterativePrinting(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void recursivePrinting(int i, int j, int n){
        if(j == n){ // OR if(i == n)
            return;
        }
        if(j<=i){
            // print star and go to next column
            System.out.print("*\t");
            recursivePrinting(i,j+1,n);

        }else{
            // go to next row and start the col again from the beginning
            // put the pointer to the next line 
            System.out.println();
            recursivePrinting(i+1,0,n);
        }

    }
}