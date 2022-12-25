#include "Node.cpp"
Node *reverseLLM2(Node *prev,Node *curr){
    if(curr==NULL)
        return prev;
    Node *Next = curr -> next;
    curr -> next = prev;
    return reverseLLM2(curr,Next);
}
Node *reverseLLM2(Node *head){
    return reverseLLM2(NULL,head);
}
Node *reverseLL(Node *head){
    if(head==NULL || head->next == NULL)
        return head;
    Node *revHead = reverseLL(head -> next);
    Node *revTail = head -> next;
    revTail -> next = head;
    head -> next = NULL;
    return revHead;    
}
int main(){
    Node *head = takeInput();
    head = reverseLLM2(head);
    head -> printLL(head);
    head = reverseLL(head);
    cout<<endl;
    head -> printLL(head);
/*
I/P = 1 2 3 4 5 6 7 8 9 10 -1
O/P M1 = 10 9 8 7 6 5 4 3 2 1
O/P M2 = 1 2 3 4 5 6 7 8 9 10
*/
}