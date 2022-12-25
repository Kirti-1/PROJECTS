// Without using extra space, Space Complexity - O(1)
import java.util.*;
class RemoveDuplicates{
    public static void main(String[] args){
        // 1,1,1,3,3,5,5
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();   
        }
        int size = removeDuplicates(arr);
        for(int i=0;i<size;i++){
            System.out.format("%d ",arr[i]);
        }
    }
    public static int removeDuplicates(int []arr){
        int i = 0, j = 0;
        int n = arr.length;
        if(n==0 || n==1){
            return n;
        }
        for(;j<n;){// j is fast moving pointer
            if(arr[i]!=arr[j]){
                i = i + 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        return i+1;
    }
}