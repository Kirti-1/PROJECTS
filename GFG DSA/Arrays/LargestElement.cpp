#include <iostream>
#include <climits>
#include <vector>
using namespace std;
int getLargest(int *arr,int n){
    int res = 0;

    for(int i=1;i<n;i++){
        if(arr[i]>arr[res])
            res = i;
    }
    return res;
     
}
int secondLargest(int *arr,int n){
    // int largest = getLargest(arr,n);
    // int res = -1; 
    // for(int i=0;i<n;i++){
    //     if(arr[i]!=arr[largest]){
    //         if(res == -1){
    //             res = i;
    //         }
    //         else if(arr[i]>arr[res]){
    //             res = i;
    //         }
    //     }
    // }
    int flar,slar;
    flar=slar=INT_MIN;
    int pos=0;
    for(int i=0;i<n;i++){
        if(arr[i]>flar){
            slar = flar;
            flar = arr[i];
        }
        else if(arr[i]>slar && arr[i]<flar){
            slar = arr[i];
            pos = i;
        }

    }
    return pos;
}
int main(){
    int n;
    cin>>n;
    int *arr = new int[n];
    for(int i=0;i<n;i++)
        cin>>arr[i];
    cout<<"The maximum element is "<<arr[getLargest(arr,n)]<<endl;
    cout<<"The second maximum element is "<<arr[secondLargest(arr,n)];

}