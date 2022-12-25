class PriorityQueue
{
private:
    int *data;
    int size;
    int capacity;
public:
    PriorityQueue(int size){
        data = new int[size];
        
    }
    ~PriorityQueue();
};


