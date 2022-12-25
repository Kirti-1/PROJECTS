#include <iostream>
using namespace std;
int f(int a, int b, int c = 10)
{ // rvalue reference
    return 11;
}
// int f(int &&a,int &&b,int &&c=10){ // rvalue reference
//     return 11;
// }
// int f(int &a,int &b,int &&c=10){ // rvalue reference
//     return 11;
// }
// int f(int a,int b){
//     return 10;
// }
int main()
{
    cout << f(1, 2) << endl;
    cout << f(1, 2, 3) << endl;
    int a = 1, b = 2, c = 3;
    cout << f(a, b, c) << endl;
    return 0;
}
