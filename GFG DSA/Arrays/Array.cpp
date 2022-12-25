#include <iostream>
int getLargest(int *arr,int n){
    int res = 0;

    for(int i=1;i<n;i++){
        if(arr[i]>arr[res])
            res = i;
    }
    return res;
     
}
int secondLargest(int *arr,int n){
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
void leftRotateByOne(int *arr,int n){
    int i=1,temp=arr[0];
    for(;i<n;i++){
        arr[i-1] = arr[i];
    }
    arr[i-1] = temp;

}
void reverseArray(int *arr,int i,int j){
    for(;i<j;i++,j--){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
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
}
int removeDuplicates(int*arr,int n){
    int size = 1;
    for(int i=1;i<n;i++){
        if(arr[size-1]!=arr[i]){
            arr[size] = arr[i];
            size++;
        }
    }
    return size;
}
void removeithElement(int *arr,int n,int pos){
    for(int i=0;i<n;i++){
        if(arr[i]==arr[pos]){
            for(int j=i;j<n-1;j++){
                arr[j] = arr[j+1]; 

            }break;
        }
    }
}
