#include <iostream>
using namespace std;
#include <vector>
int main(){
    // Write your code here
    int n = 11;
    for (int i = n - 1; i >= 0; i--)
    {
        cout<<i<<" ";
    }
    for (int i = 0; i < n; i++)
    {
        cout<<i<<" ";
    }
    vector<int> v = {1,2,3,4,5,6,7,8,9,10};
    for (auto &&i : v)
    {
        cout<<i<<" ";
    }   
    
    
    return 0;
}