/*
Sum of digits (Recursive)
Write a recursive function that returns the sum of the digits of a given integer.
Input Format :
Integer N
Output format :
Sum of Digits of N
Constraints :
0 <= N <= 10^9
Sample Input 1:
12345
Sample Output 1:
15
Sample Input 2:
9
Sample Output 2:
9

*/
#include <iostream>
using namespace std;
int sumOfDigits(int n){
    if(n<10){
        return n;
    }return n%10 + sumOfDigits(n/10);
}
int main(){
    // Write your code here
    int n;
    cin>>n;
    int ans = sumOfDigits(n);
    cout<<ans<<endl;
    return 0;
}