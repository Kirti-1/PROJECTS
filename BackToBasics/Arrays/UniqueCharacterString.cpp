/*        **************************************
Ramu has an array of strings. He wants to find a string s such that it is a concatination of sub-sequence of given array and have unique characters. Since, he has just started coding so he needs your help.
A sub-sequence of an array is a set of elements that acn be obtained by deleting some elements(possibly none) from the array and keeping the order same.
Print the maximum possible length of s.
Input Format - 
Th first line of input contains an integer n- the length of arrat. Next n lines contains the element(strings) of the array.
Constraints - 
1<=n<=18, 1<= arr[i].length<=26
Output Format -
Print one integer - the maximum length of s.
Sample Input -
3
ab
cd
ab
Sample Output - 
4
        *****************************************
*/
#include <string>
#include <iostream>
using namespace std;
int uniqueCharString(string *arrStr,int n,int i){
    uniqueCharString(arrStr,n,i);

}
int uniqueCharString(string *arrStr,int n){
    return uniqueCharString(arrStr,n,0);


}
int main(){
    int n;
    cin>>n;
    string *arrOfStr = new string[n];
    for(int i=0;i<n;i++){
        cin>>arrOfStr[i];
    }


    return 0;
}
