import java.util.*;
public class MatrixMultiplication{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int row1 = scn.nextInt();
        int col1 = scn.nextInt();
        int [][]mat1 = new int[row1][col1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                mat1[i][j] = scn.nextInt();
            }
        }
        int row2 = scn.nextInt();
        int col2 = scn.nextInt();
        int [][]mat2 = new int[row2][col2];
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                mat2[i][j] = scn.nextInt();
            }
        }
        if(col1!=row2){
            return;
        }
        int ans[][] = new int[row1][col2];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<row2;k++){
                    ans[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }
        display(ans); 
         
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