#include "LinkedList.h"
int main()
{
    LinkedList ll;
    ll.add(11);
    ll.add(23);
    ll.add(13);
    ll.add(121);
    ll.add(134);
    ll.add(132);
    ll.add(112);
    ll.add(0, 10);
    ll.add(1, 12);
    ll.add(2, 15);
    ll.add(10, 19);
    /*cout<< ll.sizeOfLL()<<endl;
    ll.print();
    cout<<endl;
    cout<<ll.head.data<<" "<<ll.tail.data<<endl;
    ll.removeLast();
    ll.removeFirst();
    ll.remove(12); // first element
    ll.remove(13); // between
    ll.remove(112); // last element
    ll.remove(112); // if the data doesn't exist
    ll.addFirst(10);
    ll.addLast(19);
    ll.set(0,1);
    cout<< ll.sizeOfLL() <<endl;
    cout<<ll.head.data<<" "<<ll.tail.data<<endl;
    ll.print();
    cout<<endl;
    cout << ll << endl;
    cout << ll.get(4) << " "<< ll.get(0) << " " << ll.get(7) << " "<< ll.get(8) << endl;
    for(auto i=ll.head;i!=ll.tail.next;i=i.next){
        cout << i.data << " ";
    }
    */
    // LinkedList ll2;
    // cin >> ll2;
    // cout << ll2 << endl;
    LinkedList ll3(ll);
    ll3.head->data = 1;
    ll3.removeFirst();
    ll3.removeFirst();
    ll3.addFirst(56);
    ll.add(3682);
    cout << ll3 << endl;
    cout << ll3.sizeOfLL() << endl;
    cout << ll3.tail->data << endl;
    cout << ll << endl;
    cout << ll.sizeOfLL() << endl;
    cout << ll.tail->data << endl;
}