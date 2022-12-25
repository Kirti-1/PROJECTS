#include <iostream>
using namespace std;
#include "Student.cpp"
int main(){
    Student s1; //Student is a user defined data type
    //Static allocation (Stack allocation)
    // s1.age = 20;
    // s1.rollNumber = 10;
    Student *s2 = new Student;
    // s2->age = 20;
    // s2->rollNumber = 11;
    // //Dynamic allocation using new (Heap allocation)
    // //pointer to the class allocated at heap
    // cout<<s1.age<<" "<<s1.rollNumber<<endl;
    // cout <<s2->age<< " " << s2->rollNumber<<endl;
    // (*s2).age = 21; //another way of initializing 
    // cout <<s2->age<< " " << s2->rollNumber;
    s1.display(20,10);
    s2->display(20,11); // or (*s2).display();
    Student *s3 = new Student;
    s2->display(20,13); 
      
}