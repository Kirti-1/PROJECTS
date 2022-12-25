import java.util.*;
class FirstIndex{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int ans = firstIndex(arr, n-1,x); // First index traversing from the end
        System.out.println(ans);
    }
    public static int firstIndex(int []arr, int idx, int x){
        if(idx == -1){
            return -1;
        }
        int ans = firstIndex(arr, idx-1, x);
        if(ans==-1){
            if(arr[idx] == x){
                return idx;
            }return -1;
        }
        return ans;
    }
}