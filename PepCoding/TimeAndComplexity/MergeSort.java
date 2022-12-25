import java.io.*;
class MergeTwoSortedArrays {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split(" ");
        
        int[]ba = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(arr1[i]);
        } 
    
        int[] ans = merge_sort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static int[] merge_sort(int []a, int lo, int hi) {
        if(lo == hi){
            int[]ba = new int[1];
            ba[0] = a[lo];
            return ba;
        }
        int mid = lo + (hi-lo)/2;
        int[] left = merge_sort(a, lo, mid);
        int[] right = merge_sort(a, mid+1, hi);
        int[] ans = merge(left, right);
        return ans;  
    }
    public static int[] merge(int[] a, int[] b) {
        int i=0,j=0;
        int n = a.length, m = b.length;
        int[] sort_arr = new int[a+b];
        int index = 0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                sort_arr[index++] = a[i++];
            }else{
                sort_arr[index++] = b[j++];
            }
        }
        while(i<n){
            sort_arr[index++] = a[i++];
        }
        while(j<m) {
            sort_arr[index++] = b[j++];
        }
        return sort_arr;
    }
}