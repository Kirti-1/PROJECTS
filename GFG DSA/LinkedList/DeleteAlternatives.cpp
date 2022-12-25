#include "Node.cpp"
void deleteAlternate(Node *head){
    if(head == NULL || head -> next == NULL)
        return;
    Node *temp = head;
    while(temp->next!=NULL && temp->next->next!=NULL){
        Node *Next = temp ->next -> next;
        Node *t = temp -> next;
        temp -> next = Next;
        temp = Next;
        delete t;
        
             }
    Node*t =  temp -> next;
    temp->next = NULL;
    delete t;
}
int main(){
    Node *head = takeInput();
    deleteAlternate(head);
    head -> printLL(head);

}