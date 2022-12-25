#include "Node.cpp"
using namespace std;
void circularLinkedList(Node *head){
    Node *temp = head;
    while(temp -> next != NULL){
        temp = temp -> next;
    }
    temp -> next = head;

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
    temp = head;
    Node *start = head;
    circularLinkedList(head);
    while(temp -> next!= start){
        cout<<temp->data<<" ";
        temp = temp -> next;
    }
        cout<<temp->data<<endl;


}