#include "Node.cpp"
class Stack{
    Node *head;
    int sizeOf;
    public:
    Stack(){
        head = NULL;
        sizeOf = 0;
    }
    int size(){
        return sizeOf;
    }
    bool isEmpty(){
        return size() == 0;
    }
    void push(int ele){
        Node *newNode = new Node(ele);
        if(head == NULL){
            head = newNode;
            sizeOf++;
            return;
        }
        newNode -> next = head;
        head = newNode;
        sizeOf ++; 
    }
    int pop(){
        if(isEmpty())
            return -1;
        int ans = head -> data;
        Node* temp = head;
        head = head -> next;
        sizeOf --;
        delete temp;
        return ans;
    }
    int peek(){
        if(isEmpty())
           return -1;
        return head->data;
    }


};