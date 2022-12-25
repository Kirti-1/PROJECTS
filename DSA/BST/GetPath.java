import java.util.ArrayList;

public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 * 		public BinaryTreeNode(T data) 
	 * 		{ 
	 * 			this.data = data; 
	 * 		}
	 * }
	 */

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        if(root == null){
            return new ArrayList<Integer>();
        }
        if(root.data == data){
        	ArrayList<Integer> ba = new ArrayList<>();
            ba.add(data);
            return ba;
        }
        ArrayList<Integer> path = new ArrayList<>();
        if(root.data>data){
            path = getPath(root.left, data);
            if(path.size() == 0){
                return path;
            }
            path.add(root.data);
        }else{
            path = getPath(root.right, data);
            if(path.size() == 0){
                return path;
            }
            path.add(root.data);            
        }
        return path;
        
	}
}