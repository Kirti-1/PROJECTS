#include <iostream>
using namespace std;
void leaderOfArray(int *arr,int n){
    int leader = arr[n-1];
    for(int i=n-2;i>=0;i--){
        if(arr[i]>leader){
            leader = arr[i];
        }
    }
       cout<<leader<<" ";  
    
}
int main(){
    int n;
    cin>>n;
    int *arr = new int[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    leaderOfArray(arr,n);
    return 0;
}