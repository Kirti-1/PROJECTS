#include "Node.cpp"
using namespace std;
Node *middleOfLL(Node *head){
    Node *slow = head;
    Node *fast = head -> next;
    while(fast!=NULL && fast->next!=NULL){ // interchanging the condition's position is creating problems remember!
        slow = slow -> next;
        fast = fast -> next -> next;
    } 
    return slow;
}
int main(){
    Node *head = takeInput();
    Node *Middle = middleOfLL(head);
    cout << "Middle Node's Data = " << Middle -> data;
}