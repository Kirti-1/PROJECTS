#include <iostream>
#include <sys/time.h>
using namespace std;
long getTimeinMicroSeconds()
{
    struct timeval start;
    gettimeofday(&start, NULL);
    return start.tv_sec * 1000000 + start.tv_usec;
}
void selectionSort(int arr[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        int min = arr[i];
        int pos = i;
        for (int j = i + 1; j < n; j++)
        {
            if (arr[i] < min)
            {
                min = arr[j];
                pos = j;
            }
            int temp = arr[j];
            arr[j] = min;
            arr[pos] = temp;
        }
    }
}
int main()
{
    // Write your code here
    for (int n = 10; n <= 1000000; n*=10)
    {
        int *arr = new int[n];
        long starttime, endtime;
        for (int i = 0; i < n; i++)
        {
            arr[i] = n - 1;
        }
        starttime = getTimeinMicroSeconds();
        selectionSort(arr, n);
        endtime = getTimeinMicroSeconds();
        cout << "merge Sort n = " << n << "time = " << endtime - starttime << endl;
    }
    return 0;
}