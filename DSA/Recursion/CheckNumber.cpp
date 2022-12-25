#include <iostream>
using namespace std;
bool checkNumber(int input[], int size, int x){
  if(size==0)
    return false;
  if(input[0] == x)
    return true;
   return checkNumber(input+1,size-1,x);
}
int main(){
    int n = 3;
    int input[n] = {9,8,10};
    if(checkNumber(input,n,11))
       cout<<"True";
    else
    
       cout<<"False";
    
     
}