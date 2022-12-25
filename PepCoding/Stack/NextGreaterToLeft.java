import java.io.*;
import java.util.*;

public class NextGreaterToLeft {
  public static void display(int[] a) {
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

    int[] ngl = solve(a);
    display(ngl);
  }

  public static int[] solve(int[] arr) {
    // solve
    Stack<Integer> st = new Stack<>();
    int n = arr.length;
    int[] nge_left = new int[n];
    nge_left[0] = -1;
    st.push(arr[0]);
    for(int i=1;i<arr.length;i++){
        while(st.size()>0 && st.peek()<=arr[i]){
            st.pop();
        }
        if(st.size() == 0){
            nge_left[i] = -1;
        }else{
            nge_left[i] = st.peek();
        }
        st.push(arr[i]);
        
    }
    return nge_left;
  }

}