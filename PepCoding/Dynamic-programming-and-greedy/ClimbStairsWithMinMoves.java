import java.io.*;
import java.util.*;

public class ClimbStairsWithMinMoves {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        // System.out.println(csmm_rec(arr,0));
        // int []qb = new int[n+1]; // value with zero will not bother
        // System.out.println(csmm_mem(arr,0,qb));
        System.out.println(csmm_tab(arr));
    }
    public static int csmm_rec(int[] arr, int i){
        
        if(i == arr.length){
            return 0;
        }
        if(arr[i] == 0){
            return Integer.MAX_VALUE;
        }
        int min = Integer.MAX_VALUE;
        
        for(int j=1;j<=arr[i] && i+j<=arr.length;j++){
            int ans = csmm_rec(arr,i+j);
            if(ans<min){
                min = ans;
            }
        }
        if(min == Integer.MAX_VALUE){
            return min;
        }
        return 1 + min;
        
    }
    public static int csmm_mem(int[] arr, int i, int []qb){
        
        if(i == arr.length){
            return 0;
        }
        if(qb[i]!=0){
            return qb[i];
        }
        if(arr[i] == 0){
            return Integer.MAX_VALUE;
        }
        int min = Integer.MAX_VALUE;
        
        for(int j=1;j<=arr[i] && i+j<=arr.length;j++){
            int ans = csmm_rec(arr,i+j);
            if(ans<min){
                min = ans;
            }
        }
        if(min == Integer.MAX_VALUE){
            return min;
        }else{
            qb[i] = 1 + min;
            return 1 + min;
        }
        
    }
    public static int csmm_tab(int []arr){
        int n = arr.length;
        int []dp = new int[n+1];
        dp[n] = 0;
        for(int i=n-1;i>=0;i--){
            int min = Integer.MAX_VALUE;
            for(int j=1;j<=arr[i] && i+j<=n;j++){
                int nbr = i + j;
                int mntod = dp[nbr];
                
                if(mntod<min){
                    min = mntod;
                }
            }
            if(min == Integer.MAX_VALUE){
                dp[i] = min;
            }else{
                dp[i] = min + 1;
            }
        }
        return dp[0];
    }

}