import java.io.*;
import java.util.*;
// Next Smallest element to right
public class NextSmallestToRight {
  public static void display(int[] a) {
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // int n = Integer.parseInt(br.readLine());
    // int[] a = new int[n];
    int[] a = {18,6,5,13,30,11,10,78};
    // for (int i = 0; i < n; i++) {
    //   a[i] = Integer.parseInt(br.readLine());
    // }

    int[] ngl = solve(a);
    display(ngl);
  }

  public static int[] solve(int[] arr) {
      Stack<Integer> st = new Stack<>();
      int n = arr.length;
      int []nse_right = new int[n]; // next smallest element to right
      st.push(arr[n-1]);
      nse_right[n-1] = -1; // there will be no smallest element of the extreme right element on its right - as it's the last element of the array
      for(int i=n-2;i>=0;i--){
          while(st.size()>0 && st.peek()>=arr[i]){
              st.pop();
          }
          if(st.size()==0){
              nse_right[i] = -1;
          }else{
              nse_right[i] = st.peek();
          }
          st.push(arr[i]);
      }
      return nse_right;
    
  }

}