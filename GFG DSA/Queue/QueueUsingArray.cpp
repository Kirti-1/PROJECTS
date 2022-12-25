
class Queue{
    int *data;
    int front,capacity,size;
    // int rear; 
    public:
    Queue(int capacity){
        data = new int[capacity];
        this -> capacity = capacity;
        size = 0;
        front = 0;
        // rear = 0; 
    }
    int sizeOf(){
        return size;
    }
    bool isEmpty(){
        return size == 0;
    }
    bool isFull(){
        return size == capacity;
    }
    int getFront(){
        if(isEmpty())
            return -1;
        return front;
    }
    int getRear(){
        if(isEmpty())
            return -1;
        return (front+size-1)%capacity;
    }
    void enqueue(int val){
        // if(size == capacity)
        //     return;
        if(isFull())
            return; 
        int rear = getRear();
        rear = (rear+1)%capacity;
        data[rear] = val;
        size ++;
    }
    int dequeue(){
        if(isEmpty())
            return -1;
        int ans = data[front];
        front = front + 1;
        size--;
        return ans;
    }

};