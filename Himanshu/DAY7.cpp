#include <iostream>
#include <climits>
using namespace std;

class Node
{
public:
    int data;
    Node *next;
};
class LinkedList
{
public:
    int cnt = 0;
    ;
    Node *head = new Node(), *last;
    LinkedList(int _first)
    {
        head->data = _first;
        head->next = NULL;
        last = head;
        cnt++;
    };
    void add(int _data)
    {
        Node *t = new Node();
        t->data = _data;
        t->next = NULL;
        last->next = t;
        last = t;
        cnt++;
    };
    void display()
    {
        Node *p = head;
        while (p != NULL)
        {
            cout << p->data << "->";
            p = p->next;
        }
        cout << endl;
    };

    int count()
    {
        return cnt;
    }

    int sum()
    {
        Node *p = head;
        int total = 0;
        while (p != NULL)
        {
            total += p->data;
            p = p->next;
            cnt++;
        }
        return total;
    }
    int max()
    {
        int mx = INT_MIN;
        Node *p = head;
        while (p != NULL)
        {
            if (p->data > mx)
            {
                mx = p->data;
            }
            p = p->next;
        }
        return mx;
    }
    Node *search(int x)
    {
        Node *p = head;
        while (p != NULL)
        {
            if (p->data == x)
            {
                return p;
            }
            p = p->next;
        }
        Node *nf = new Node();
        nf->data = -1;
        nf->next = NULL;
        return nf;
    }
};
int main()
{
    LinkedList l1 = LinkedList(10);
    l1.add(20);
    l1.add(30);
    l1.add(40);
    l1.display();
    cout << "COUNT: " << l1.count() << endl;
    cout << "SUM: " << l1.sum() << endl;
    cout << "MAX_ELEM: " << l1.max() << endl;
}
