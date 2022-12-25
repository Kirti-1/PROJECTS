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
    
        insertion_sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    public static int[] insertion_sort(int[] a){
        int n = a.length;
        for(int itr=1;itr<n;itr++){
            int j = itr;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;                    
            }
        }
    }
}