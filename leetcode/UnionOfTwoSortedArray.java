/*

Sample Input:
20
3 4 5 6 9 11 14 19 19 23 25 25 26 28 37 38 40 42 46 50 
13
10 15 15 19 21 23 25 25 28 34 35 38 48

Sample Output:
[3, 4, 5, 6, 9, 10, 11, 14, 15, 19, 21, 23, 25, 26, 28, 34, 35, 37, 38, 40, 42, 46, 48, 50]

*/
import java.util.*;
import java.lang.*;
import java.io.*;

public class UnionOfTwoSortedArray{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String []s = br.readLine().split(" ");
        int []arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = Integer.parseInt(s[i]);
        }
        int m = Integer.parseInt(br.readLine());
        s = br.readLine().split(" ");
        int []arr2 = new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = Integer.parseInt(s[i]);
        }
        Solution ob = new Solution();
        ArrayList<Integer> ans = ob.unionOfTwoSortedArray(arr1, arr2, n, m);
        System.out.println(ans);
    }
}
class Solution {
    public static ArrayList<Integer> unionOfTwoSortedArray(int a[], int b[], int n, int m)
    {
        // add your code here
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while(i<n && j<m){
            int firstArrayEle = a[i] , secondArrayEle = b[j];
            if(firstArrayEle == secondArrayEle){
                if(ans.size()>0 && ans.get(ans.size()-1)!=firstArrayEle){
                   ans.add(firstArrayEle); 
                }else if(ans.size()==0){
                   ans.add(firstArrayEle); 
                }
                i++;
                j++;
            }else{
                int ele = 0;
                if(firstArrayEle<secondArrayEle){
                    ele = firstArrayEle;
                    i++;
                }else{
                    ele = secondArrayEle;
                    j++;
                }
                if(ans.size()>0){
                    if(ele!=ans.get(ans.size()-1)){
                        ans.add(ele);
                    }
                }else{
                    ans.add(ele);
                }
            }
        }
        while(i<n){
            if(ans.size()>0){
                if(ans.get(ans.size()-1)!=a[i])
                    ans.add(a[i]);
            }else{
                    ans.add(a[i]);
            }
            i++;
        }
        while(j<m){
            if(ans.size()>0){
                if(ans.get(ans.size()-1)!=b[j])
                    ans.add(b[j]);
            }else{
                    ans.add(b[j]);
            }
            j++;
        }
        return ans;
    } 
}
