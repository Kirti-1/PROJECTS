import java.util.*;
public class TheStateOfWakanda1{
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
        traversalTSOW(mat);
    }
    public static void traversalTSOW(int [][]mat){
        int row = mat.length;
        int col = mat[0].length;
        for(int j=0;j<col;j++){
            if(j%2==0){
                for(int i=0;i<row;i++){
                    if(i==row-1 && j==col-1){
                      System.out.print(mat[i][j]);
                      return;  
                    }
                    System.out.print(mat[i][j]+" -> ");
                }
            }else{
                for(int i=row-1;i>=0;i--){
                    if(i==0 && j==col-1){
                      System.out.print(mat[i][j]);
                      return;  
                    }
                    System.out.print(mat[i][j]+" -> ");
                }
            }
        }
    }
}