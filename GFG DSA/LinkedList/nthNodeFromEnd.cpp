#include "Node.cpp"
// Node *nthNodeM1(Node *head){
//     // Using length of the LL
// }
Node *nthNodeM2(Node *head,int n){
    // Using 2 pointers
    Node *first = head,*second = head;
    int i = 0;
    while(i<n){
        
        first = first -> next;
        
        i++;
    }
    while(first!= NULL){
        second = second -> next;
        first = first -> next;
    }
    return second;
}
int main(){
    Node *head = takeInput();
    int n;
    cin>>n;
    Node *nthNode = nthNodeM2(head,n);
    head -> printLL(head);
    cout<<endl;
    cout<<"Nth Node from end = "<<nthNode->data;
}
 