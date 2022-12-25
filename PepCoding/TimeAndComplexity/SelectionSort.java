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
    
        selection_sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void selection_sort(int[] a){
        int n = a.length;
        for(int itr=1;itr<n;itr++){
            int i = itr - 1;
            int min = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            } 
            int temp = arr[j];
            arr[j] = arr[min];
            arr[min] = temp;                
        }
    }
}