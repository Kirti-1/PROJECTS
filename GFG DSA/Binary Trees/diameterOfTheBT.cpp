#include "BinaryTree.h"
pair<int,int> heightDia(BinaryTreeNode<int> *root){
    if(root == NULL){
        pair<int,int> p ;
        p.first = 0;
        p.second = 0; 
        return p;    }
    
    pair<int,int> Left= heightDia(root->left);
    pair<int,int> Right = heightDia(root->right);
    int hL=Left.first;
    int dL=Left.second;
    int hR=Right.first;
    int dR=Right.second;

    
    pair<int,int> FHD;
    FHD.first = max(hL,hR)+1;
    FHD.second = max(hL+hR,max(dL,dR));
    return FHD;

}
int main(){
    BinaryTreeNode<int> *root = takeInput();
    printLevelWise(root);
    pair<int,int> p = heightDia(root);
    cout<<p.first<<" "<<p.second;
    return 0;
}