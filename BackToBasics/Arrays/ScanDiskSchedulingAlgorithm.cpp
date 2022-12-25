// #include <stdio.h>
// #include <algorithm>
// void main(){
//     int n; 
//     // number of request
//     printf("Enter no of tracks : \n");
//     scanf("%d",n);
//     int arr[n+1];
//     // Request Sequence
//     printf("Enter tracks position : ");
//     for(int i=0;i<n;i++){
//         scanf("%d",&arr[i]);
//     }
//     int head = 65;
//     arr[n] = head;

//     // 55 58 60 70 18 90 150 160 184




//     return 0;
// }
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int n,i; 
    // number of request
    cout<<"Enter no of tracks : "<<endl;
    cin>>n;
    int arr[n+1];
    // Request Sequence
    cout<<"Enter tracks position : "<<endl;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    // 55 58 60 70 18 90 150 160 184 G.V

    int head = 65;
    arr[n] = head;
    // 55 58 60 70 18 90 150 160 184 65
    sort(arr,arr+n+1);
    int max = arr[n];
    int headPosition = 0;
    for(int i=0;i<n;i++){
        if(head == arr[i]){
            headPosition = i;
            break; 
        }
    }
    int totalSeekOperations = 0;
    cout<<"Disk Traversed : "<<endl;
    
    for(i=headPosition;i>=0;i--){
        cout<<arr[i]<<endl;
    }
    for(i=headPosition+1;i<n;i++){
        cout<<arr[i]<<endl;
    }
    totalSeekOperations = head + max;
    cout<<"Total number of seek operations : "<<totalSeekOperations;
    
    return 0;
}
/*
Enter no of tracks : 
9
Enter tracks position : 
55 58 60 70 18 90 150 160 184
Disk Traversed : 
65
60
58
55
18
70
90
150
160
Total number of seek operations : 249
*/