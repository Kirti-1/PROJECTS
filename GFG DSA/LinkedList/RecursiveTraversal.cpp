#include "Node.cpp"
using namespace std;
void recursiveTraversal(Node *head){
    if(head == NULL)
        return;
    cout<<head->data<<" ";
    recursiveTraversal(head->next);

}
int main(){
    Node *head = takeInput();
    recursiveTraversal(head);
}