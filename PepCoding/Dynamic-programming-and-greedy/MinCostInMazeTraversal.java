import java.io.*;
import java.util.*;

public class MinCostInMazeTraversal {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] maze = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                maze[i][j] = scn.nextInt();
            }
        }
        int[][]qb = new int[n+1][m+1];
        int ans = minCostInMaze(maze,qb,0,0,n-1,m-1);
        System.out.println(ans);
    }
    public static int minCostInMaze(int [][]maze, int [][]qb,int sr, int sc, int dr, int dc){
        if(sr == dr && sc == dc){
            return maze[sr][sc];
        }
        if(sr>dr || sc>dc){
            return Integer.MAX_VALUE;
        }
        if(qb[sr][sc] != 0){
            return qb[sr][sc];
        }
        int x = minCostInMaze(maze,qb,sr,sc+1,dr,dc);
        int y = minCostInMaze(maze,qb,sr+1,sc,dr,dc);
        int min = Math.min(x,y);
        if(min == Integer.MAX_VALUE){
            qb[sr][sc] = min;
            return min;
        }else{
            qb[sr][sc] = maze[sr][sc] + min;
            return qb[sr][sc];
        }
    }

}