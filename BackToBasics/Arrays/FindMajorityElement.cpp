/*                  **************************************
 You have given an array A of size N.
 Find all the elements which appear more than floor(N/3) times in the given array.
 Condition - 
 Time complexity - O(N)
 Space Complexity - O(1)
 First line contains N -> No. of elements in the array
 Second line has N integers denoting the elements of the array A i.e. A1,A2,A3.....AN.
 Constraints - 
 1<=N<=10^7 
 0<=Ai<=10^9
 Output Format - 
 Print a single line containing all the majority elements occuring more than floor(N/3) times.
 If there is no majority element hen just print "No Majority Elements".
 Sample Input - 
 8 
 2 2 3 1 3 2 1 1
 Sample Output - 
 1 2
 */
#include <iostream>
#include <vector>
using namespace std;
void majorityElement(vector<int> v)
{
    int element1 = v[0];
    int count1 = 1;
    int element2 = 0;
    int count2 = 0;
    for (auto x = v.begin(); x != v.end(); x++)
    { // x acts as a pointer here
        if (element1 == *x)
        {
            count1++;
        }
        else if (count1 == 0)
        {
            element1 = *x;
            count1 = 1;
        }
        else if (element2 == *x)
        {
            count2++;
        }
        else if (count2 == 0)
        {
            element2 = *x;
            count2 = 1;
        }
        else
        {
            count1--;
            count2--;
        }
    }
    count1 = count2 = 0;
    for (int i = 0; i < v.size(); i++)
    {
        if (v[i] == element1)
        {
            count1++;
        }
        else if (v[i] == element2)
        {
            count2++;
        }
    }
    if (count1 > v.size() / 3)
        cout << element1 << endl;
    if (count2 > v.size() / 3)
        cout << element2 << endl;
}
int main()
{
    // int arr[] = {5,5,0,7,5,1,5}; //5,5,5,5 - occuring more than n/2 times.
    int N;
    vector<int> v;
    cin >> N;
    for (int i = 0; i < N; i++)
    {
        int val;
        cin >> val;
        v.push_back(val);
    }
    // vector<int> v{5,5,0,7,5,0,5,0,23,0,5,6,5,0};
    majorityElement(v);
    return 0;
}