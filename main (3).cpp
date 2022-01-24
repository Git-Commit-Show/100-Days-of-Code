#include <iostream>
using namespace std;

struct Node{
  struct Node *prev;
  int data;
  struct Node *next;
}*first=NULL;

void create(int A[], int n){
  struct Node *t,*last;
  first=new Node;
  first->prev=NULL;
  first->data=A[0];
  first->next=NULL;
  last=first;
  for(int i=1;i<n;i++){
    t=new Node;
    t->data=A[i];
    t->next=last->next;
    t->prev=last;
    last->next=t;
    last=t;
  }
}

void Display(struct Node *p){
  while(p!=0){
    cout<<p->data<<" ";
    p=p->next;
  }
  cout<<endl;
}

int Length(struct Node *p){
  int len=0;
  while(p!=0){
    len++;
    p=p->next;
  }
  return len;
}

void Insert(struct Node *p,int pos,int x){
  if(pos<0 && pos<Length(first)){
    return;
  }
  if(pos==0){
    struct Node *t;
    t=new Node;
    t->data=x;
    t->prev=NULL;
    t->next=first;
    first->prev=t;
    first=t;
  }else{
    for(int i=0;i<pos-1;i++){
      p=p->next;
    }
    struct Node *t;
    t=new Node;
    t->data=x;
    t->next=p->next;
    if(p){
      p->next->prev=t;
    }
    t->prev=p;
    p->next=t;
  } 
}
//Here p is a pointer to the frist node.
//It itself is not the first node
int Delete(struct Node *p, int pos){
  int x=-1;
  if(pos<1 ||pos>Length(first)){
    return x;
  }
  if(pos==1){
    first=first->next;
    x=p->data;
    delete p;
    if(first){
      first->prev=NULL;
    }
  }
  else{
    for(int i=0;i<pos-1;i++){
      p=p->next;
    }
    p->prev->next=p->next;
    if(p->next){
      p->next->prev=p->prev;
    }
    x=p->data;
    delete p;
  }
  return x;
}

void Reverse(struct Node *p){
  struct Node *t;
  while(p){
    t=p->next;
    p->next=p->prev;
    p->prev=t;
    p=p->prev;
    if(p!=0 && p->next==NULL){
      first=p;
    }
  }
}

int main() {
  int A[]={5,6,7,8,9};
  create(A,5);
  Insert(first,4,56);
  Insert(first,2,58);
  Insert(first,0,59);
  cout<<"Original LL:"<<endl;
  Display(first);
  cout<<endl;
  cout<<"Length: "<<Length(first)<<endl;
  cout<<"Deleted element : "<<Delete(first,4);
  cout<<endl;
  cout<<"After deletion: "<<endl;
  Display(first);
  cout<<"Reversing a DLL: "<<endl;
  Reverse(first);
  Display(first);
} 