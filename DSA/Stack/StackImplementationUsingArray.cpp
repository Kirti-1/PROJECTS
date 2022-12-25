#include <iostream>
// #include <climits>
using namespace std;
class StackImplementationUsingArray{
    int *data;
    int topEle;
    int capacity;
    public:
    StackImplementationUsingArray(int total){
        capacity = total;
        data = new int[total];
        topEle = 0;
    }
    int size(){
        return topEle;
    }
    bool isEmpty(){
        return topEle == 0;
    }
    void push(int element){
        if(topEle != capacity){
            data[topEle] = element;
            topEle += 1;
        }
        else{
            cout<<"Stack is full!!"<<endl;
        }
    }
    int pop(){
        if(isEmpty()){
            cout<<"Stack is Empty!"<<endl;
            return INT_MIN;

        }
        else{
            topEle -= 1;
            return data[topEle];
        }
    }
    int top(){
        if(isEmpty()){
            cout<<"Stack is Empty!"<<endl;
            return INT_MIN;
        }
        else{
            return data[topEle-1];

        }
    }

};