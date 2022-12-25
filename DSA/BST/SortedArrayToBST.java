public class Solution {

/*	Binary Tree Node class 
    * 
    * 	class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;
        
        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }
    */
    public static BinaryTreeNode<Integer> sortedArrayToBST(int[]arr, int si, int ei) {
        if(si>ei){
            return null;
        }
        int mid = si + (ei-si)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = sortedArrayToBST(arr,si,mid-1);
        root.right = sortedArrayToBST(arr,mid+1,ei);
        return root;
    }

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        return sortedArrayToBST(arr,0,arr.length-1);
        
    }
}