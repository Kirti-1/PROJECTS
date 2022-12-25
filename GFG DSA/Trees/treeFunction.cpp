#include "TreeNode.h"
#include <queue>
TreeNode<int> *takeInput(){
    int data;
    queue<TreeNode<int>*> Q;
    cin>>data;
    if(data==-1){
        return NULL;
    }
    TreeNode<int> *root = new TreeNode<int>(data);
    Q.push(root);
    while(!Q.empty()){
        TreeNode<int> *front = Q.front();
        Q.pop();
        int noOfChildNodes;
        cin>>noOfChildNodes;
        
        for(int i=0;i<noOfChildNodes;i++){
            int childValue;
            cin>>childValue;
            TreeNode<int> *child = new TreeNode<int>(childValue);
            front->children.push_back(child);
            Q.push(child);
            
        }
        

    }
    return root;

}
void levelWiseTraversal(TreeNode<int> *root){
    if(root == NULL){
        return;
    }
    queue<TreeNode<int>*> Q;
    Q.push(root);
    while(!Q.empty()){
        int size = Q.size();
        while(size--){
            TreeNode<int> *front = Q.front();
            Q.pop();
            cout<<front->data<<" ";
            for(int i=0;i<front->children.size();i++){
                Q.push(front->children[i]);
            }

        }
        cout<<endl;
    }
}
int main(){
    TreeNode<int> *root = takeInput();
    levelWiseTraversal(root);
    return 0;
}