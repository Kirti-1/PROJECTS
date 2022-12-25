/*1. Dynamic size & rich library functions (erase,find,insert).
2. Easy to know size even inside a function, so no need to pass size.
3.Can be returned from a function.
4. Initialized by some default values.
5. can copy a vector to other, by simply writing v1 = v2, where v1 and v2 are objects of vector class.*/
// #include <iostream>
// #include <vector>
// using namespace std;
// int main(){
//     int val;
//     vector<int> v;
//     do{
//       cin>>val;
//       if(val!=-1)
//         v.push_back(val);
//     }while(val!=-1);
//     // int count = 0;
//     for(auto i = v.begin();i!=v.end();i++){
//         if(*i!=6)
//             cout<<*i<<" ";
//         else
//             v.erase(i);
//         // count ++;
//     }
// }
#include <iostream>
using namespace std;
#include <climits>
int main() {
	// your code goes here
	
	int t;
	cin>>t;
	int n = t;
	int arr[t];
	int maxRevenue = INT_MIN;
	int index = 0;
	while(t--){
	       int n;
	       cin>>n;
	       if(index == 0){
	             arr[0] = n;
	             index++;
	       }else{     arr[index] = n;
		    for(int i=0;i<index;i++){
					  if(arr[i]>n){
						  int temp = arr[i];
						  arr[i] = arr[index];
						  arr[index] = temp;
						  
					  }}
					  index++;
					  

				  }
	              
	       }
	
	for(int i=0;i<n;i++){
	       if(arr[i]*(n-i) > maxRevenue){
	              maxRevenue = arr[i] * (n-i);
	       }
	}
	cout<<maxRevenue;
	return 0;

	
}