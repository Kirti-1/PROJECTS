/*
Expected Time Complexity: O(log(n))
Expected Space Complexity: O(1)
 
Constraints:
2 <= Size of array <= 200
1 <= Elements of the array <= 100000

EDITORIAL

Use Binary Search technique to find the solution.
Divide the array in two part and check if the a[mid] > a[mid+1] which means the element will be on the left half of the  partition otherwise on the right.
while(l<r){
    int mid=(l+r)/2;
    if(a[mid]>a[mid+1])r=mid;
    else l=mid+1;
}

*/
import java.util.*;
import java.lang.*;
import java.io.*;

public class FindPeakElement{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0){
            String s = br.readLine().trim();
            int n = Integer.parseInt(s);
            String S = br.readLine();
            String[] s1 = S.split(" ");
            List<Integer> a = new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                a.add(Integer.parseInt(s1[i]));
            }
            Solution ob = new Solution();
            int ans = ob.findPeakElement(a); // will return the peak element
            System.out.println(ans);
        }
    }

}
class Solution
{   
    public int findPeakElement(List<Integer> a)
    {
     int i = 0;
     int j = n-1;
     int n = a.size();
     
        while(i<=j){
            int mid = i + (j-i)/2;
            if(mid>0 && mid<n-1 && a.get(mid-1)<a.get(mid) && a.get(mid)>a.get(mid+1)){
                // arr[i]!=arr[i+1] - given
                return a.get(mid);
            }else if(mid>0 && mid<n-1 && a.get(mid)<a.get(mid+1)){ // region of mid - region 1 ? region 2? 
            // REGION 1 - INCREASING VALUE
                i = mid + 1; // the peak element will be on the right position
            }else{
                // REGION 2 - DECREASING VALUE
                // peak element will be on the left side
                j = mid - 1;
            }
        }
        return a.get(i);
    }
}