#include <iostream>
using namespace std;
int multiplyNumbers(int m,int n){
    if(n==1)
       return m;
    int big = m>n?m:n;
    int small = m>n?n:m;
    return big + multiplyNumbers(big,small-1);
}
int main(){
    cout<<multiplyNumbers(175,277)<<endl;
    cout<<175*277;
}