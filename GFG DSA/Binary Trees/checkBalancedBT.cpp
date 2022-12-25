#include "BinaryTree.h"
/*
In a balanced Binary Tree,the difference between the heights of the left subtree and right subtree should not be more than one.
abs(hL-hR)<=1
 */

int height(BinaryTreeNode<int> *root){
    if(root == NULL){
        return 0;
    }

    return 1+max(height(root->left),height(root->right));
}
bool checkForBinaryBST(BinaryTreeNode<int> *root){
    if(root == NULL){
        return true;
    }
    int leftPart = height(root->left);
    int rightPart = height(root->right);
    return (abs(leftPart-rightPart)<=1 && checkForBinaryBST(root->left) && checkForBinaryBST(root->right));
}
class BalancedBT{
    public:
    int heightLeft;
    int heightRight;
    bool isBalanced;
};
BalancedBT isBalancedorNot(BinaryTreeNode<int> *root){
    if(root == NULL){
    BalancedBT b;
    b.heightLeft = 0;
    b.heightRight = 0;
    b.isBalanced = true;
    return b;
    }
    // if(root->left==NULL && root->right==NULL){
    //     return {0,0,true};
    // }
    BalancedBT leftPart = isBalancedorNot(root->left);
    BalancedBT rightPart = isBalancedorNot(root->right);
    int hL = max(leftPart.heightLeft,leftPart.heightRight) + 1;
    int hR = max(rightPart.heightLeft,rightPart.heightRight) + 1;
    // bool BorNot = abs(hL-hR)<1;
    BalancedBT bFinal;
    bFinal.heightLeft = hL;
    bFinal.heightRight = hR;
    bFinal.isBalanced = abs(hL-hR)<=1 && leftPart.isBalanced &&rightPart.isBalanced;
    return bFinal;

}

bool checkBalancedBinaryTree(BinaryTreeNode<int> *root){
    return isBalancedorNot(root).isBalanced;
}
int isBalancedBT(BinaryTreeNode<int> *root){
    if(root == NULL){
        return 0;
    }
    int lH = isBalancedBT(root->left);
    if(lH == -1){
        return -1;
    }
    int rH = isBalancedBT(root->right);
    if(rH == -1){
        return -1;
    }
    if(abs(lH-rH)>1){
        return -1;
    }else{
        return max(lH,rH)+1;
    }
    

}
int main(){
    BinaryTreeNode<int> *root = takeInput();
    bool ans1 =  checkBalancedBinaryTree(root);
    ans1?cout<<"BINARY TREE IS BALANCED":cout<<"BINARY TREE IS NOT BALANCED"; 
    bool ans2 = checkForBinaryBST(root);
    cout<<endl;
    ans2?cout<<"BINARY TREE IS BALANCED":cout<<"BINARY TREE IS NOT BALANCED"; 
    bool ans3 = isBalancedBT(root)!=-1;
    cout<<endl;
    ans3?cout<<"BINARY TREE IS BALANCED":cout<<"BINARY TREE IS NOT BALANCED"; 

}