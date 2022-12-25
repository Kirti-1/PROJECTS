#include "Node.cpp"
using namespace std;
class Queue{
    Node *rear;
    int size;
    public:
    Queue(){
        rear = NULL;
        size = 0;
    }
    int sizeOf(){
        return size;
    }
    bool isEmpty(){
        return size == 0;
    }
    void enqueue(int element){
        Node *newNode = new Node(element);        
        if(isEmpty()){
            rear = newNode;
            size++;
            return;
        }
        else if(size == 1){
            rear -> next = newNode;
            newNode -> next = rear;
            rear = rear -> next;
            size ++;
            return;
            
        }
        newNode -> next = rear -> next;
        rear -> next = newNode;
        rear = rear -> next;
        size ++;
        
    }
    int dequeue(){
        if(isEmpty())
            return -1;
        Node *temp = rear -> next;
        int ans = temp -> data;
        rear -> next = temp -> next;
        delete temp;
        size --;
        return ans;
    }
    int peek(){
        if(isEmpty())
            return -1;
        return rear -> next -> data;
    }
};