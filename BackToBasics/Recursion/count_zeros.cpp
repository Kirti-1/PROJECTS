/*
Count Zeros
Send Feedback
Given an integer n, count and return the number of zeros that are present in the given integer using recursion.
Input Format :
Integer n
Output Format :
No. of 0s
Sample Input :
10204
Sample Output
2
*/
#include <iostream>
using namespace std;
int count_zeros(int n)
{
    if (n < 10)
    {
        if (n == 0)
        {
            return 1;
        }
        return 0;
    }
    if (n % 10 == 0)
    {
        return 1 + count_zeros(n / 10);
    }
    return count_zeros(n / 10);
}
int main()
{
    // Write your code here
    int n;
    cin >> n;
    cout << count_zeros(n) << endl;
    return 0;
}