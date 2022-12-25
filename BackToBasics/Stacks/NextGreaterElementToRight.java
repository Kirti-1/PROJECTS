/*
*******************************************  NEXT GREATER ELEMENT TO RIGHT ***************************************

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to "next greater element on the right" for all elements of array
4. Input and output is handled for you.

"Next greater element on the right" of an element x is defined as the first element to right of x having value greater than x.
Note -> If an element does not have any element on it's right side greater than it, consider -1 as it's "next greater element on right"
e.g.
for the array [2 5 9 3 1 12 6 8 7]
Next greater for 2 is 5
Next greater for 5 is 9
Next greater for 9 is 12
Next greater for 3 is 12
Next greater for 1 is 12
Next greater for 12 is -1
Next greater for 6 is 8
Next greater for 8 is -1
Next greater for 7 is -1
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class NextGreaterElementToRight {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] ans = nextGreaterElementToRight(arr);
        for(int i=0;i<n;i++) {
            System.out.print(ans[i] + " ");
        }
    }
    /*
    public static int[] nextGreaterElementToRight(int[] arr) {
        // USING ARRAY - NOT A VERY OPTIMAL APPROACH
        int len = arr.length;
        int []ngr = new int[len];
        ngr[len-1] = -1;
        for(int i=len-2;i>=0;i--) {
            if(arr[i+1]>=arr[i]) {
                ngr[i] = arr[i+1];
            }else{
                int j = i + 1;
                while(j<len && ngr[j]<arr[i]){
                    j++;
                }
                if(j == len){
                    ngr[i] = -1;
                }else{
                    ngr[i] = ngr[j];
                }
            }
        }
        return ngr;
    }
    */

    // USING STACK
    public static int[] nextGreaterElementToRight(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int len = arr.length;
        int []ngr = new int[len];
        ngr[len-1] = -1;
        st.push(arr[len-1]);
        for(int i=len-2;i>=0;i--){
            while(st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                ngr[i] = -1;
            }else{
                ngr[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ngr;
    }
}
