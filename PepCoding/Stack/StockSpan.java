import java.io.*;
import java.util.*;

public class StockSpan {
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

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
   // solve
   Stack<Integer> st = new Stack<>();
   int n = arr.length;
   int[] ngi_left = new int[n]; // next index based on greater value to left
   ngi_left[0] = 1;
   st.push(0);
   for(int i=1;i<n;i++){
       while(st.size()>0 && arr[st.peek()]<arr[i]){
           st.pop();
       }
       if(st.size()==0){
           ngi_left[i] = i + 1;
       }else{
           ngi_left[i] = i-st.peek();
       }
       st.push(i);
   }
   return ngi_left;
 }

}