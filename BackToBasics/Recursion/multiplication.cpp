/*
Multiplication (Recursive)
##Given two integers M & N, calculate and return their multiplication using recursion.
You can use subtraction and addition for your calculation. No other operators are allowed.
Input Format:
Line 1: Integer M
Line 2: Integer N
Output Format:
M * N
Contstraints:
0 <= M <= 1000
0 <= N <= 1000
Sample Input 1:
3
5
Sample Output 1:
12
Sample Input 2:
4
0
sample Output 2:
0
*/
#include <iostream>
using namespace std;
int multiplication(int a, int b)
{
    if (a == 0 || b == 0)
    {
        return 0;
    }
    if (a < b)
    {
        return b + multiplication(a - 1, b);
    }
    return a + multiplication(a, b - 1);
}
int main()
{
    // Write your code here
    int a, b;
    cin >> a >> b;
    int ans = multiplication(a, b);
    cout << ans;
    return 0;
}