#include <iostream>
#include <cmath>
using namespace std;
int smallPart;
int powerFunc(int x,int n){
    if(n==0)
       return 1;
    else if(n==1)
       return x;
    smallPart = powerFunc(x*x,n/2);
    if(n%2==0)
        return smallPart;
    else 
        return x * smallPart;
}
int power_NaiveMethod(int x,int n){
    if(n==0)
       return 1;
    if(x==1)
       return x;
    return x*power_NaiveMethod(x,n-1);
    }
int main(){
    // int x,n;
    cout<<power_NaiveMethod(3,15)<<endl;
    cout<<powerFunc(3,15)<<endl;
    cout<<pow(3,15);

    return 0;

}