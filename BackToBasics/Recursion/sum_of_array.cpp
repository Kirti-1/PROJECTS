/*
Sum of Array
Given an array of length n, you need to find and return the sum of all the elements of the array.
do this recursively.
Input Format: 
Line 1: an integer n i.e. size of the array
Line 2: n integer which are the elements of the array, separated by spaces.
Output Format: 
Sum 
Constraints :
1 <= n <= 10^3
Sample Input :
3
9 8 9
Sample Output : 
26 
*/

// #include <iostream>

#include <iostream>
#include <vector>
using namespace std;
int sum(int *arr, int size)
{
    if (size == 1)
    {
        return arr[0];
    }
    // int smallerSum = sum(arr,size-1);
    // return smallerSum + arr[size-1];
    int smallerSum = sum(arr + 1, size - 1);
    return arr[0] + smallerSum;
}
using namespace std;
int main()
{
    // Write your code here
    int n;
    cin >> n;
    int *arr = new int[n];
    for (int i = 0; i < n; i++)
    {
        int value;
        cin >> value;
        arr[i] = value;
    }
    int sum1 = sum(arr, n);
    cout << sum1 << endl;
    int sum2 = 0;
    for (size_t i = 0; i < n; i++)
    {
        sum2 += arr[i];
    }
    cout << sum2;

    return 0;
}