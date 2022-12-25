import java.util.*;
class AllIndicesOfArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int[] ans = allIndices(arr, 0, x, 0); // First index traversing from the beginning
        if(ans.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }
    public static int[] allIndices(int[] arr, int idx, int x, int fsf){
        if(idx == arr.length){
            return new int[fsf];
        }
        int[] ans; // null reference - by default
        if(arr[idx] == x){
            ans = allIndices(arr, idx+1, x, fsf+1);
            ans[fsf] = idx;
        }else{
            ans = allIndices(arr, idx+1, x, fsf);
        }
        return ans;

    }
}