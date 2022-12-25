#include <iostream>
using namespace std;
/***********    Friend Function accessing multiple classes data members ***********/

class B;
class A{
  int a;
  public:
    A(int a){
        this->a = a;
    }
    friend void friendOfclassAandB(A, B);
};
class B{
    int b;
    public:
      B(int b){
          this->b = b;
      }
      friend void friendOfclassAandB(A, B);
};
void friendOfclassAandB(A Aobj, B Bobj){
    cout<< "Friend to both class A and B and it's not a member function to both the classes but it can access the private members of both the class"<<endl;
    cout<< "The sum of A's a and B's b = " << Aobj.a + Bobj.b <<endl;
}
/************ Overloading operators as a Friend Function ***************/
 
class Complex{
    int real,img;
    public:
      Complex(){
        real = 0;
        img = 0;
      }
      Complex(int real, int img){
          this->real = real;
          this->img = img;
      }
      void setData(int real, int img){
          this->real = real;
          this->img = img;
      }
      void showData() const{ // qualifies as constant member function
      // #rule : for read only purpose and not write
          cout<<"real = " << real << " img = " << img <<endl;
      }
      Complex(const Complex &c) {
          real = c.real;
          img = c.img;
      }
      Complex operator+(Complex const &c){ 
        // caller function meaning is, c3 = c1.operator+(c2);
        //   Complex temp;
        //   temp.real = real + c.real;
        //   temp.img = img + c.img;
        //   return temp;
        //   return *(new Complex(real+c.real, img+c.img));
        return {real+c.real,img+c.img};
      }
      Complex operator*(Complex const &c){
          return *(new Complex((real*c.real+(img*c.img*(-1))), (real*c.img+(img*c.real))));
      }
      friend bool operator==(Complex const &c1, Complex const &c2);
      friend Complex operator+(Complex const &, Complex const &);
      friend Complex operator-(Complex const &);
      friend Complex operator++(Complex &,int);
      friend Complex operator++(Complex &);
      friend Complex operator--(Complex &,int);
      friend Complex operator--(Complex &);

};
Complex operator++(Complex &c1,int){ // post increment
    return {c1.real++,c1.img++}; 
}
Complex operator++(Complex &c1){ // pre increment
    return {++c1.real,++c1.img}; 
}
Complex operator--(Complex &c1,int){ // post decrement
    return {c1.real--,c1.img--}; 
}
Complex operator--(Complex &c1){ // pre decrement
    return {--c1.real,--c1.img}; 
}
bool operator==(Complex const &c1, Complex const &c2){
    return c1.real == c2.real && c1.img == c2.img;
}
Complex operator+(Complex const &c1, Complex const &c2) {
    Complex temp;
    temp.real = c1.real+c2.real;
    temp.img =  c1.img+c2.img;
    return temp;   
}  
Complex operator-(Complex const &c){
    Complex temp;
    temp.real = -c.real;
    temp.img = -c.img;
    return temp;
}
// caller function's meaning got changed, 
// when we define it as a friend function of complex class
// c3 = operator+(c1,c2);
// friend function's called without help of object,
// as it is not a member function of a class it's a friend to the class.

/*member function of a class and friend of another class*/
class One{
    public:
    void display(){
        cout<<" Hello ";
    }
    void fun(){
        cout<<" Fun ";
    }
    void fun2(){
       cout<<" Fun Again yeaaaaa....  ";
    }
};
class Second{
    /*
    friend void One::display();
    friend void One::fun();
    friend void One::fun2();
    */
    friend class One; // instead of above three since you're friending all of them 
    friend void Complex::setData(int,int);
    // Scope resolution operator resolves the scope to which class's member function we're friending

};



int main(){
    // Write your code here
    /*A objA(10);
    B objB(20);
    friendOfclassAandB(objA,objB);
    Complex c1;
    c1.setData(4,5);
    const Complex c2 = c1;
    // c2.setData(5,6);
    c2.showData(); // showData needs to be a const function
    // Complex c3 = operator+(c1,c2);
    Complex c4 = c1.operator+(c2);
    // Complex c5 = c1 + c2; // Compiler is confused which function to run 
    c3.showData();
    c4.showData();
    c4 = -c2; // c1 = operator-(c);
    c4.showData(); 
    c3.showData();
    c2.showData();
    c4 = c3 * c2;
    cout << ((c1 == c2)? "Equal ": "Not Equal " ) << endl;
    c4.showData();*/
    Complex c1(5,6);
    Complex c2 = c1++; // 5 6, 6 7 
    Complex c3 = ++c1; // 7 8, 7 8 operator++(c1); friend function
    c1.showData();  // 7 8
    c2.showData(); // 5 6 
    c3.showData(); // 7 8 
    c2 = c1--;   // 7 8, 6 7
    c3 = --c1;  // 5 6, 5 6
    c1.showData();  //  5 6
    c2.showData();  // 7 8
    c3.showData();  // 5 6
    c1++.showData();
    // (++c1).showData();
    Complex c4 = c1.operator+(c2);
    cout<< "c4 = ";
    c4.showData();
    return 0;
}

// Friend to both class A and B and it's not a member function to both the classes but it can access the private members of both the class
// The sum of A's a and B's b = 30
// real = 4 img = 5
// real = 8 img = 10
// real = 8 img = 10
// real = -4 img = -5
// real = 8 img = 10
// real = 4 img = 5
// Not Equal
// real = -18 img = 80