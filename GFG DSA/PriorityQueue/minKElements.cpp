#include <iostream>
#include <queue>
using namespace std;
void minKElements(int arr[],int n,int k){
    priority_queue<int> pq;
        for(int i=0;i<k;i++){
            pq.push(arr[i]);
        }
        for(int i=k;i<n;i++){
            if(arr[i]<pq.top()){
                pq.pop();
                pq.push(arr[i]);
            }
        }
        for(int i=0;i<k;i++){
            cout<<pq.top()<<" ";
            pq.pop();
        }

    
}
int main(){
    int n;
    int arr[n];
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    minKElements(arr,n,4);
    return 0;
}