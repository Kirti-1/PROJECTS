import java.io.*;
class Sort012 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String []arr = br.readLine().split(" ");
        int []arr_012 = new int[n]; 
        for(int i=0;i<n;i++){
            arr_012[i] = Integer.parseInt(arr[i]);
        }
        sort_012(arr_012);
        for(int i=0;i<n;i++){
            System.out.format("%d ",arr_012[i]);
        }
    }

    public static void swap(int[]a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void sort_012(int[] a) {
        // at any given point
        // partitioned into 4 parts
        // 0's region - 0 to j-1
        // 1's region - j to i-1
        // 2's region - k+1 to end
        // unknown - yet to be decided - i to k 
        int i = 0;
        int j = 0;
        int k = a.length-1;
        while(i<=k){
            if(a[i] == 1){
                i++;
            }else if(a[i] == 0){
                swap(a, i, j);
                i++;
                j++;
            }else{
                swap(a, i, k);
                k--;
                // added element from unknown region to k's region
            }
        }

        int n = a.length;
          
        System.out.println("All 0's lie from " + 0 +" to "+(j-1));
        for(int l=0;l<j;l++){
            System.out.print(a[l] + " ");
        }
        System.out.println();
        System.out.println("All 1's lie from " + j +" to "+(i-1));
        for(int l=j;l<i;l++){
            System.out.print(a[l] + " ");
        }
        System.out.println();
        System.out.println("All 2's lie from " + (k+1) +" to "+(n-1));
        for(int l=k+1;l<n;l++){
            System.out.print(a[l] + " ");
        }
        System.out.println();
    }
}