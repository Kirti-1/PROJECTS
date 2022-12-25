#include <iostream>
using namespace std;
void printNumbers(int n){
    if(n>0){
        printNumbers(n-1);
        cout<<n<<" ";
    }
    return;
}
int main(){
    int n=6;
    printNumbers(n);
    return 0;
}