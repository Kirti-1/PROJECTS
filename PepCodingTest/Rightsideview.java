/******
Right side view

Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Input Format

input is managed for you

Constraints

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
Output Format

print the right side view

Sample Input 0

11
1 2 -1 5 -1 -1 3 -1 4 -1 -1
Sample Output 0

1 3 4


*/





import java.io.*;
import java.util.*;

public class Rightsideview {
  
  	public static class Node {
        int data;
        Node left;
        Node right;

        Node() {

        }

        Node(int data) {
            this.data = data;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair() {

        }

        Pair(Node node,int state) {
            this.node = node;
            this.state = state;
        }
    }

  	public static void display(Node node) {
        if(node == null) {
            return;
        }

        String str = " <- " + node.data + " -> ";

        String left = (node.left == null) ? "." :  "" + node.left.data;
        String right = (node.right == null) ? "." : "" + node.right.data;

        str = left + str + right;

        System.out.println(str);

        display(node.left);
        display(node.right);
    }
	
  	public static Node construct(Integer[]arr) {
        Node root = new Node(arr[0]);

        Stack<Pair>st = new Stack<>();
        Pair root_pair = new Pair(root,1);

        st.push(root_pair);
        int idx = 1;

        while(st.size() > 0) {
            Pair top = st.peek();

            if(top.state == 1) {
                //waiting for left child
                top.state++;
                if(arr[idx] != null) {
                    Node lc = new Node(arr[idx]);
                    top.node.left = lc;

                    Pair lcp = new Pair(lc,1);
                    st.push(lcp);
                }
                idx++;
            }
            else if(top.state == 2) {
                //waiting for right child
                top.state++;
                if(arr[idx] != null) {
                    Node rc = new Node(arr[idx]);
                    top.node.right = rc;

                    Pair rcp = new Pair(rc,1);
                    st.push(rcp);
                }
                idx++;
            }
            else if(top.state == 3) {
                st.pop();
            }
        }

        return root;

    }

  	public static void rightView(Node root) {
    	//write your code here
    }
  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       	int n = scn.nextInt();
      	Integer[]arr = new Integer[n];
      
      	for(int i=0;i < n;i++) {
        	int val = scn.nextInt();
          	if(val == -1) {
            	arr[i] = null;
            }
            else {
            	arr[i] = val;
            }
        }
      
        Node root = construct(arr);
        rightView(root);
    }
}