/*
Connected Cells in a Grid

Consider a matrix where each cell contains either a  or a . Any cell containing a  is called a filled cell. Two cells are said to be connected if they are adjacent to each other horizontally, vertically, or diagonally. In the following grid, all cells marked X are connected to the cell marked Y.

XXX
XYX  
XXX    
If one or more filled cells are also connected, they form a region. Note that each cell in a region is connected to zero or more cells in the region but is not necessarily directly connected to all the other cells in the region.

Given an  matrix, find and print the number of cells in the largest region in the matrix. Note that there may be more than one region in the matrix.

For example, there are two regions in the following  matrix. The larger region at the top left contains  cells. The smaller one at the bottom right contains .

110
100
001
Function Description

Complete the connectedCell function in the editor below.

connectedCell has the following parameter(s):
- int matrix[n][m]:  represents the  row of the matrix

Returns
- int: the area of the largest region

Input Format

The first line contains an integer , the number of rows in the matrix.
The second line contains an integer , the number of columns in the matrix.
Each of the next  lines contains  space-separated integers .

Constraints

Sample Input

STDIN       Function
-----       --------
4           n = 4
4           m = 4
1 1 0 0     grid = [[1, 1, 1, 0], [0, 1, 1, 0], [0, 0, 1, 0], [1, 0, 0, 0]]
0 1 1 0
0 0 1 0
1 0 0 0
Sample Output

5
Explanation

The diagram below depicts two regions of the matrix. Connected regions are filled with X or Y. Zeros are replaced with dots for clarity.

X X . .
. X X .
. . X .
Y . . .
The larger region has  cells, marked X.

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'connectedCell' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int connectedCell(List<List<Integer>> matrix) {
    // Write your code here
        int maxArea = -1;
        int [][] mat = new int[matrix.size()][matrix.get(0).size()];


        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix.get(0).size();j++){
                mat[i][j] = (int)matrix.get(i).get(j);
            }
        }
        for(int m=0;m<mat.length;m++){
            for(int n=0;n<mat[0].length;n++){
                
                if(mat[m][n] == 1){
                    int count = connectedCellHelper(mat, m, n);
                    if(count>maxArea){
                        maxArea = count;
                    }
                }
                   
            }
        }
        return maxArea;
    }
    public static int connectedCellHelper(int[][] matrix, int i, int j){
        // top, bottom, right, left check all direction and marked as read
        if(i<0 || j<0 || i>=matrix.length || j>=matrix[0].length || matrix[i][j] == 0){
            return 0;
        }
        matrix[i][j] = 0; // marked as read
        
        int count = 0;
        count = 1 + connectedCellHelper(matrix, i-1, j) + connectedCellHelper(matrix, i, j-1) + connectedCellHelper(matrix, i+1, j) + connectedCellHelper(matrix, i, j+1);
        
        return count;
        
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> matrix = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                matrix.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.connectedCell(matrix);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
