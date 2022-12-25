#include <iostream>
using namespace std;
class Student {
private:
int rollNumber;
int age;
public:

void display(int age,int rollNumber ){
    cout<<age<<" "<<rollNumber<<endl;
}
//destructor deallocates the memory of the object
//same name as class with tilde in front
// no return type
// no input arguments
//called at the end when the scope of the object is over main is over
// student s3 = s2; copy constructor rather than copy assignment operator

};
 