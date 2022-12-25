// import java.util.Scanner;
class Main {

    /*static*/ class MyStack {
        int []stack;
        int capacity;
        int idx;
        MyStack(){
            
        }
        MyStack(int capacity){
            this.capacity = capacity;   
            stack = new int[capacity];
            idx = -1;
        }
        public int size(){
            return stack.length;
        }
        public void push(int data){
            if(idx == capacity){
                // deep copy
                return;
            }else{
                idx = idx + 1;
                stack[idx] = data;
            }
        }
        public int pop() {
            if(idx == -1){
                return -1;
            }else{
                int ele = stack[idx];
                stack[idx] = 0; // not required 
                idx = idx-1;
                return ele;
            }
        }
        public void peek(){
            if(idx == -1){
                return;
            }
            System.out.println(stack[idx]);
            // doesn't do any modification to the stack
        }
        public boolean isEmpty(){
            return idx == -1;
        }
        public void display() {
            for(int i=0;i<=idx;i++){
                System.out.println(stack[i]);
            }
        }
    }
    public static void main(String[] args) {
        /*
        // Main.MyStack st = new Main.MyStack(5); // if MyStack class is declared as static 
        MyStack st = new MyStack(5);
        st.push(13);
        st.push(11);
        st.push(12);
        st.push(14);
        st.pop();
        st.peek();
        st.pop();
        st.pop();
        System.out.println(st.isEmpty());
        st.display();
        */
        // If MyStack class is non static
        Main m = new Main();
        MyStack st = m.new MyStack(5);
        st.push(13);
        st.push(11);
        st.push(12);
        st.push(14);
        st.pop();
        st.peek();
        st.pop();
        st.pop();
        System.out.println(st.isEmpty());
        st.display();
        

        
    }
}