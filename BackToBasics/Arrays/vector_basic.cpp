#include <iostream>
#include <vector>
using namespace std;

int main(){
    // Write your code here
    vector<int> v{1,2,3,4,56,7,89,75};
    vector<int> v1;  // default constructor sets all value of vector container to be zero
    // v1(v.begin()+1,v.end()); // WRONG 
    vector<int> v1 (v.begin()+1,v.end());
    for(auto i:v){
        cout<<i<<" ";
    }
    cout<<endl;
    for(auto i:v1){
        cout<<i<<" ";
    }


    return 0;
}