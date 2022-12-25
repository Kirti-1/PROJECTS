#include "binaryTrees.h"
using namespace std;
BinaryTreeNode<int> *takeInput(){
    int rootData;
    cin>>rootData;
    if(rootData == -1){
        return NULL;
    }
    BinaryTreeNode<int> *root = new BinaryTreeNode<int>(rootData);
    queue<BinaryTreeNode<int>*> q;
    q.push(root);
    while(!q.empty()){
        int n = q.size();
        while(n--){
            BinaryTreeNode<int> *front = q.front();
            q.pop();
            int leftData,rightData;
            cin>>leftData>>rightData;
            if(leftData != -1){
                BinaryTreeNode<int>*leftNode = new BinaryTreeNode<int>(leftData);
                front->left = leftNode;
                q.push(leftNode);
            }
            if(rightData!=-1){
                BinaryTreeNode<int> *rightNode = new BinaryTreeNode<int>(rightData);
                front->right = rightNode;
                q.push(rightNode);
            }
            
        }
    }
    return root;
}
void printLevelWise(BinaryTreeNode<int> *root){
    if(root == NULL){
        return;
    }
    queue<BinaryTreeNode<int>*> q;
    q.push(root);
    while(!q.empty()){
        int n=q.size();
        while(n--){
            BinaryTreeNode<int> *front = q.front();
            q.pop();
            cout<<front->data<<" ";
            if(front->left!=NULL){
                q.push(front->left);
            }
            if(front->right!=NULL){
                q.push(front->right);
            }

        }
        cout<<endl;
    }

}