#include <iostream>
#include <queue>
template <typename K,typename V>
class BinaryTreeNode{
    public:
    // T data;
    K key;
    V value;
    BinaryTreeNode *left;
    BinaryTreeNode *right;
    BinaryTreeNode(T data){
        this -> data = data;
        left = NULL;
        right = NULL;
    }
};
