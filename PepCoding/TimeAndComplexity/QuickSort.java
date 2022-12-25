import java.io.BufferedReader;
import java.io.InputStreamReader;
class QuickSort {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String []a = br.readLine().split(" ");
        int []arr = new int[n]; 
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(a[i]);
        }
        quick_sort(arr);
        for(int i=0;i<n;i++){
            System.out.format("%d ",arr[i]);
        }
    }
    public static void swap(int[]a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    // property - after one partition pivot element will be placed in it's correct position.
    public static int partition(int[] a, int pivot, int lo, int hi){
        int i=lo,j=lo; 
        while(i<=hi){
            if(a[i]>pivot){
                i++;
            }else{
                swap(a, i, j);
                j++;
                i++;
            }
        }
        return j-1;
    }
    // repeated calls of partition of an array and its subarray
    public static void quick_sort(int[] a, int lo, int hi) {
        if(lo>=hi){
            return;
        }
        int pi = partition(a, a[hi], lo, hi); //partition index
        quick_sort(a, lo, pi-1);
        quick_sort(a, pi+1, hi);
        // No extra space required in place sortiong and partioning is done.
    }
    public static void quick_sort(int[] a){
        int lo = 0;
        int hi = a.length-1;
        quick_sort(a, lo, hi);
    }

    

}