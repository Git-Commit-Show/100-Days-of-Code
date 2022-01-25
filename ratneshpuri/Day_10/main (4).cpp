#include <iostream>
using namespace std;

struct Node{
    int data;
    struct Node *next;
}*first=NULL;

void create(int A[], int n){
    struct Node *t, *last;
    first=new Node;
    first->data=A[0];
    first->next=NULL;
    last=first;
    for(int i=1;i<n;i++){
        t=new Node;
        t->data=A[i];
        t->next=NULL;
        last->next=t;
        last=t;
    }
}

void Display(struct Node *p){
    while(p){
        cout<<p->data<<" ";
        p=p->next;
    }
}

int count(struct Node *p){
    int len=0;
    while(p){
        len++;
        p=p->next;
    }
    return len;
}
//Method 1 using Length to find the middle
int Middle(struct Node *p){
    int i;
    int ans=-1;
    int n=int(count(first)/2);
    for(int i=0;i<n;i++){
        p=p->next;
    }
    ans=p->data;
    return ans;
}

//Method 2 using two pointer to find the middlw in one scan
int Middle2(struct Node *p){
    struct Node *q;
    q=p;
    while(q){
        q=q->next;
        if(q){
            q=q->next;
        }
        if(q){
            p=p->next;
        }
    }
    return p->data;
}

int main()
{
    int A[]={1,2,3,4,5};
    create(A,5);
    Display(first);
    cout<<endl;
    cout<<"Length: "<<count(first);
    cout<<endl;
    cout<<"Middle element: "<< Middle(first);
    cout<<endl;
    cout<<"Middle using 2 pointer method: "<<Middle2(first);
    return 0;
}