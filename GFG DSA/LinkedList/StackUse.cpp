#include "StackImplementation.cpp"
using namespace std;
int main(){
    Stack s;
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    s.push(60);
    cout << s.size() << endl;
    cout << s.pop() << endl;
    cout << s.pop() << endl;
    cout << s.pop() << endl;
    cout << s.pop() << endl;
    cout << "Top Element in stack " <<s.peek() << endl;
    cout << s.size() << endl;
    cout << s.pop() << endl;
    cout << s.pop() << endl;

    s.isEmpty()?cout<<"yes empty!"<<endl:cout<<"Not empty!"<<endl;

}