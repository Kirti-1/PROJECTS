#include <iostream>
#include <sys/time.h>
using namespace std;
long getTimeinMicroSeconds()
{
    struct timeval start;
    gettimeofday(&start, NULL);
    return start.tv_sec * 1000000 + start.tv_usec;
}
void merge(int arr[], int start, int mid, int end)
{
    int temp[end - start + 1];
    int i = start;
    int j = mid + 1;
    int k = 0;
    while (i <= mid && j <= end)
    {
        if (arr[i] > arr[j])
        {
            temp[k++] = arr[i++];
        }
        else
        {
            temp[k++] = arr[j++];
        }
    }
    if (i <= mid)
    {
        while (i <= mid)
        {
            temp[k++] = arr[i++];
        }
    }
    else if (j <= end)
    {
        while (j <= end)
        {
            temp[k++] = arr[j--];
        }
    }
    k = 0;
    for (int i = start; i < end; i++)
    {
        arr[i] = temp[k++];
    }
}
void mergesort(int arr[], int start, int end)
{
    if (start >= end)
    {
        return;
    }
    int mid = (end + start) / 2;
    mergesort(arr, start, mid);
    mergesort(arr, mid + 1, end);
    merge(arr, start, mid, end);
}
int main()
{
    // Write your code here
    for (int n = 10; n <= 1000000; n *= 10)
    {
        int *arr = new int[n];
        long starttime, endtime;
        for (int i = 0; i < n; i++)
        {
            arr[i] = n - 1;
        }
        starttime = getTimeinMicroSeconds();
        mergesort(arr, 0, n - 1);
        endtime = getTimeinMicroSeconds();
        cout << "merge Sort n = " << n << "time = " << endtime - starttime << endl;
    }
    return 0;
}// different result at every time 
// it is all about the time given by your processor because there are alot of other functions running behind the scene
 