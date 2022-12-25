import java.util.*;
class MaxOfAnArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int max = maxOfArray(arr,0);
        System.out.println(max);
    }
    public static int maxOfArray(int []arr, int idx){
        if(idx == arr.length){
            return Integer.MIN_VALUE;
        }
        int max_ans = maxOfArray(arr,idx+1);
        return max_ans>arr[idx]?max_ans:arr[idx];

    }

}