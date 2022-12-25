#include "Node.cpp"
Node *reverseLinkedList(Node *head){
    if(head == NULL || head -> next == NULL){
        return head;
    }
    Node *revHead = reverseLinkedList(head -> next);
    Node *revTail = head -> next;
    revTail -> next = head;
    head -> next = NULL;
    return revHead;
}
Node *incrementLL(Node *head){
    if(head == NULL)
       return head;
    head = reverseLinkedList(head);
    int carry = 1;
    int sum;
    Node *temp;
    Node *revHead = head;
    while(head != NULL){
        sum = head -> data + carry;
        carry = sum >= 10 ? 1 : 0;
        sum = sum % 10;
        head -> data = sum;
        temp = head;
        head = head -> next;
    }
    if(carry>0){
        temp->next = new Node(carry);
    }
    // head = temp -> next;
    head = reverseLinkedList(revHead);
    return head;

}
int main(){
    Node *head = takeInput();
    head = incrementLL(head);
    head->printLL(head);
}