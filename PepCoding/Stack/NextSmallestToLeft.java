import java.io.*;
import java.util.*;
// Next Smallest element right
public class NextSmallestToLeft {
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
      // next Smallest elementv to left
      Stack<Integer> st = new Stack<>();
      int n = arr.length;
      int[] nse_left = new int[n]; // array containing all the values which are smaller residing in left
      nse_left[0] = -1; //extreme left value will not have any value smaller to its left
      st.push(arr[0]);
      for(int i=1;i<n;i++){
          while(st.size()>0 && st.peek()>=arr[i]){
              st.pop();
          }
          if(st.size() == 0){
              nse_left[i] = -1;
          }else{
              nse_left[i] = st.peek();
          }
          st.push(arr[i]);
      }
      return nse_left;
      
    
  }

}