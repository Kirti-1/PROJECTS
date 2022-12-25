#include <iostream>
using namespace std;
void moveZeros(int *arr,int n){
    int res = 0; //count of all non-zeros element
    for(int i=0;i<n;i++){
        if(arr[i]){
            int temp = arr[i];
            arr[i] = arr[res];
            arr[res] = temp;
            res++;
        }
    }
    // if(res!=0)
    // for(int i=res;i<n;i++){
    //     arr[i] = 0;
    // }
   
}
// 1 2 3 0 10 192 0 12 0 11
int main(){
    int n;
    cin>>n;
    int *arr = new int[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    moveZeros(arr,n);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    return 0;

}