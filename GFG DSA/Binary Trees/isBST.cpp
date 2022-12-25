#include "BinaryTree.h"
pair<pair<int,int>,bool> isBST(BinaryTreeNode<int> *root){
    if(root == NULL){
        pair<pair<int,int>,bool> p;
        p.first.first = INT_MAX; //MINIMUN
        p.first.second = INT_MIN; //MAXIMUM
        p.second = true;
        return p;
    }
    pair<pair<int,int>,bool> leftOutput = isBST(root->left);
    pair<pair<int,int>,bool> rightOutput = isBST(root->right);
    int minValue = min(root->data,min(leftOutput.first.first,rightOutput.first.first));
    int maxValue = max(root->data,max(leftOutput.first.second,rightOutput.first.second));
    bool finalBST = ((root->data>leftOutput.first.second) && (root->data<rightOutput.first.first) && (leftOutput.second) && (rightOutput.second));
    pair<pair<int,int>,bool> finalOutput;
    finalOutput.first.first = minValue;
    finalOutput.first.second = maxValue;
    finalOutput.second = finalBST;
    return finalOutput;
}
pair<int,bool> heightisBST(BinaryTreeNode<int> *root){
    if(root == NULL){
        pair<int,bool> p;
        p.first = 0;
        p.second = true;
        return p;
    }
    pair<int,bool> leftPart = heightisBST(root->left);
    pair<int,bool> rightPart = heightisBST(root->right);
    int hL = leftPart.first;
    int hR = rightPart.first;
    bool isBSTorNot = isBST(root->left).second && isBST(root->right).second;
    pair<int,bool> finaloutPut;
    finaloutPut.first = max(hL,hR) + 1;
    finaloutPut.second = isBSTorNot;
    return finaloutPut;
}
int longestHeight(BinaryTreeNode<int> *root){
    if(root == NULL){
        return 0;
    }
    
    pair<int,bool> ans = heightisBST(root);
    if(ans.second){
        return ans.first;
    }
    return longestHeight(root->left) ||  longestHeight(root->right);

}
int main(){
    BinaryTreeNode<int> *root = takeInput();
    printLevelWise(root);
    pair<pair<int,int>,bool> ans = isBST(root);
    ans.second?cout<<"Binary Tree is a BST!!":cout<<"Binary Tree is not a BST!!";
    cout<<endl;
    int ansOf = longestHeight(root);
    cout<<ansOf;

}