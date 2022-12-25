#include "QueueUsingArray.cpp"
int main()
{
    QueueUsingArray Q(5);
    Q.enqueue(10);
    Q.enqueue(20);
    Q.enqueue(30);
    Q.enqueue(40);
    Q.enqueue(50);
    cout << Q.size() << endl;
    cout << Q.dequeue() << endl;
    cout << Q.dequeue() << endl;
    cout << Q.size() << endl;
    cout << Q.front() << endl;
    Q.enqueue(60);
    Q.enqueue(70);
    cout << Q.dequeue() << endl;
    cout << Q.dequeue() << endl;
    cout << Q.dequeue() << endl;
    cout << Q.size() << endl;
    Q.enqueue(80);
    Q.enqueue(90);
    Q.enqueue(100);
    cout << Q.size() << endl;
    Q.enqueue(110);
}