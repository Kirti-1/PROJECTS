#include <cstring>
#include <iostream>
using namespace std;
void replacePi(char input[],int si,int size){
    if(si>=size-1)
       return;
    if(input[0]=='p' && input[1]=='i'){
        // size = size;
        input[size+2] = '\0';
        int i = size-1;
        for(;i>=si;i--){
            input[i + 2] = input[i];
        }
        input[i-1] = '3';
        input[i] = '.';
        input[i+1] = '1';
        input[i+2] = '4';
        replacePi(input+2,size+2,size);
    }
    replacePi(input+1,si+1,size);
}
void replacePi(char input[]){
    if(input[0]=='\0')
       return;
    replacePi(input,0,strlen(input));
}
int main(){
    char input[] = "xpixpi";
    replacePi(input);
    for(int i=0;input[i]!='\0';i++){
        cout<<input[i];
    }
    return 0;
}