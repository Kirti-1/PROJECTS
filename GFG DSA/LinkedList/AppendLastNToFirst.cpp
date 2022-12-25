#include "Node.cpp"
using namespace std;
Node *appendLastNToFirstM1(Node*head,int n){
    if(head == NULL || head -> next == NULL)
       return head;
   int size = 0;
   Node *tail = head;
   if(head!=NULL)
      size = 1;
   while(tail -> next != NULL){
       tail = tail -> next;
       size ++;
   }
   tail -> next = head;
   int i = 0;
   Node *temp = head;
   while(i<size-n-1){
       temp = temp -> next;
       i++;
   }
   head = temp -> next;
   temp -> next = NULL;
   return head;
}
Node *appendLastNToFirst(Node *head, int n){
    if(head == NULL || head -> next == NULL)
       return head;
    Node *first = head,*second = head;
    int i = 0;
    while(i<n-1){
        first = first -> next;
        i++;
    }
    Node *prev;
    while(first->next!= NULL){
        prev = second;
        second = second -> next;
        first = first -> next;
    }
    prev -> next = NULL;
    first -> next = head;
    head = second;
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
    int n;
    cin>>n;
    Node *temp = appendLastNToFirst(head,n);
    recursiveTraversal(temp);
}