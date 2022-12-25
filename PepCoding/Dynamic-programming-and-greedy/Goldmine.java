import java.io.*;
import java.util.*;

public class Goldmine {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][]gold = new int[n][m];
        for(int i=0;i<n;i++){
            String[] arr = br.readLine().split(" ");
            for(int j=0;j<m;j++){
                gold[i][j] = Integer.parseInt(arr[j]);
            }
        }
       
        // int max = Integer.MIN_VALUE;
        // for(int ir=0;ir<n;ir++){
        //     int ans = goldmine(gold, ir, 0);
        //     if(max < ans){
        //         max = ans;
        //     }
        // }
        int max = Integer.MIN_VALUE;
        int[][]qb = new int[n][m];
        for(int ir=0;ir<n;ir++){
            int ans = goldmine_mem(gold, qb,ir, 0);
            if(max < ans){
                max = ans;
            }
        }
        System.out.println(max);
        
    }
    /* -ALL SOLUTION WILL NOT BE TRAVERSED!!- GREEDY APPROACH
    public static int goldmine(int[][]gold, int row, int col){ 
        if(col == gold[0].length-1){
            return 0;
        }
        int mer = 0;
        int ans = 0;
        if(row == 0){ // top most wall
            if(gold[row][col+1]>gold[row+1][col+1]){
                mer = row;
            }else{
                mer = row + 1;
            }
            ans = gold[mer][col+1] + goldmine(gold, mer, col+1);
        }else if(row == gold.length-1){ // bottom most wall
            if(gold[row][col+1]>gold[row-1][col+1]){
                mer = row;
            }else{
                mer = row - 1;
            }
            ans = gold[mer][col+1] + goldmine(gold, mer, col+1);
        }else{
            int val = 0;
            if(gold[row][col+1]>gold[row+1][col+1]){
                mer = row;
                val = gold[row][col+1];
            }else{
                mer = row + 1;
                val = gold[row+1][col+1];
            }
            if(gold[row-1][col+1]>val){
                mer = row - 1;
            }
            ans = gold[mer][col+1] + goldmine(gold, mer, col+1);
        }
        return ans;
        
    }*/
     public static int goldmine(int[][]gold, int r, int c){
         if(r<0 || r>=gold.length){
             return Integer.MIN_VALUE;
         }
         if(c == gold[0].length-1){
             return gold[r][c];
         }
         int x = goldmine(gold, r-1, c+1);
         int y = goldmine(gold, r, c+1);
         int z = goldmine(gold, r+1, c+1);
         
         int max = Math.max(x, Math.max(y, z));
         if(max!=Integer.MIN_VALUE){
             return max + gold[r][c];
         }return max;
     }
     public static int goldmine_mem(int[][]gold,int[][]qb, int r, int c){
         if(r<0 || r>=gold.length){
             return Integer.MIN_VALUE;
         }
         if(c == gold[0].length-1){
             return gold[r][c];
         }
         if(qb[r][c]!=0){
             return qb[r][c];
         }
         int x = goldmine_mem(gold, qb, r-1, c+1);
         int y = goldmine_mem(gold, qb, r, c+1);
         int z = goldmine_mem(gold, qb, r+1, c+1);
         
         int max = Math.max(x, Math.max(y, z));
         if(max!=Integer.MIN_VALUE){
             qb[r][c] =  max + gold[r][c];
             return qb[r][c];
         }return max;
     }


}