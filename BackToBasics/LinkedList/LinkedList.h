#include "Node.h"
using namespace std;
class LinkedList
{
public:
    Node *head;
    Node *tail;
    int size;
    LinkedList() : head(NULL), tail(NULL), size(0) {}
    LinkedList(const LinkedList &l) : size(0)
    {
        Node *temp = l.head;
        while (temp != NULL)
        {
            this->add(temp->data);
            temp = temp->next;
        }
    }
    void add(int data)
    {
        Node *newNode = new Node(data);
        if (head == NULL)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail->next = newNode;
            tail = newNode;
        }
        size++;
    }

    void add(int index, int data)
    {
        Node *newNode = new Node(data);
        int count = 0;
        if (index > size)
            return;
        if (index == 0)
        {
            newNode->next = head;
            head = newNode;
            size++;

            return;
        }
        if (index == size)
        {
            tail->next = newNode;
            tail = newNode;
            size++;

            return;
        }
        Node *temp = head;
        while (temp != NULL && count < index - 1)
        {
            temp = temp->next;
            count++;
        }
        if (temp != NULL)
        {
            newNode->next = temp->next;
            temp->next = newNode;
            size++;
        }
    }
    void addLast(int data)
    {
        this->add(size, data);
    }
    void addFirst(int data)
    {
        this->add(0, data);
    }
    void set(int index, int value)
    {
        int count = 0;
        Node *temp = head;
        while (temp != NULL && count <= index - 1)
        {
            temp = temp->next;
            count++;
        }
        if (temp != NULL)
        {
            temp->data = value;
        }
    }
    void removeLast()
    {
        if (head == NULL)
        {
            return;
        }
        Node *temp = head;
        while (temp->next != tail)
        {
            temp = temp->next;
        }
        tail = temp;
        temp = temp->next;
        tail->next = NULL;
        delete temp;
        size--;
    }
    void removeFirst()
    {
        if (head == NULL)
            return;
        Node *temp = head;
        head = head->next;
        temp->next = NULL;
        delete temp;
        size--;
    }
    void remove(int data)
    {
        if (head == NULL)
            return;
        if (head->data == data)
        {
            this->removeFirst();
            return;
        }
        if (tail->data == data)
        {
            this->removeLast();
            return;
        }
        Node *temp = head;
        Node *prev = head;
        while (temp != NULL && temp->data != data)
        {
            prev = temp;
            temp = temp->next;
        }
        if (temp != NULL && temp->data == data)
        {
            prev->next = temp->next;
            temp->next = NULL;
            delete temp;
            size--;
        }
    }
    void print()
    {
        Node *temp = head;
        while (temp != NULL)
        {
            cout << temp->data << " ";
            temp = temp->next;
        }
    }
    int sizeOfLL()
    {
        return size;
    }
    int get(int index)
    {
        if (index >= size)
            return -1;
        int count = 0;
        Node *temp = head;
        while (temp != NULL && count < index)
        {
            temp = temp->next;
            count++;
        }
        return temp->data;
    }
    friend ostream &operator<<(ostream &, LinkedList &);
    friend istream &operator>>(istream &, LinkedList *);
};
ostream &operator<<(ostream &out, LinkedList &l)
{
    Node *temp = l.head;
    while (temp != NULL)
    {
        out << temp->data << " ";
        temp = temp->next;
    }
    return out;
}
istream &operator>>(istream &in, LinkedList &l)
{
    int data;
    in >> data;
    while (data != -1)
    {
        Node *newNode = new Node(data);
        if (l.head == NULL)
        {
            l.head = newNode;
            l.tail = newNode;
        }
        else
        {
            l.tail->next = newNode;
            l.tail = newNode;
        }
        in >> data;
    }
    return in;
}