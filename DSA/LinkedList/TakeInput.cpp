#include <iostream>
#include "ClassNode.cpp"
#include "MidPointOfLL.cpp"
using namespace std;
Node *takeInput(){
    int data;
    
    cin>>data;
    Node *head = NULL;  
    Node *tail = NULL;
    while(data!=-1){
        Node *n = new Node(data);
        if(head == NULL){
            head = n;
            tail = n;
        }
        else{
            // Node *temp = head;
            // while(temp -> next != NULL){//o(n) complexity for o(1) we must maintain a tail pointer as well.
            //     temp = temp -> next;
            // } 
            // temp -> next = n;
            tail -> next = n;
            tail = tail -> next;
            /*n -> next = head;
            head = n;*/
        }
        cin>>data;
    }
    return head;

}
int main(){
    Node* head = takeInput();
    Node *temp = head;
    while(temp!=NULL){
        cout<<temp->data<<" ";
        temp = temp -> next;
    }
    cout<<endl;
    Node *mid = midPointOfLL(head);
    cout<<mid->data<<" ";
    
    return 0;

}