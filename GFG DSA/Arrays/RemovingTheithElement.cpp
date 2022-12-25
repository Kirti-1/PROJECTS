#include <iostream>
using namespace std;
void removeithElement(int *arr,int n,int pos){
    for(int i=0;i<n;i++){
        if(arr[i]==arr[pos]){
            for(int j=i;j<n-1;j++){
                arr[j] = arr[j+1]; 

            }break;
        }
    }
}

int main(){
    int arr[]={12,323,98,12,34,2,1,213,23,3};
    removeithElement(arr,10,1);
    
    for(int i=0;i<9;i++){
        cout<<arr[i]<<" ";
    }
}