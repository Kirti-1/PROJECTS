/**************************** SUBARRAY PROBLEM *************************
1. You are given an array of size 'n' and n elements of the same array.
2. You are required to find and print all the subarrays of the given array. 
3. Each subarray should be space seperated and on a seperate lines. Refer to sample input and output.

Input:
A number n
n1
n2
.. n number of elements

Output:
[Tab separated elements of subarray]
..
All subarrays

Constraints:
1 <= n <= 10
0 <= n1, n2
 .. n elements <= 10 ^9

*/
import java.io.*;
public class SubarrayProblem{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        subarray(arr);
    }
    public static void subarray(int []arr){
        int n = arr.length;
        int nos = n*(n+1)/2;
        for(int si=0;si<n;si++){
            for(int ei=si;ei<n;ei++){
                for(int k=si;k<=ei;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }

        }
    }
}