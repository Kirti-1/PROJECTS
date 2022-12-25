#include "BinaryTree.h"
bool childSumProperty(BinaryTreeNode<int> *root){
    if(root == NULL){
        return true;
    }
    if(root->left == NULL && root->right==NULL){
        return true;
    }
    int sum = 0;
    if(root->left!=NULL){
        sum += root->left->data;
    }
    if(root->right!=NULL){
        sum += root->right->data;
    }
    bool leftPart = childSumProperty(root->left);
    bool rightPart = childSumProperty(root->right);
    
    return root->data == sum && leftPart && rightPart;
}
int main(){
    BinaryTreeNode<int> *root = takeInput();
    childSumProperty(root)?cout<<"TRUE":cout<<"FALSE";
    return 0;
}