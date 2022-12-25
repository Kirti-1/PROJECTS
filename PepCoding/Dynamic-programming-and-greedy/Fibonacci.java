import java.io.*;
import java.util.*;

public class Fibonacci{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // int fib = fib_rec(n);
    
    // int []qb = new int[n+1];
    // int fib = fib_mem(n,qb);
    
    int fib = fib_tab(n);
    System.out.println(fib);
 }
 public static int fib_rec(int n){ // TLE for n=45
     if(n==0 || n==1){
         return n;
     }
     int fibn = fib_rec(n-1) + fib_rec(n-2);
     return fibn;
 }
 public static int fib_mem(int n,int[] qb){
     if(n==0 || n==1){
         return n;
     }
     if(qb[n]!=0){
         return qb[n];
     }
     int fibn = fib_mem(n-1, qb) + fib_mem(n-2, qb);
     qb[n] = fibn;
     return qb[n];
 }
 public static int fib_tab(int n){ 
     // better than memoization as there is no call stack of recursive call involved
     int[] dp = new int[n+1];
     dp[0] = 0;
     dp[1] = 1;
     
     for(int i=2;i<=n;i++){
         dp[i] = dp[i-1] + dp[i-2];
     }
     return dp[n];
 }

}