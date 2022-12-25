import java.io.*;
import java.util.*;

public class SlidingWindowMaximum {
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner scn = new Scanner(System.in);
    int n = Integer.parseInt(br.readLine());
   // int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
      // a[i] = scn.nextInt();
    }
    int k = Integer.parseInt(br.readLine());
   // int k = scn.nextInt();

    // code
    int[] ans = slidingWindowMaximum(a,k);
    for(int i:ans){
       System.out.print(i + " ");
    }
 }
 public static int[] slidingWindowMaximum(int[] arr, int k) {
    int n = arr.length;
    int ans[] = new int[n-k+1];
    int[] ngi_right = ngi_right(arr); // index-based
    
    int j = 0;
    for(int i=0;i<n-k+1;i++){
       if(j<i){
          j = i;
       }
       while(ngi_right[j]<i+k){
          // to find the next greater within the sliding window
          j = ngi_right[j];
       }
      //  System.out.print(arr[j] + " ");
       ans[i] = arr[j];
    }
    return ans;
 }
 public static int[] ngi_right(int []arr){
    Stack<Integer> st = new Stack<>();
    int n = arr.length;
    int []ngi = new int[n];
    ngi[n-1] = n;
    st.push(arr[n-1]);
    for(int i=n-2;i>=0;i--){
       while(st.size()>0 && arr[i]>=arr[st.peek()]){
          st.pop();
       }
       if(st.size() == 0){
          ngi[i] = n;
       }else{
          ngi[i] = st.peek();
       }
       st.push(i);
    }
    return ngi;
 }
}