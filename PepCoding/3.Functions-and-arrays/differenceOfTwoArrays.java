/***********************  DIFFERENCE OF TWO ARRAYS *******************
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

Assumption - number represented by a2 is greater.

Input:
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated

Output:
A number representing difference of two numbers (a2 - a1), represented by two arrays.

Constraints:
1 <= n1, n2 <= 100
0 <= a1[i], a2[i] < 10
number reresented by a1 is smaller than number represented by a2.

 */
import java.util.Scanner;
public class differenceOfTwoArrays{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        // Given array a2>a1 so call diff for a2-a1
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
        int []ans = diffOfTwoArrays(a1,a2);
        System.out.println();
        int i=0;
        while(ans[i]==0){
            i++;
        }
        for(;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    public static int[] diffOfTwoArrays(int []a1,int []a2){
        int i = a1.length-1;
        int j = a2.length-1;
        int k = j; // given
        int []ans = new int[k+1];
        int borrow = 0;
        while(k>=0){
            int val = 0;
            if(i>=0){
                val = a1[i];
            }
        
            if(a2[j]+borrow>=val){
                ans[k] = a2[j] + borrow - val;
                borrow = 0;
            }else if(a2[j]+borrow<val){
                ans[k] = (a2[j] + 10) - val + borrow;
                borrow = -1;
            }
            i--;
            j--;
            k--;
        }
        return ans;
    }


}