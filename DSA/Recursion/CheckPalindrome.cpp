#include <iostream>
#include <cstring>
using namespace std;
bool isPalindrome(char input[], int si, int ei)
{
  if (si >= ei || input[0] == '\0')
    return true;
  if (input[si] != input[ei])
    return false;
  return isPalindrome(input, si + 1, ei - 1);
}
bool isPalindrome(char input[])
{
  if (input[0] == '\0')
    return true;
  return isPalindrome(input, 0, strlen(input) - 1);
}
int main()
{
  char input[] = "abcddcba";
  string value = isPalindrome(input) ? "It is a Palindrome" : "It is not a Palindrome";
  cout << value;
  return 0;
}