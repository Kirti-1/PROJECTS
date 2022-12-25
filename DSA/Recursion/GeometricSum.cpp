#include <iomanip>
#include <cmath>
#include <iostream>
using namespace std;
double geometricSum(int k){
    if(k==0)
       return 1;
    double ans = 1/(double)pow(2,k) + geometricSum(k-1);
    return ans;
}
int main()
{   cout<<fixed<<setprecision(5);
    cout<<geometricSum(4)<<endl;
}
