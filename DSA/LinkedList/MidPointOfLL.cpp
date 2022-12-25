Node *midPointOfLL(Node *head){
    Node *slow = head;
    Node *fast = head->next;
    while(fast!=NULL && fast->next!=NULL){
        slow = slow -> next;
        fast = fast->next->next;
    }
    return slow;
}