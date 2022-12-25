#include <iostream>
using namespace std;
class Complex
{
private:
    int real,img;
public:
    Complex(){
        real = 0;
        img = 0;
    }
    Complex(int real,int img){     // Parametrized Constructor
        this->real = real;
        this->img = img;
    }
    Complex(const Complex &c){          // Copy Contructor
        real = c.real;
        img  = c.img;
    }
    Complex operator +(Complex const &c){
        Complex temp;
        temp.real = real + c.real;
        temp.img = img + c.img;
        return temp;
        // return {real+c.real, img+c.img};
    }
    Complex& operator+=(Complex &c){ // for nesting purpose reference of this was returned 
        real = real + c.real;
        img = img + c.img;
        return *this;
    }
    void showData() const{
        cout<<real<<" "<<img<<endl;
    }
    // Complex operator++(){         // Pre Increment
    //     return {++real,++img};
    // }
    Complex operator++(int){     // Post Increment
        Complex temp(real,img);
        real++;
        img++;
        return temp;
        // return {real++,img++};
    }
    Complex& operator++(){
          real = ++real;
          img =  ++img;
          return *this;
      } // #nested pre-increment 
    friend istream& operator>>(istream &,Complex &);
    friend ostream& operator<<(ostream &, Complex &);
};
ostream& operator<<(ostream &dout, Complex &c){
    dout<<c.real<<" "<<c.img<<" "; // 'dout' is reference of cout 
    return dout;
}
istream& operator>>(istream &din,Complex &c){
    din>>c.real>>c.img;   // 'din' is reference of cin 
    return din; // reference is returned in due to cascading (nested- operator>>(cin,complex_obj))
}

// Caller Object !!!! that's why >> and << operator are overriden using friend function ! concept !
int main(){
    // Write your code here
    // Complex c1 = Complex(4,5);
    // c1.showData();
    // Complex c2 = Complex(6,7);
    // c2.showData();
    // ((c1+=c2)+=c2).showData();
    // c1.showData();
    // c2.showData();
    // operator<<(cout,c1);
    Complex c;
    cin>>c;
    cout<<c;

    /*Complex c3 = *c1 + *c2;
    c3.showData();
    Complex c4 = ++(++*c1);
    c4.showData();
    Complex c5 = (*c2)++; // post increment operator are not nested
    c5.showData();
    c1->showData();
    c2->showData();
    (*c1 + *c2).showData();*/
    return 0;
}