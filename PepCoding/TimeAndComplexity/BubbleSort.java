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
    
        bubble_sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void bubble_sort(int[] a){
        for(int itr=1;itr<n;itr++){
            int i = itr-1;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}