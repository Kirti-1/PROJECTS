#include <iostream>
using namespace std;
int countZeros(int n){
    if(n==0 && n%10==0)
        return 1;
    if(n/10==0)
        return 0;
    if(n%10==0)
        return 1 + countZeros(n/10);
    return countZeros(n/10);    
     
}
int main(){
    cout<<countZeros(0);
    return 0;
}