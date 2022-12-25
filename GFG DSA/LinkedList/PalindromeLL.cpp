#include "Node.cpp"
void recursiveTraversal(Node *head){
    if(head == NULL)
        return;
    cout<<head->data<<" ";
    recursiveTraversal(head->next);

}
Node *reverseLL(Node *head)
{if(head == NULL || head -> next == NULL)
        return head;
    Node *prev = NULL,*curr = NULL;
    Node *Next = head;
    if(head -> next != NULL){
        curr = head;
        Next = head -> next;
    }
    while(Next != NULL){
        curr -> next = prev;
        prev = curr;
        curr = Next;
        Next = Next -> next;
    }
    curr -> next = prev;
    head = curr;
    return head;

}
bool palindromeLL(Node *head){
    if(head==NULL || head->next == NULL)
       return true;
    Node *slow = head;
    Node *fast = head -> next;
    while(fast != NULL && fast -> next != NULL){
        slow = slow -> next;
        fast = fast -> next -> next;
    }
    Node *tempHead = slow -> next;
    slow -> next = NULL;
    slow = head;
    Node * temp = reverseLL(tempHead);
    temp->printLL(temp);
    cout<<endl;
    recursiveTraversal(slow);

    while(slow != NULL && temp!=NULL ){
        if(temp->data!=slow->data)
            return false;
        slow = slow->next;
        temp = temp->next;
    }
    return true;


}

int main(){
    Node *head = takeInput();
    palindromeLL(head)?cout <<"Yes Palindrome! ":cout << "Not a Palindrome! ";
}