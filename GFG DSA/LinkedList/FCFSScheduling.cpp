#include "iostream"
using namespace std;
void waitingTime(int p[],int n,int bT[],int wT[]){
    wT[0] = 0;
    for (int  i = 1; i < n ; i++ ) 
        wT[i] =  bT[i-1] + wT[i-1];
    
}
void turnAroundTime(int p[],int n,int bT[],int wT[],int tat[]){
    for (int  i = 0; i < n ; i++) 
        tat[i] = bT[i] + wT[i]; 

}
void averageTime(int p[],int n,int bT[]){
   int wT[n],totalTurnAroundTime[n],totalWT=0,totaltat=0;
   waitingTime(p,n,bT,wT);
   turnAroundTime(p,n,bT,wT,totalTurnAroundTime);
   cout << "Processes  "<< " Burst time  "
         << " Waiting time  " << " Turn around time\n"; 
         for (int  i=0; i<n; i++) 
    { 
        totalWT = totalWT + wT[i]; 
        totaltat = totaltat + totalTurnAroundTime[i]; 
        cout << "   " << i+1 << "\t\t" << bT[i] <<"\t    "
            << wT[i] <<"\t\t  " << totalTurnAroundTime[i] <<endl; 
    }
    cout << "Average waiting time = " 
         << (float)totalWT / (float)n; 
    cout << "\nAverage turn around time = " 
         << (float)totaltat / (float)n;


}
int main(){
    int process[5] = {1,2,3,4,5};
    int burstTime[5] = {6,3,8,3,4};
    // Arrival Time is considered to be zero.
    averageTime(process,5,burstTime);
}