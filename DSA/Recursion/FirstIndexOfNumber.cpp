#include <iostream>
using namespace std;
int firstIndex(int input[], int size, int x){
  if(size == 0)
    return -1;
  if(input[0]==x)
    return 0;
  int ans = firstIndex(input+1,size-1,x);
  if(ans == -1)
    return ans;
  return ans + 1;
    
}

int main(){
    int n = 10;
    int arr[n] = {12,3,45,32,1,3,45,6,3,10,89};
    cout<<firstIndex(arr,n,45);
    

}