import java.util.*;
public class EndPointOfMatrix{
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
         
    }
}