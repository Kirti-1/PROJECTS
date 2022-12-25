/****************************** INVERSE OF AN ARRAY **************************
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to calculate the inverse of array a.

For definition and constraints check this link
https://www.pepcoding.com/resources/online-java-foundation/getting-started/inverse-of-a-number/ojquestion
The only difference is the range of values is from 0 to n - 1, instead of 1 to n.

Input:
Input is managed for you

Output:
Output is managed for you

Constraints:
0 <= n < 10^7
For more constraints check this
https://www.pepcoding.com/resources/online-java-foundation/getting-started/inverse-of-a-number/ojquestion
The only difference is the range of values is from 0 to n - 1, instead
of 1 to n
*/
import java.util.*;
import java.io.*;
public class InverseOfArray{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int []inv = inverse(arr); 
        for(int i=0;i<n;i++){
            System.out.println(inv[i]);
        }
    }
    public static int[] inverse(int[] arr){
        int []ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[arr[i]] = i;
        }
        return ans;
    }

}
