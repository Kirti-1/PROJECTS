// #include "Node.cpp"
#include <iostream>
using namespace std;
class Dequeue{
    public:
    int data,size,*dequeue,capacity;
    int front,rear;
    Dequeue(int capacity){
        this -> capacity = capacity;
        size = 0;
        dequeue = new int[capacity];
        front = -1;
        rear = -1;
    }
    bool isFull(){
        if(front == 0 && rear == size-1 || front == rear + 1){
            return true;
        }
        return false;
    }
    bool isEmpty(){
        if(front == -1){
            return true;
        }
        return false;
    }
    void frontPush(int data){
        if(isFull()){
          cout<<"FULL"<<endl;
          return;  
        }
        if(front == -1){
            front =0;
            rear = 0;
        }
        else if(front==0){
            front = size - 1;
        }
        else {
            front -- ;
        }
        dequeue[front] = data;
        size ++ ;

    }
    void pushBack(int data){
        if(isFull()){
            cout<<"FULL"<<endl;
            return;
        }
        if(front == -1){
            front = rear = 0;
        }
        else if(rear == size -1){
            rear = 0;
        }
        else{
            rear ++;
        }
        dequeue[rear] = data;
        size ++ ;

    }
    int popFront(){
        if(isEmpty()){
            return -1;
        }
        int ans = dequeue[front];
         
        if(front == rear){
            front = rear = -1;
        }
        else if(front == size-1){
            front = 0;

        }
        else{
            front ++ ;
        }
        size --;
        return ans;
        
    }
    int backPop(){
        if(isEmpty()){
            return -1;
        }
        int ans = dequeue[rear];
        if(rear == front){
            rear = front = -1;
        }
        else if(rear == 0){
            rear = size - 1;
        }
        else{
            rear --;
        }
        size --;
        return ans;
    }


};