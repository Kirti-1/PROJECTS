import java.io.BufferedReader;
import java.io.InputStreamReader;

class CountSort {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String []arr = br.readLine().split(" ");
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(arr[i]);
        }
        countSort(a);
    }
    public static void countSort(int[] a, int min, int max) {
        int len = max-min+1;
        // calculate the frequency array
        int[] farr = new int[len];
        for(int i=0;i<len;i++){
            int index = a[i]-min;
            farr[index]++;
        }
        int []ps = new int[len];
        // calculate the prefix sum array with the help of frequency array
        for(int i=1;i<len;i++){ // prefix sum array is value based
            ps[i] = ps[i-1] + farr[i];
        }
        // prefix sum array - index based
        for(int i=0;i<len;i++){
            ps[i] = ps[i] - 1;
        }
        // starting from the last index from the original array
        // create your answer array with the help of prefix sum array - index based
        for(int i=a.length-1;i>=0;i--) {
            // index in the prefix sum array - where you'll get the correct position of the element 
            int index = a[i]-min;
            // correct position of the element - ensuring the stability of the array            
            int correct_pos = ps[index];
            ans[correct_pos] = a[i];
            // decrement the index value in prefix sum array - index based 
            // so that the next time it gets encounter, the correct position will be given to the next respective item
            ps[index]--; 
        }
        // deep copy the answer array to original array
        for(int i=0;i<a.length;i++){
            a[i] = ans[i];
        }

    }
    public static void countSort(int[] a) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // find min and max element
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
        countSort(a, min, max);
    }
}