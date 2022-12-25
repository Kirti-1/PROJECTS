import java.io.*;
import java.util.*;

public class ClimbStairs {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // System.out.println(climbStairs_rec(n));
        // memoization
        // int[]qb = new int[n+1];
        // System.out.println(climbStairs_mem(n,qb));
        // tabulation
        System.out.println(climbStairs_tab(n));
    }
    public static int climbStairs_rec(int n){
        if(n==0){ 
            // 0 -> 0 only 1 way
            return 1;
        }
        if(n<0){
          // behaving reactively
          return 0;
        } 
        int nto0 = climbStairs_rec(n-1) + climbStairs_rec(n-2) + climbStairs_rec(n-3);
        return nto0;
    }
    public static int climbStairs_mem(int n, int[] qb){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        int nto0 = climbStairs_mem(n-1,qb) + climbStairs_mem(n-2,qb) + climbStairs_mem(n-3,qb);
        qb[n] = nto0;
        return nto0;
    }
    public static int climbStairs_tab(int n){
        int[]dp = new int[n+1];
        
        dp[0] = 1;
        // dp[1] = 1;
        // dp[2] = 2;
        
        for(int i=1;i<=n;i++){
            if(i == 1){
                dp[i] = dp[i-1];
            }else if(i == 2){
                dp[i] = dp[i-1] + dp[i-2];
            }else{
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }
        return dp[n];
    }

}