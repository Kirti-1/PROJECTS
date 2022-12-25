#include <iostream>
using namespace std;
int removeDuplicatesEff(int*arr,int n){
    int size = 1;
    for(int i=1;i<n;i++){
        if(arr[size-1]!=arr[i]){
            arr[size] = arr[i];
            size++;
        }
    }
    return size;
}
int removeDuplicates(int *arr,int n){
    int size = 1;
    int *temp = new int[n];
    temp[0] = arr[0];
    for(int i=1;i<n;i++){
        if(temp[size-1]!=arr[i]){
            temp[size] = arr[i];
            size ++;
        }
    }
    for(int i=0;i<size;i++){
        arr[i] = temp[i];
    }
    delete temp;
    return size;

}
int main(){
    int n;
    cin>>n;
    int *arr = new int[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int newSize = removeDuplicatesEff(arr,n);
    for(int i=0;i<newSize;i++){
        cout<<arr[i]<<" ";
    }
    return 0;

}