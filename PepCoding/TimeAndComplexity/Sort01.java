import java.io.*;
class Sort01 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String []arr = br.readLine().split(" ");
        int []arr_01 = new int[n]; 
        for(int i=0;i<n;i++){
            arr_01[i] = Integer.parseInt(arr[i]);
        }
        sort_01(arr_01);
        for(int i=0;i<n;i++){
            System.out.format("%d ",arr_01[i]);
        }
    }
    public static void swap(int[]a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void sort_01(int[] a) {
        // at any given point, partitioned into 3 parts
        // 0's region - 0 to j-1
        // 1's region - j to i-1
        // unknown - yet to be decided - i to end
        int i = 0;
        int j = 0;
        int n = a.length;
        while(i<n) {
            if(a[i] == 1){
                // growing 1's region
                i++;
            }else{
                swap(a, i, j);
                j++; // growing 0's region
                i++; // as well as 1's region - as jth ele will lie in 1's region 
            }
        }  
        System.out.println("All 0's lie from " + 0 +" to "+(j-1));
        for(int k=0;k<j;k++){
            System.out.print(a[k] + " ");
        }
        System.out.println();
        System.out.println("All 1's lie from " + j +" to "+(i-1));
        for(int k=j;k<i;k++){
            System.out.print(a[k] + " ");
        }
        System.out.println();
    }
}