#include "Node.cpp"
void recursiveTraversal(Node *head){
    if(head == NULL)
        return;
    cout<<head->data<<" ";
    recursiveTraversal(head->next);

}
Node *eliminateDuplicates(Node *head){
    if(head == NULL || head -> next == NULL)
        return head;
    Node *temp = head,*Next;
    while(temp->next != NULL){
        if(temp -> data == temp -> next -> data){
            Node *t = temp -> next;
            Next = temp -> next -> next;
            delete t;
            temp -> next = Next;
            // delete t;
        }
        else{
        temp = temp -> next;
        }
    }
    return head;

}
int main(){
    Node *head = takeInput();
    recursiveTraversal(head);
    cout<<endl;
    head = eliminateDuplicates(head);
    recursiveTraversal(head);

}