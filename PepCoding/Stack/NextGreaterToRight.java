import java.io.*;
import java.util.*;

public class NextGreaterToRight {
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   // solve
   Stack<Integer> st = new Stack<>();
   int n = arr.length;
   int []nge_right = new int[n];
   nge_right[n-1] = -1;   //  next greater element for the last element of array
   st.push(arr[n-1]);
   // traverse through the array and pop() till you encounter the val smaller than the current value on array
   // traversal - from right to left
   for(int i=n-2;i>=0;i--){
       while(st.size()>0 && st.peek()<=arr[i]){
           st.pop();
       }
       if(st.size() == 0){
           nge_right[i] = -1;
       }else{
           nge_right[i] = st.peek();
       }
       st.push(arr[i]);
   }
   return nge_right;
 }

}