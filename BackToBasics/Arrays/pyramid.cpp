#include <iostream>
using namespace std;

int main(){
    // Write your code here
    int n;
    cin>>n;
    /*************Pyramid *************/
  for(int i=1;i<=n;i++){
        for(int space=n-i;space>0;space--) cout<<" ";
        // int j=1;
        // for(;j<i;j++) cout<<j;
        // for(;j>=1;j--)cout<<j;
        // cout<<endl;
        for(int j=1;j<i;j++) cout<<j;
        for(int j=i;j>0;j--) cout<<j;
        cout<<endl;
    } 
    for(int i=1;i<=n;i++){
        for(int space=n-i;space>0;space--) cout<<" ";
        // int j=1;
        // for(;j<i;j++) cout<<j;
        // for(;j>=1;j--)cout<<j;
        // cout<<endl;
        for(int j=1;j<i;j++) cout<<(char)(64+j);
        for(int j=i;j>0;j--) cout<<(char)(64+j);
        cout<<endl;
    }

    for(int i=1;i<=n;i++){
        for(int space=n-i;space>0;space--) cout<<" ";
        // int j=1;
        // for(;j<i;j++) cout<<j;
        // for(;j>=1;j--)cout<<j;
        // cout<<endl;
        for(int j=1;j<i;j++) cout<<(char)(96+j);
        for(int j=i;j>0;j--) cout<<(char)(96+j);
        cout<<endl;
    }
    /*************Pyramid 2*************/

    for(int i=n;i>0;i--){
        for(int space=n-i;space>0;space--) cout<<" ";
        // int j=1;
        // for(;j<i;j++) cout<<j;
        // for(;j>=1;j--)cout<<j;
        // cout<<endl;
        for(int j=i;j>=1;j--) cout<<j;
        for(int j=2;j<=i;j++) cout<<j;
        cout<<endl;
    }
    return 0;
}