
#include <vector>
class PriorityQueue{
    vector<int> pq;
    public:
    bool isEmpty(){
        return pq.size() == 0;
    }
    int getSize(){
        return pq.size();
    }
    int getMin(){
        if(!isEmpty()){
            return pq[0];
        }
        return 0;
    }
    void insertData(int data){
        if(isEmpty()){
            pq.push_back(data);
            return;
        }
        pq.push_back(data);
        int child = pq.size()-1;

        while(child > 0){
            int Parent = (child-1)/2;
            if(pq[child]<pq[Parent]){
                int temp = pq[child];
                pq[child] = pq[Parent];
                pq[Parent] = temp;
            }else{
                break;
            }
            child = Parent;
        }
    }
    void deleteData(){
        if(isEmpty()){
            return;
        }
        int temp = pq[0];
        pq[0] = pq[pq.size()-1];
        pq[pq.size()-1] = temp;
        pq.pop_back();
        int Parent = 0;

        while(Parent<pq.size()-1){
            int child1 = 2 * Parent + 1, child2 = 2 * Parent + 2;
            if(pq[Parent]>pq[child1] || pq[Parent]>pq[child2]){
                int childIndex = pq[child1]<pq[child2]?child1:child2;
                int temp = pq[Parent];
                pq[Parent] = pq[childIndex];
                pq[childIndex] = temp;
                Parent = childIndex;
            }else {
                break;
            }
        }

    }
    

};