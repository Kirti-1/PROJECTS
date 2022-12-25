import java.io.BufferedReader;
import java.io.InputStreamReader;
class QuickSelect {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String []a = br.readLine().split(" ");
        int []arr = new int[n]; 
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(a[i]);
        }
        int k = Integer.parseInt(br.readLine());
        int kth_smaller = quick_select(arr,k);
        System.out.println(kth_smaller);
    }
    public static void swap(int[]a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static int partition(int[] a, int pivot, int lo, int hi){
        int i = lo, j = lo;
        while(i<=hi){
            if(a[i]>pivot){
                i++;
            }else{
                swap(a, i, j);
                i++;
                j++;
            }
        }
        return j-1;
    }
    public static int quick_select(int[] a, int lo, int hi, int k){
        if(lo == hi){
            return a[lo];
        }
        int pi = partition(a, a[hi],lo, hi);
        if(pi == k){
            return a[pi];
        }else if(k<pi){
            // perform partitioning on left part
            int ans = quick_select(a, lo, pi-1, k); // region of interest
            return ans;
        }else{
            // perform partitioning on right part
            int ans = quick_select(a, pi+1, hi, k); // region of interest
            return ans;
        }

    }
    public static int quick_select(int[]a, int k){
        int lo = 0;
        int hi = a.length-1;
        int ans = quick_select(a, lo, hi, k-1); // k-1 = the index of kth smallest integer
        // perform quick_sort and reject the path as per the requirement
        return ans;
    }
}