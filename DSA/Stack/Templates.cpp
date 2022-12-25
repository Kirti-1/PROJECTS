#include <iostream>
using namespace std;
template <typename T,typename Y>
class Pair{
    T x;
    Y y;
    public:
    void setX(T x){
        this -> x = x;
    }
    T getX(){
        return x;
    }
    void setY(Y y){
        this -> y = y;
    }
    Y getY(){
        return y;
    }
};
int main(){
    Pair<Pair<string , string>, int > p1;
    p1.setY(10);
    Pair<string,string> p2;
    p2.setX("Kirti");
    p2.setY("Arora");
    p1.setX(p2);
    cout<<"Name: "<<p1.getX().getX()<<" "<<p1.getX().getY()<<"\nRoll Number: "<<p1.getY();
    return 0; 
}
