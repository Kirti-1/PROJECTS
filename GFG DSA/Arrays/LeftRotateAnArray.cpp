#include <iostream>
#include "Array.cpp"
using namespace std;
// void leftRotateByOne(int *arr,int n){
//     int i=1,temp=arr[0];
//     for(;i<n;i++){
//         arr[i-1] = arr[i];
//     }
//     arr[i-1] = temp;

// }
void leftRotateDPlacesM1(int *arr,int n,int d){
    for(int t=0;t<d;t++){
     leftRotateByOne(arr,n);//Naive method
    }
}
void leftRotateDPlacesM2(int *arr,int n,int d){
    reverseArray(arr,0,d-1);
    reverseArray(arr,d,n-1);
    reverseArray(arr,0,n-1);
}
void leftRotateDPlacesEff(int *arr,int n,int d){
    
}
int main(){
    // Array a;
    int n;
    cin>>n;
    int *arr = new int[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    leftRotateByOne(arr,n);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    leftRotateDPlacesM2(arr,n,9);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}