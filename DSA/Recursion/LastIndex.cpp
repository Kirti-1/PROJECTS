#include <iostream>
using namespace std;
int lastIndexFromBeg(int input[], int size, int x){
    if(size==0)
      return -1;
    int ans = lastIndexFromBeg(input+1,size-1,x);
    if(input[0] == x)
        return ans + 1;
    if(input[0] != x && ans!=-1)
        return ans + 1;          
    return ans;
}

int lastIndexFromEnd(int input[], int size, int x){
    if(size==0)
      return -1;
    if(input[size-1]==x)
      return size-1;
    int ans = lastIndexFromEnd(input,size-1,x);
    return ans;
}

int main(){
    int n = 10;
    int arr[n] = {12,3,45,32,1,3,45,6,3,10,89};
    cout<<lastIndexFromBeg(arr,n,45)<<endl<<lastIndexFromEnd(arr,n,45);
    

}