#include "insertBST.cpp"
int main(){
    BST *b = new BST();
    b->insert(10);
    b->insert(5); 
    b->insert(15); 
    b->insert(3);
    b->insert(7); 
    b->insert(16);
    b->insert(6);

    b->print();
    

}