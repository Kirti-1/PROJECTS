#include <iostream>
using namespace std;
void reverseArray(int *arr,int n){
    for(int i=0,j=n-1;i<n/2;i++,j--){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
int main(){
    int n;
    cin>>n;
    int *arr = new int[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    reverseArray(arr,n);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}