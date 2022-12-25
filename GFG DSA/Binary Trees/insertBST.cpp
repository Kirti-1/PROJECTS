#include "BinaryTree.h" 
class BST{
    BinaryTreeNode<int> *root;
    public:
    BST(){
        root = NULL;
    }
    private:
    BinaryTreeNode<int> *insert(BinaryTreeNode<int> *node,int data){
        if(node == NULL){
            BinaryTreeNode<int> *newNode = new BinaryTreeNode<int>(data);
            return newNode;
        }
        if(node->data>data){
            node->left = insert(node->left,data);
        }else{
            node->right = insert(node->right,data);
        }
        // if(node->data<data && node->right==NULL){ 
        //     BinaryTreeNode<int> *newNode = new BinaryTreeNode<int>(data);
        //     node->right = newNode;
        //     return node;
        // }else if(node->data>data){
        //         if(node->left==NULL){
        //             BinaryTreeNode<int> *newNode = new BinaryTreeNode<int>(data);
        //             node->left = newNode;
        //             return node;}
        //         insert(node->left,data);}
                
        // else if(node->right!=NULL){
        //         insert(node->right,data);
        //     }
        // else if(node->data<data && node->right!=NULL){
        //         insert(node->left,data);
        //     }
        
        
    return node;
    }
    void print(BinaryTreeNode<int> *root){
        if(root == NULL)
        return;

        print(root->left);
        cout<<root->data<<" ";

        print(root->right);
    }

    

    public:
    void insert(int data){
       this->root =  insert(root,data);
    }
    void print(){
        
    print(root);
    cout<<endl;
    printLevelWise(root);
    }

};