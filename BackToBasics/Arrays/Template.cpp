#include <iostream>
using namespace std;
// function template
// template <class type> type func_name(type arg1,type arg2,..){}
// generalized function
template <typename T> 
T big(T a, T b){
    if(a>b)
        return a;
    return b;
}
// class template
// template <class type> class class_name{};

int main(){
    // Write your code here
    cout<<big(4.3,5.6)<<endl;
    cout<<big(43,56)<<endl;
    cout<<big(43.278,53783.12);

    return 0;
}