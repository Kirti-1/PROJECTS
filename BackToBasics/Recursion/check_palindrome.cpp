/*
Check Palindrome (recursive)
Check if a given String S is palindrome or not (using recursion). Return true or false.
Input Format :
String S
Output Format :
true or false
Sample Input 1 :
racecar
Sample Output 1:
true
Sample Input 2 :
ninja
Sample Output 2:
false
*/
#include <iostream>
using namespace std;
int length(char *input)
{
    if (input[0] == '\0')
    {
        return 0;
    }
    return 1 + length(input + 1);
}
bool isPalindrome(char *input, int si, int ei)
{
    if (si >= ei)
    {
        return true;
    }
    if (input[si] == input[ei])
    {
        return isPalindrome(input, si + 1, ei - 1);
    }
    return false;
}
bool isPalindrome(char input[])
{
    int len = length(input);
    return isPalindrome(input, 0, len - 1);
}
int main()
{
    // Write your code here
    char input[100];
    cin >> input;
    bool ans = isPalindrome(input);
    cout << (ans ? "It is Palindrome " : "It is not Palindrome ");
    return 0;
}
/* 
Input1: 
abcdfcba
Output1: 
It is not Palindrome 
Input2: 
racecar
Output2:
It is Palindrome
*/