#include "Node.cpp"
class Queue{
    Node *front,*rear;
    int sizeOf;
    public:
    Queue(){
        front = NULL;
        rear = NULL;
        sizeOf = 0;
    }
    int size(){
        return sizeOf;
    }
    bool isEmpty(){
        return sizeOf == 0;
    }
    void enqueue(int element){
        Node *newNode = new Node(element);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
            sizeOf++;
            return;
        } 
        rear -> next = newNode;
        rear = newNode;
        sizeOf ++;
    }
    int dequeue(){
        if(isEmpty())
            return -1;
        int ans = front -> data;
        Node *temp = front;
        front = front -> next;
        delete temp;
        sizeOf --;
        return ans;
    }
    int peek(){
        if(isEmpty())
           return -1;
        return front -> data;
    }



};