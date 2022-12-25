import java.io.*;
import java.util.*;

public class LargestAreaHistogram {
  
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
        a[i] = Integer.parseInt(br.readLine());
    }

    // code

    int ans = largest_area_histogram(a);
    System.out.println(ans);
    }
    public static int largest_area_histogram(int[] arr){
        int[] sli = smallestEleLeft(arr); // index-based
        int[] sri = smallestEleRight(arr); // smallest element on right side and their index
        
        // based on the respective smallest element on both right and left side the maximum possible area could be generated
        // based on their indices value width will be calculated
        int n = arr.length;
        int max_area = 0;
        for(int i=0;i<n;i++){
            int height = arr[i];
            int width = sri[i] - sli[i] - 1;
            int area = height*width;
            if(area>max_area){
                max_area = area;
            }
        }
        return max_area;
    }
    public static int[] smallestEleLeft(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nsi_left = new int[n];
        nsi_left[0] = -1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                nsi_left[i] = -1;
            }else{
                nsi_left[i] = st.peek();
            }
            st.push(i);
        }
        return nsi_left;
    }
    public static int[] smallestEleRight(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nsi_right = new int[n];
        nsi_right[n-1] = n;
        st.push(n-1);
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                nsi_right[i] = n;
            }else{
                nsi_right[i] = st.peek();
            }
            st.push(i);
        }
        return nsi_right;
    }

}