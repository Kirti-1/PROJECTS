/****
Transform using depth 
You are given a generic tree.The task is to replace the node data with the depth(level) of the node. Assume level of root to be 0.

Input Format

input is managed

Constraints

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
Output Format

print the preorder of changed tree

Sample Input 0

16
1 2 5 -1 6 -1 -1 3 -1 4 8 -1 9 -1 -1 -1
Sample Output 0

0 1 2 2 1 1 2 2
*/
 
/**
Submission

import java.io.*;
import java.util.*;


public class Solution {
	
  	public static class Node {
        int data;
        ArrayList<Node>children = new ArrayList<>();
    }

    public static Node construct(int[]data) {
        Stack<Node>st = new Stack<>();
        Node root = null;

        for(int i=0; i < data.length;i++) {
            int val = data[i];

            if(val == -1) {
                st.pop();
            }
            else {
                //creata a node
                Node n = new Node();
                n.data = val;

                if(st.size() > 0) {
                    st.peek().children.add(n);
                }
                else {
                    //first node
                    root = n;
                }
                st.push(n);
            }
        }

        return root;
    }

    public static void display(Node node) {
        //print node and its children
        System.out.print(node.data + "->");
        for(int i=0 ; i < node.children.size(); i++) {
            Node child = node.children.get(i);
            System.out.print(child.data + ",");
        }
        System.out.println(".");

        //faith on node's children
        for(int i=0 ; i < node.children.size(); i++) {
            Node child = node.children.get(i);
            display(child);
        }
    }
  
  	public static void transform(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while(q.size()>0){
            int size = q.size();
            while(size-- > 0){
                Node front = q.remove();
                front.data = level;
                for(int i=0;i<front.children.size();i++){
                    q.add(front.children.get(i));
                }                
            }
            level++;
        }
        
        
    	
    }
  
  	public static void preorder(Node root) {
    	System.out.print(root.data + " ");
      	
      	for(int i=0;i < root.children.size();i++) {
        	Node child = root.children.get(i);
          	preorder(child);
        }
    }
  	
    public static void main(String[] args) {
      	Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
      	int[]arr = new int[n];
      
      	for(int i=0;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
      
      	Node root = construct(arr);
      	transform(root);
      	preorder(root);
    }
}


*/


import java.io.*;
import java.util.*;


public class Transformusingdepth {
	
  	public static class Node {
        int data;
        ArrayList<Node>children = new ArrayList<>();
    }

    public static Node construct(int[]data) {
        Stack<Node>st = new Stack<>();
        Node root = null;

        for(int i=0; i < data.length;i++) {
            int val = data[i];

            if(val == -1) {
                st.pop();
            }
            else {
                //creata a node
                Node n = new Node();
                n.data = val;

                if(st.size() > 0) {
                    st.peek().children.add(n);
                }
                else {
                    //first node
                    root = n;
                }
                st.push(n);
            }
        }

        return root;
    }

    public static void display(Node node) {
        //print node and its children
        System.out.print(node.data + "->");
        for(int i=0 ; i < node.children.size(); i++) {
            Node child = node.children.get(i);
            System.out.print(child.data + ",");
        }
        System.out.println(".");

        //faith on node's children
        for(int i=0 ; i < node.children.size(); i++) {
            Node child = node.children.get(i);
            display(child);
        }
    }
  
  	public static void transform(Node root) {
    	
    }
  
  	public static void preorder(Node root) {
    	System.out.print(root.data + " ");
      	
      	for(int i=0;i < root.children.size();i++) {
        	Node child = root.children.get(i);
          	preorder(child);
        }
    }
  	
    public static void main(String[] args) {
      	Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
      	int[]arr = new int[n];
      
      	for(int i=0;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
      
      	Node root = construct(arr);
      	transform(root);
      	preorder(root);
    }
}