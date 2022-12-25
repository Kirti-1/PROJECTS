#include <iostream>
using namespace std;
int allIndexes(int input[],int size,int x,int output[]){
    if(size==0)
       return 0;
    int ans = allIndexes(input+1,size-1,x,output);
    if(input[0]==x){
        for(int i=ans-1;i>=0;i--){
            output[i + 1] = output[i] + 1;
        }
        output[0] = 0;
        ans = ans + 1;

    }
    else
    {
        for(int i=ans-1;i>=0;i--){
            output[i] = output[i] + 1;
        }
    }
    return ans;
}
int main(){
    int n = 10;
    int arr[n] = {12,3,45,32,1,3,45,6,3,89};
    int *output = new int[n];
    int ans = allIndexes(arr,n,89,output);
    cout<<ans<<endl;
    for(int i=0;i<ans;i++){
        cout<<output[i]<<" ";
    }
 
}