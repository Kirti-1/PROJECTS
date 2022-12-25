#include "Node.cpp"
using namespace std;
void CircularLL(Node *head){
    if(head == NULL)
       return;
    Node *start = head;
    while(head -> next != start){
        cout << head->data <<" ";
        head = head -> next;
    }
    cout<< head -> data<<" ";
    head = head -> next;
}
void circularLinkedList(Node *head){
    Node *temp = head;
    while(temp -> next != NULL){
        temp = temp -> next;
    }
    temp -> next = head;

}
int main(){
    Node *head = takeInput();
    circularLinkedList(head);
    CircularLL(head);
}