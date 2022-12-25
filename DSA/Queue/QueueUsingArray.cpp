#include <iostream>
using namespace std;
class QueueUsingArray{
int *Queue;
int capacity;
int Qsize;
int firstIndex,nextIndex;
public:
QueueUsingArray(int capacity){
    this -> capacity = capacity;
    Qsize = 0;
    firstIndex = -1;
    nextIndex = 0;
    Queue = new int[capacity];
}
int size(){
    return Qsize;
}
bool isEmpty(){
    return Qsize == 0;
}
void enqueue(int data){
    if(firstIndex == -1){
        Queue[0] = data;
        nextIndex += 1;
        firstIndex += 1; 
        Qsize += 1;
    }
    else if(nextIndex == capacity){
        if(Qsize!=capacity){
            nextIndex = 0;
            Queue[nextIndex] = data;
            nextIndex += 1;
            Qsize += 1;

        }else{
            cout<<"Queue Full!";
            return;
        }
    }
    else{
        Queue[nextIndex] = data;
        nextIndex += 1;
        Qsize += 1;



    }
}
int front(){
    if(firstIndex == -1)
        return -1;
    else{
        return Queue[firstIndex];
    }
}
int dequeue(){
    int ans = front();
    if(ans != -1){
    firstIndex += 1;
    Qsize -= 1; }
    return ans;
}
}; 