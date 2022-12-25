#include "TreeNode.h"
#include <iostream>
#include <queue>
TreeNode<int> *takeInput(){
    int rootData;
    queue<TreeNode<int>*> q;
    cin>>rootData;
    TreeNode<int> *root = new TreeNode<int>(rootData);
    q.push(root);
    while(!q.empty())
{   TreeNode<int> *front = q.front();
    q.pop();
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        int valChild;
        cin>>valChild;
        TreeNode<int> *child = new TreeNode<int>(valChild);
        front->children.push_back(child);
        q.push(child);
    }
}
return root;
}
void treeNodeTraversal(TreeNode<int> *root){
    if(root == NULL)
        return;
    queue<TreeNode<int>*> q;
    q.push(root);
    cout<<root->data<<endl;
    while(!q.empty()){
        int n = q.size();
        while(n>0){
            TreeNode<int> *p = q.front();
            q.pop();
            // cout << p->data << " ";
            for(int i=0;i<p->children.size();i++){
                q.push(p->children[i]);
                cout << p->children[i]->data<<" ";
                // if(i!=p->children.size()-1)
                    // cout<<",";

            }
            cout << endl;
            n--;
        }

}
}
int numOfNodes(TreeNode<int> *root){
    int ans = 1;
    if(root == NULL){
        return 0;
    }

    for(int i=0;i<root->children.size();i++){
        ans += numOfNodes(root->children[i]);
    }
    return ans;
}
void preOrderTraversal(TreeNode<int> *root){
    if(root == NULL)
        return;
    for(int i=0;i<root->children.size();i++){
        preOrderTraversal(root->children[i]);
    }
    cout << root->data << " ";
}
TreeNode<int>* getNextLargerElement(TreeNode<int>* root, int x) {
    // Write your code here
    if(root == NULL)
        return root;
    queue<TreeNode<int>*> q;
    int nextLarger=root->data;
    TreeNode<int> *nextLargerNode; 
    q.push(root);
    while(!q.empty()){
        int n = q.size();
        while(n--){
            TreeNode<int> *p = q.front();
            nextLargerNode = new TreeNode<int>(nextLarger);

            q.pop();
            if(p->data < nextLarger && p->data > x){
                nextLarger = p->data;
                nextLargerNode = p;
            }
            for(int i=0;i<p->children.size();i++){
                q.push(p->children[i]);
            }
        }
    }
    return nextLargerNode;
}
int height = 0;
int heightOfTree(TreeNode<int> *root){
    
    if(root == NULL){
        return 0;
    }
    for(int i = 0;i<root->children.size();i++){
        int maxHeight = heightOfTree(root->children[i]) + 1;
        height = maxHeight>height?maxHeight:height;
    }
    return height;
}
int flag = 0;
TreeNode<int> *removeLeafNodes(TreeNode<int> *root){
    if(root == NULL){
        return root;
    }
    for(int i=root->children.size()-1;i>=0;i--){
        if(root->children[i]->children.size()==0){
            root->children.pop_back();
    } }
    for(TreeNode<int> *child:root->children){
        removeLeafNodes(child);
    }
    return root;
}
int main(){
    TreeNode<int> *root = takeInput();
    treeNodeTraversal(root);
    cout << "The Number of Nodes present = " << numOfNodes(root); 
    cout << endl;
    cout<<" Preorder Traversal = ";
    preOrderTraversal(root);
    // 1 2 2 5 2 3 4 2 6 7 0 0 0 0
    // TreeNode<int> *node =  getNextLargerElement(root,21);
    // cout<< endl << node -> data;
    cout << endl << heightOfTree(root);
    root = removeLeafNodes(root);
    treeNodeTraversal(root);

}