#include "Node.cpp"
using namespace std;
Node *reverseIterative(Node *head){
    /* 2 ways in a Singly Linked List :
    I. You can store the data of nodes in an array and then iteratively insert them into the Node's data (node -> data) without actually changing their order.
     - o(n),o(n) both space and time complexity. (Using an auxiliary array)
    II.  Change the links rather than changing the data.
    */
   if(head == NULL || head -> next == NULL)
        return head;
    Node *prev = NULL,*curr = NULL;
    Node *Next = head;
    if(head -> next != NULL){
        curr = head;
        Next = head -> next;
    }
    while(Next != NULL){
        curr -> next = prev;
        prev = curr;
        curr = Next;
        Next = Next -> next;
    }
    curr -> next = prev;
    head = curr;
    return head;

}
void recursiveTraversal(Node *head){
    if(head == NULL)
        return;
    cout<<head->data<<" ";
    recursiveTraversal(head->next);

}
int main(){
    Node *head = takeInput();
    Node *reverserHead = reverseIterative(head);
    recursiveTraversal(reverserHead);
    return 0;
}