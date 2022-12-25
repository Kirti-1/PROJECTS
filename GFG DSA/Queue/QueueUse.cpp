#include <iostream>
#include "QueueUsingArray.cpp"
using namespace std;
int main(){
    Queue q(5);
    cout<< q.sizeOf()<<endl;
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.enqueue(50);
    cout<< q.sizeOf()<<endl;
    cout << q.dequeue()<<endl;
    cout << q.dequeue()<<endl;
    cout << q.dequeue()<<endl;
    cout << q.dequeue()<<endl;
    cout<< q.sizeOf()<<endl;
    q.isEmpty()?cout<<"Yes empty"<<endl:cout<<"Not empty"<<endl;

}