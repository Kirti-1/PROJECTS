#include "BinaryTree.h"
#include <vector>
vector<int> longestDistRootToLeaf(BinaryTreeNode<int> *root){
    if(root == NULL){
        vector<int> v;
        return v;
    }
    vector<int> vLeft = longestDistRootToLeaf(root->left);
    vector<int> vRight = longestDistRootToLeaf(root->right);
    if(vLeft.size()>vRight.size()){
        vLeft.push_back(root->data);
        return vLeft;
    }else{
        vRight.push_back(root->data);
        return vRight;

    }
    // return v;

}
// vector<int> longestDistRootToLeaf(BinaryTreeNode<int> *root){
//     vector<int> v;
//     longestDistRootToLeaf(root,v);
//     return v;
// }
class isCousin{
    public:
    int level;
    BinaryTreeNode<int> *Parent = NULL;
};
isCousin isCousinOrNot(BinaryTreeNode<int> *root,int val){
    if(root == NULL){
        return {0,NULL};
    }
    if(root->left!=NULL){
        if(root->left->data == val){
            return {1,root};
        }
    }
    if(root->right!=NULL){
        if(root->right->data == val){
            return {1,root};
        }
    }
    isCousin ansLeft = isCousinOrNot(root->left,val);
    isCousin ansRight = isCousinOrNot(root->right,val);
    if(ansLeft.Parent!=NULL){
        return {ansLeft.level+1,ansLeft.Parent};
    }else{
        return {ansRight.level+1,ansRight.Parent};
    }
}
bool isCousinOrNot(BinaryTreeNode<int> *root,int a,int b){
    isCousin ans1 = isCousinOrNot(root,a);
    isCousin ans2 = isCousinOrNot(root,b);
    cout<<ans1.level << " "<<ans2.level<<endl;
    cout<<ans1.Parent->data<< " "<< ans2.Parent->data<<endl;
    return ans1.level==ans2.level && ans1.Parent != ans2.Parent;

}
int main(){
    BinaryTreeNode<int> *root = takeInput();
    vector<int> v = longestDistRootToLeaf(root);
    for(int i:v){
        cout<<i<<endl;
    }
    int a,b;
    cin>>a>>b;
    bool answer = isCousinOrNot(root,a,b);
    if(answer){
        cout<<"TRUE";
    }else{
        cout<<"FALSE";
    }
}