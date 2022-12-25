/**************************** SPAN OF ARRAY *****************
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

Input:
A number n
n1
n2
.. n number of elements

Output:
A number representing max - min

Constraints:
1 <= n <= 10^4
0 <= n1, n2
 .. n elements <= 10 ^9
*/
import java.util.Scanner;
public class SpanOfArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int span = spanOfArray(arr);
        System.out.println(span);
    }
    public static int spanOfArray(int[] arr){
        int min = arr[0], max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }
        return max - min;
    }
}