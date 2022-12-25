 #include <iostream>
 using namespace std;
 int twoNumberSum(int *array,int n,int sum){
     int k = 0;
     for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
             if(array[i]+array[j]==sum){
                 k+=1;
             }
         }
     }
      return k;

 }
 int main(){
     int n;
     cout<<"Enter the number of elements in the array"<<endl;
     cin>>n;
     int *arr = new int[n];
     cout<<"Enter the elements of array";
     for(int i=0;i<n;i++){
         cin>>arr[i];
     }
    //  int sum = 10;
    //  int *out = new int[n][2];
     cout<<twoNumberSum(arr,n,10);
    //  for(int i=0;i<size;i++){
    //      cout<<"{"<<out[i][0]<<","<<out[i][1]<<"}"<<endl;
    //  }

     //statements
    //  cout<<size;
     return 0;
 }