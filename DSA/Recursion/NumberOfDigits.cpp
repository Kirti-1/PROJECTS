#include <iostream>
#include <cmath>
using namespace std;
int numberOfDigits(int num){
    if(num==0)
       return 0;
  return 1 + numberOfDigits(num/10); 
}
int main(){
    int number = 123456;
    cout<<numberOfDigits(number)<<endl;
    cout<<"Using log base 10 function = "<<floor(log10(number)+1);

}