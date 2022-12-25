#include <iostream>
#include <string>
using namespace std;
void removeX(char *str)
{
    if (str[0] == '\0')
    {
        return;
    }
    if (str[0] == 'x')
    {
        int i = 1;
        for (; str[i] != '\0'; i++)
        {
            str[i - 1] = str[i];
        }
        str[i - 1] = '\0';
        removeX(str); // length is reduced above
    }
    else
    {
        removeX(str + 1);
    }
}

int main()
{
    // Write your code here
    char str[] = "xxabxzxc";
    removeX(str);
    cout << str << endl;
    return 0;
}