import java.util.Scanner;
public class _2dArraysDemo{
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
        display(mat); 
         
    }
    public static void display(int[][] mat){
        int row = mat.length;
        int col = mat[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}