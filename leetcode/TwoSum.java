/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Input: 
nums = [2,7,11,15], target = 9
Output: 
[0,1]
Output: 
Because nums[0] + nums[1] == 9, we return [0, 1].
*/
import java.util.*;
class TwoSum{
    public static int[] twoSum(int[] nums, int target){
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];   
        }
        int a = 0, b = 0;
        int i = 0, j = arr.length-1;
        while((arr[i] + arr[j]) != target){
            if((arr[i] + arr[j])>target){
                j--;
            }else{
                i++;
            }
        }
        a = arr[i];
        b = arr[j];
        int[] result = new int[2];
        j = 0;
        for(i=0;i<nums.length;i++){
            if(nums[i] == a){
                result[j++] = i;
            }else if(nums[i] == b){
                result[j++] = i;
            }

        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        int[] result = twoSum(array, target);
        for(int i=0;i<2;i++){
            System.out.printf("%d\n",result[i]); // print formatted 'printf'
        }

    }
}