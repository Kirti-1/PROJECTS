/****************************** SUM OF TWO ARRAYS ****************************

1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to add the numbers represented by two arrays and print the
arrays.

Input:
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated

Output:
A number representing sum of two numbers, represented by two arrays.

Constraints:
1 <= n1, n2 <= 100
0 <= a1[i], a2[i] < 10

*/
import java.util.Scanner;
public class SumOfTwoArrays{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int []a1 = new int[n1];
        for(int i=0;i<n1;i++){
            a1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int []a2 = new int[n2];
        for(int i=0;i<n2;i++){
            a2[i] = scn.nextInt();
        }
        int []ans = sumOfTwoArrays(a1,a2);
        int i=0;
        if(ans[i]==0){
            i++;
        }
        for(;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    public static int[] sumOfTwoArrays(int []a1, int []a2){
        int i = a1.length-1;
        int j = a2.length-1;
        int k = i>j?i+1:j+1;
        int []ans = new int[k+1];
        int carry = 0;
        while(k>=0){
            if(i>=0){
                ans[k] += a1[i];
            }
            if(j>=0){
                ans[k] += a2[j];
            }
            ans[k] += carry;
            carry = ans[k]/10;
            ans[k] = ans[k]%10;
            i--;
            j--;
            k--;
        }
        return ans;
    }
}