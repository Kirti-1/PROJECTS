import java.util.*;
public class SpiralDisplay{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int [][]mat = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = scn.nextInt();
            }
        }
        System.out.print("\n\n");
        spiralDisplay(mat); 
    }
    public static void spiralDisplay(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        int rs = 0;
        int re = m-1;
        int cs = 0;
        int ce = n-1;
        int ele = 0;
        while(ele<m*n){
            for(int i=rs;i<=re;i++){
                System.out.println(mat[i][cs]);
                ele++;
            }
            cs++;
            for(int j=cs;j<=ce;j++){
                System.out.println(mat[re][j]);
                ele++;
            }
            re--;
            for(int i=re;i>=rs && ele<m*n;i--){
                System.out.println(mat[i][ce]);
                ele++;
            }
            ce--;
            for(int j=ce;j>=cs && ele<m*n;j--){
                System.out.println(mat[rs][j]);
                ele++;
            }
            rs++;
            }
    }
}