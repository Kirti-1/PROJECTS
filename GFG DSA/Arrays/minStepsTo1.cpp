#include <iostream>
using namespace std;
int func(int n){
    if(n == 1){
        return 0;
    }
    if(n%6==0){
        return 1+func(n/3);
    }
    if(n%3==0){
        return 1+func(n/3);
    }
    if(n%2==0){
        return 1+func(n/2);
    }
    if(n%6!=0){
        return 1+func(n-1);

    }
    
}
int main(){
    int n;
    cin>>n;
    cout << func(n);
    // cout<<count;
    return 0;
}