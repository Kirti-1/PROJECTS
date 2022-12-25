#include <iostream>
using namespace std;
int main(){
    // int one = 'a'/'a';
    // char ch = '^';
    // int co=0;
    // // string s = "..........";
    // for(char c=ch;c<='d';c++){
    //     co+=1;
    //     cout<<c<<" ";}
    //     cout << endl << co << endl;
    int k (2); //Constructor inistialization
    int *s = new int(5);
    int *s1 = new int[5]();    // int s1[5] = {0};
    cout<<k<<" "<<*s<<endl;
    for(int i=0;i<5;i++){
        cout<<s1[i]<< " ";
    }
    return 0;
}