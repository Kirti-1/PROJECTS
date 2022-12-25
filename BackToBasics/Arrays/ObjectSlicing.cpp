// #include <iostream>
// using namespace std;
// class Base{
//     protected:
//     int a;
//     public:
//     Base(int a){
//         this->a = a;
//     }
//     void display(){
//         cout<< "Base class "<< a << endl; 
//     }
// };
// class Derived : public Base{
//     int b;
//     public:
//     Derived(int a,int b) : Base(a){
//         this->b = b;
//     }
//     void display(){
//         cout<< "Derived class "<< a <<" and "<< b << endl; 

//     }
// };
// void displayFunc(Base &obj){
//     obj.display();
// }

// int main(){
//     // Write your code here
//     Base b(33);
//     Derived d(45,60);
//     d.display();
//     displayFunc(b);
//     displayFunc(d);
//     return 0;
// }
#include <iostream>
using namespace std;
class Base{
    public:
    virtual void display(){
        cout<<"in base class! "<<endl;
    }
    void fun(){
        cout<<" FUN !";
    }
};
class Derived {
    public:
    void display(){
        cout<<"in Derived class! "<<endl;
    }
};
int main(){
    // Write your code here
    Derived *dptr,dobj;
    Base *bptr,bobj;
    bptr = &bobj;
    dptr = &dobj;


    // b.display();
    // d.display();
    cout<<sizeof(bobj)<<" "<<sizeof(dobj)<<endl;
    // cout<<sizeof(bptr)<<" "<<sizeof(dptr)<<endl;


    return 0;
}