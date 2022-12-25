/******************  PATTERN - 2  *******************

1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format

Input:
A number n
5

Output:
*       *       *       *       *       
*       *       *       *
*       *       *
*       *
*

*/
import java.util.Scanner;

public class Pattern2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Iterative Solution
        iterativePrinting(n);
        
        // Recursive Solution
        // required - i(row), j(col), n(range of i and j)
        recursivePrinting(n,0,n);
    }
    public static void iterativePrinting(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void recursivePrinting(int i, int j, int n){
        if(i == 0){
            return;
        }
        if(j<i){
            System.out.print("*\t");
            recursivePrinting(i,j+1,n);
        }else{
            System.out.println();
            recursivePrinting(i-1,0,n);
        }
    
    }

}