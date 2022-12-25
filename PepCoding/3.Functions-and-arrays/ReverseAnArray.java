/******************** REVERSE AN ARRAY *************************
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to reverse the contents of array a.

Input:
Input is managed for you.

Output:
Output is managed for you.

Constraints:
0 <= n < 10^4
-10^9 <= a[i] <= 10^9

*/
import java.util.Scanner;
public class ReverseAnArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        reverse(arr);
        for(int i=0;i<n;i++){
            System.out.format("%d ",arr[i]);
        }
    }
    public static void reverse(int []arr){
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}