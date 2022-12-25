/******
Input:
n = 6

Output: 

* 
* *
* * *
* * * *
* * * * *
* * * * * *

*/
import java.util.*;
class Pattern1Recursive{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printPattern(n,0,0);
    }
    public static void printPattern(int n,int i,int j){
        if(i==n){
            return;
        }
        if(j<=i){ // next star in the same row
            System.out.print("* ");
            printPattern(n,i,j+1);
        }
        if(i<j){ // change the row
            System.out.println();
            printPattern(n,i+1,0);
        }
    }
}