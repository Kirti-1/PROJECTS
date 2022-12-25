/*To remove the size Constraint from the stack implementation using array*/
#include <iostream>
using namespace std;
class DynamicStack{
    int *data;
    int topEle;
    int capacity;
public:
    DynamicStack(){
        data = new int[5];
        capacity = 5;
        topEle = 0;
    }
    int size(){
        return topEle;
    }
    bool isEmpty(){
        return topEle == 0;
    }
    void push(int element){
        if(topEle == capacity){
            int *newData = new int[2 * capacity];
            for(int i=0;i<capacity;i++){
                newData[i] = data[i];
            }
            delete []data;
            data = newData;
            data[topEle] = element;
            capacity *= 2;
            topEle += 1;

        }
        else{
            data[topEle] = element;
            topEle += 1;
        }
    }
    int pop(){
        if(isEmpty()){
            cout<<"Stack Empty!"<<endl;
            return -1;
        }
        else{
            topEle -= 1;
            return data[topEle];
        }
    }
    int top(){
        if(isEmpty()){
            cout<<"Stack Empty!"<<endl;
            return -1;
        }
        else{
            return data[topEle-1];
        }
    }
    


};