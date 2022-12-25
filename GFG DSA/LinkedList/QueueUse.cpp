#include "QueueCircularImplementation.cpp"
using namespace std;
int main(){
    Queue q;
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.enqueue(50);
    cout << q.sizeOf() << endl;
    cout << q.dequeue() << endl;
    cout << q.dequeue() << endl;
    cout << q.peek() << endl;
    cout << q.dequeue() << endl;
    cout << q.dequeue() << endl;
    cout << q.sizeOf() << endl;
    cout << q.peek() << endl;

/*
5
10
20
30
30
40
1
50
*/
}