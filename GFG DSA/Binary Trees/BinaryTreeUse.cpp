#include "binaryTrees.h"
#include <queue>
using namespace std;
BinaryTreeNode<int> *takeInput(){
    int rootData;
    cin>>rootData;
    if(rootData == -1)
        return NULL;
    BinaryTreeNode<int> *root = new BinaryTreeNode<int>(rootData);
    BinaryTreeNode<int> *leftChild = takeInput();
    BinaryTreeNode<int> *rightChild = takeInput();
    root->left = leftChild;
    root->right = rightChild;
    return root;
}
vector<int> levelWisePrint(BinaryTreeNode<int> *root){
    queue<BinaryTreeNode<int>*> q;
    q.push(root);
    vector<int> v;
    while(!q.empty()){
        BinaryTreeNode<int> *p = q.front();
        v.push_back(p->data);
        q.pop();
        if(p->left!=NULL)
            q.push(p->left);
        if(p->right!=NULL)
            q.push(p->right);
    
         }
         return v;
}
vector<int> vec;
void helper(BinaryTreeNode<int> *root){
    if(root!=NULL){
        vec.push_back(root->data);
        // cout<<root->data<<" ";
        helper(root->left);
        helper(root->right);

    }
}
vector<int> preorder(BinaryTreeNode<int> *root){
    // vector<int> vec = new vector<int>;
    vec.clear();
    if(root!=NULL){
        helper(root);
    }

    return vec;
}
void preOrder(BinaryTreeNode<int> *root){
    if(root!=NULL){
        // vec.push_back(root->data);
        cout<<root->data<<" ";
        preOrder(root->left);
        preOrder(root->right);

    }
    // return vec;
}
void printLevelWise(BinaryTreeNode<int> *root) {
	// Write your code here
    queue<BinaryTreeNode<int>*> q;
    q.push(root);
    while(!q.empty()){
        BinaryTreeNode<int> *p = q.front();
        cout<<p->data<<":";
        q.pop();
        if(p->left!=NULL && p->right!=NULL){
            q.push(p->left);
            q.push(p->right);
            cout<<"L:"<<p->left->data<<","<<"R:"<<p->right->data;
        }else{
            if(p->left!=NULL && p->right == NULL){
                q.push(p->left);
                cout<<"L:"<<p->left->data<<",R:-1";
                
            }
            else if(p->right!=NULL && p->left==NULL){
                q.push(p->right);
                cout<<"L:-1,"<<"R:"<<p->right->data;
            }
            else
                cout<<"L:-1,R:-1";
                
        
        }
        cout<<endl;
} 
}
void leftView(BinaryTreeNode<int> *root)
{
    if(root == NULL)
    {
        return;
    }
    queue<BinaryTreeNode<int>*> q;
    q.push(root);
    while(!q.empty()){
        BinaryTreeNode<int> *p = q.front();
        cout << p->data <<" ";
        // q.pop();
        int n = q.size();
        while(n--){
            BinaryTreeNode<int> *front = q.front();
            q.pop();
            if(front->left!=NULL)
            {
                q.push(front->left);

            }
            if(front->right!=NULL)
            {
                q.push(front->right);
            }
        }
    }
}
bool findPath(BinaryTreeNode<int> *root,vector<BinaryTreeNode<int>*> p,int n){
    if(root == NULL){
        return false;
    }
    if(root->data == n){
        return true;
    }
    p.push_back(root);
    if(findPath(root->left,p,n) || findPath(root->right,p,n)){
        return true;
    }
    p.pop_back();
    return false;
}
int main(){
    int t=1;
    // cin>>t;
    while(t--){
    BinaryTreeNode<int> *root = takeInput();
    vector<int> vpre = levelWisePrint(root);
    for(int i:vpre){
        cout<<i<<" ";
    }
    // vec.clear();
    cout<< endl;

    leftView(root);
    vector<BinaryTreeNode<int> *> v;
    int n;
    cin>>n;
    findPath(root,v,n)?cout<<"Present\n":cout<<"Not Present\n";

    
    return 0;
}}