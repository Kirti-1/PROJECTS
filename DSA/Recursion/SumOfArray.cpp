#include <iostream>
using namespace std;
int sum(int input[], int n) {
    if(n==0){
        return 0;
    }
    return input[0] + sum(input+1,n-1);

}
int main(){
    int n = 3;
    int input[n] = {9,8,9};
    cout<<sum(input,n);
}
