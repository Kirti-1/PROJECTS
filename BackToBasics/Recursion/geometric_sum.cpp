/*
Geometric Sum
Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
Using recursion.
Input Format :
Integer k
Output Format :
Geometric Sum (upto 5 decimal places)
Constraints :
0 <= k <= 1000
Sample Input 1:
3
Sample Output 1:
1.87500
Sample Input 2:
4
Sample Output 2:
1.93750
*/
#include <iostream> //std::fixed
#include <iomanip>  //std::setprecision
#include <cmath>
using namespace std;

double geometricSum(int k)
{
    if (k == 0)
    {
        return 1;
    }
    double ans = 1 / (double)pow(2, k) + geometricSum(k - 1);
    return ans;
}

int main()
{
    // Write your code here
    int k;
    cin >> k;
    cout << std::fixed << std::setprecision(5);
    cout << geometricSum(k) << endl;
    return 0;
}