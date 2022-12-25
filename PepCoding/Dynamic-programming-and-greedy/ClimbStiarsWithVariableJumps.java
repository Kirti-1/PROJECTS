import java.io.*;
import java.util.*;

public class ClimbStiarsWithVariableJumps {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] jumps = new int[n];
        for(int i=0;i<n;i++){
            jumps[i] = scn.nextInt();
        }
        // System.out.println(climbStairsWithVariableJumps_rec(n, jumps, 0));
        int[]qb = new int[n+1];
        System.out.println(csvj_mem(jumps, qb, 0));
        // System.out.println(csvj_tab(n, jumps));
    }
    public static int climbStairsWithVariableJumps_rec(int n, int[] jumps, int idx){
        if(idx == n){
            return 1;
        }
        // if(idx>n){
        //     return 0;
        // }
        int ans = 0;
        for(int i=1;i<=jumps[idx] && (i+idx)<=n;i++){
            ans += climbStairsWithVariableJumps_rec(n, jumps, idx + i);
        }
        return ans;
        
    }
    public static int csvj_mem(int []jumps, int[] qb, int idx) {
        if(idx == jumps.length){
            return 1;
        }
        int ans = 0;
        for(int i=1;i<=jumps[idx] && i+idx<=jumps.length;i++){
            ans += csvj_mem(jumps, qb, idx + i);
        }
        qb[idx] = ans;
        return ans;
    }
    public static int csvj_tab(int n, int []jumps){
        // int n = jumps.length;
        int[]dp = new int[n+1];
        dp[n] = 1;
        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=jumps[i] && i+j<=n;j++){
                dp[i] += dp[i + j];
            }
        }
        return dp[0];
    }

}