#include <iostream>
#include <list>
using namespace std;
class myHash{
    int Bucket;
    list<int> *table;
    public:
    myHash(int b){
        Bucket = b;
        table = new list<int>[b];
    }
    void insert(int key){

        table[key%Bucket].push_back(key);

    }
    bool search(int key){
        for(auto i=table[key%Bucket].begin();i!=table[key%Bucket].end();i++){
            if(*i==key){
                return true;
            }
        }
        return false;
    }
    void remove(int key){
        table[key%Bucket].remove(key);


    }
};
int main(){
    myHash hash(7);
    hash.insert(70);
    hash.insert(71);
    hash.insert(56);
    hash.insert(72);
    hash.insert(66);
    hash.insert(63);
    hash.search(76)?cout<<"Present"<<endl:cout<<"Not Present"<<endl;
    hash.search(63)?cout<<"Present"<<endl:cout<<"Not Present"<<endl;
    hash.remove(56);
    hash.search(56)?cout<<"Present"<<endl:cout<<"Not Present"<<endl;
    int c=200;
    // int a,b = 10>20?10,c:20,100;
    // cout<<a<<" "<<b<<" "<<c;

}
// a