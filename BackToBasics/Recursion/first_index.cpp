#include <iostream>
using namespace std;
int first_index_beg(int *arr, int size, int x)
{
    if (size == 0)
    {
        return -1;
    }
    if (arr[0] == x)
    {
        return 0;
    }
    int ans = first_index_beg(arr + 1, size - 1, x);
    if (ans == -1)
    {
        return ans;
    }
    return ans + 1;
}
int first_index_end(int *arr, int size, int x)
{
    if (size == 0)
    {
        return -1;
    }
    int ans = first_index_end(arr, size - 1, x);
    if (ans == -1)
    {
        if (arr[size - 1] == x)
        {
            return size - 1;
        }
        return ans;
    }
    return ans;
}

int main()
{
    // Write your code here
    int n, x;
    cin >> n;
    int *arr = new int[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    cin >> x;
    int first1 = first_index_beg(arr, n, x);
    int first2 = first_index_beg(arr, n, x);

    cout << first1 << endl;
    cout << first2 << endl;

    delete[] arr;
    return 0;
}