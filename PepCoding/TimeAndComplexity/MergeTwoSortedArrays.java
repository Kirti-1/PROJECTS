import java.io.*;
class MergeTwoSortedArrays {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        String arr1[] = br.readLine().split(" ");
        int n2 = Integer.parseInt(br.readLine());
        String arr2[] = br.readLine().split(" ");
        int[]a = new int[n1];
        int[]b = new int[n2];
        for(int i=0;i<n1;i++){
            a[i] = Integer.parseInt(arr1[i]);
        } 
        for(int i=0;i<n2;i++){
            b[i] = Integer.parseInt(arr2[i]);
        } 
        for(int i=0;i<n1;i++){
            System.out.print(a[i] + " ");
        } 

        int[] ans = merge(a,b);
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