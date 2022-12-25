#include <iostream>
using namespace std;
class Node{
    public:
    int data;
    Node *next;
    Node(int data){
        this -> data = data;
        next = NULL;
    }
    int printLL(Node *head){
        Node *temp = head;
        while(temp!=NULL){
            cout << temp->data << " ";
            temp = temp -> next;
        }
    return 0;
    }
};
Node *takeInput(){
    Node *head = NULL,*tail = NULL;
    int data;
    cin >> data;
    while(data!=-1){
        Node *newNode = new Node(data);
        if(head == NULL){
            head = newNode;
            tail = newNode;
        }
        else{
            tail -> next = newNode;
            tail = newNode;
        }
        cin >> data;
    }
    return head;
}
