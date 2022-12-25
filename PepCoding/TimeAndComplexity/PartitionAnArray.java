import java.io.BufferedReader;
import java.io.InputStreamReader;
class PartitionAnArray {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String []a = br.readLine().split(" ");
        int []arr = new int[n]; 
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(a[i]);
        }
        int pivot = Integer.parseInt(br.readLine());
        // if the array needs to be partitioned as pivot to be a middleman then it needs to be the last element of an array
        partition(arr, pivot);
        for(int i=0;i<n;i++){
            System.out.format("%d ",arr[i]);
        }
    }
    public static void swap(int[]a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void partition(int[] a, int pivot) {
        // part the array on the basis of pivot
        // 0 to j-1  - all the elements smaller than equal to pivot
        // j to i-1 - all the elements greater than pivot

        int i = 0;
        int j = 0;
        int n = a.length;
        while(i<n){
            if(a[i]>pivot){
                i++; // growing the larger region
            }else{
                swap(a, i, j); // swap with the jth position - which is the part of smaller region 
                j++;
                i++;
            }
        }
        
    }
}