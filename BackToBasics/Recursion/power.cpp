/*
Power
Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.
Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Constraints :
1 <= x <= 30
0 <= n <= 30
Sample Input 1 :
 3 4
Sample Output 1 :
81
Sample Input 2 :
 2 5
Sample Output 2 :
32
*/
#include <iostream>
#include <string>
#include <cmath>
using namespace std;
/**************** MEMOIZATION ************************/

/*double power(int a,int b,double *ans){
    if(a==1 || b==0){
        return 1;
    }
    if(ans[b] != -1){
        return ans[b];
    }
    ans[b/2] = power(a,b/2,ans);
    if(b%2==0){
        ans[b] = ans[b/2] * ans[b/2];
    }else{
        ans[b] =  a * ans[b/2] * ans[b/2];
    }
    return ans[b];

}*/

/*************** RECURSIVE SOLUTION ***********************/

int power(int a, int b)
{
    if (a == 1 || b == 0)
    {
        return 1;
    }
    int smaller_part = power(a, b / 2) * power(a, b / 2);
    if (b % 2 == 0)
    {
        return smaller_part;
    }
    else
    {
        return a * smaller_part;
    }
}

int main()
{
    // Write your code here
    int a, b;
    cin >> a >> b;
    /*double *arr = new double[b+1];
    for(int i=0;i<=b;i++){
        arr[i] = -1;
    }
    double ans = power(a,b,arr);*/
    int ans = power(a, b);
    cout << ans << endl;
    cout << pow(a, b) << endl;

    return 0;
}