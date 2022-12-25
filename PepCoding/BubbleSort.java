import java.util.*;
public class BubbleSort{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        long t1 =  new Date().getTime();

        // sorting activity
        for(int i=0;i<n-1;i++){
            int flag = 0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }
        long  t2 = new Date().getTime();
        long t3 =  t2 - t1; 
        System.out.println(t3);
        for(int i=0;i<n;i++){
            System.out.format("%d ",arr[i]);
        }
    }
    private static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}