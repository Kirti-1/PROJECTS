#include "DynamicStack.cpp"
int main(){
    DynamicStack s;
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    s.push(60);
    cout<< s.top()<<endl;
    cout<<s.pop()<<endl;
    cout<<s.pop()<<endl;
    cout<<s.pop()<<endl;
    cout<<s.isEmpty()<<endl;
    cout<<s.pop()<<endl;
    cout<<s.pop()<<endl;
    cout<<s.pop()<<endl;
    cout<<s.top()<<endl;
    (s.isEmpty()==1)?cout<<"True"<<endl:cout<<"False"<<endl;




}