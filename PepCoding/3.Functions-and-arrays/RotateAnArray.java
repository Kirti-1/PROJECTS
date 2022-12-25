/************************** ROTATE AN ARRAY ******************
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are given a number k.
4. Rotate the array a, k times to the right (for positive values of k), and to
the left for negative values of k.

Input:
Input is managed for you

Output:
Output is managed for you

Constraints:
0 <= n < 10^4
-10^9 <= a[i], k <= 10^9

*/
import java.util.Scanner;
public class RotateAnArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        rotate(arr,k);
        for(int i=0;i<n;i++){
            System.out.format("%d ",arr[i]);
        }
    }
    private static void rotate(int []arr,int si,int ei){
        for(int i=si,j=ei;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void rotate(int []arr,int k){
        // -10^9 <= k <= 10^9
        int d = arr.length;
        k%=d;
        if(k<0){
            k+=d;
        }
        rotate(arr,0,d-1);
        rotate(arr,0,k-1);
        rotate(arr,k,d-1);
    }
}