#include "Node.cpp"
using namespace std;
Node *insertNode(Node *head,int data,int i){
    Node *newNode = new Node(data);
    if ( i == 0){
        newNode -> next = head;
        head = newNode;
        return head;
    }
    int x = 0;
    Node *temp = head;
    while(x<i-1 && temp!=NULL){
        x++;
        temp = temp -> next;
    } 
    newNode -> next = temp -> next;
    temp -> next = newNode;
    return head; 

}
Node *takeInput(){
    Node *head =  NULL,*tail = NULL;
    int data;
    cin>>data;
    while(data!=-1){
        Node *newNode = new Node(data);
        if(head==NULL){
            head = newNode;
            tail = newNode;
        }
        else {
            tail -> next = newNode;
            tail = newNode;
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
    cout<< endl;
    head = insertNode(head,1,0);
    head = insertNode(head,2,1);
    head = insertNode(head,3,2);
    temp = head;
    while(temp != NULL){
        cout<<temp->data<<" ";
        temp = temp -> next;
    }
/*
Input : 4 5 6 7 8 9 10 -1
Before insertion O/p: 4 5 6 7 8 9 10
After insertion O/p : 1 2 3 4 5 6 7 8 9 10
*/

}