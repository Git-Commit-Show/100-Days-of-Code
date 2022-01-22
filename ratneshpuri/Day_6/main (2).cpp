#include <iostream>
using namespace std;

struct Node{
  int data;
  struct Node *next;
}*first=NULL;

int count(struct Node *p){
  int count=0;
  while(p!=NULL){
    count++;
    p=p->next;
  }
  return count;
}

void Insert(struct Node *p, int pos, int x){
  if(pos<0 && pos>count(p)){
    return;
  }
  struct Node *t;
  t=new Node;
  t->data=x;
  if(pos==0){
    t->next=first;
    first=t;
  }else if(pos>0){
    for(int i=0;i<pos-1 && p;i++){
      p=p->next;
    }
    if(p){
      t->next=p->next;
      p->next=t;
    }
  }
}

void Display(struct Node *p){
  while(p!=NULL){
    cout<<p->data<<" ";
    p=p->next;
  }
}

int Max(struct Node *p){
  long max=INT64_MIN;
  while(p!=NULL){
    if(p->data>max){
      max=p->data;
      p=p->next;
    }else{
      p=p->next;
    }
  }
  return max;
}

struct Node* LinearSearch(struct Node *p, int key){
  while(p!=NULL){
    if(p->data==key){
      return p;
    }else{
      p=p->next;
    }
  }
  return NULL;
}

struct Node* ImprovedLL(struct Node *p, int key){
  struct Node *q;
  q=NULL;
  while(p!=NULL){
    if(p->data==key){
      q->next=p->next;
      p->next=first;
      first=p;
      return p;
    }else{
      q=p;
      p=p->next;
    }
  }
  return NULL;
}

int Sum(struct Node *p){
  int sum=0;
  while(p!=NULL){
    sum+=p->data;
    p=p->next;
  }
  return sum;
}

void InsertSorted(struct Node *p, int x){
  struct Node *q, *t;
  t=new Node;
  t->data=x;
  t->next=NULL;
  q=NULL;
  if(p==NULL){
    p=t;
  }else{
    while(p && p->data<x){
      q=p;
      p=p->next;
    }
    if(p==first){
      t->next=first;
      first=t;
    }else{
      t->next=q->next;
      q->next=t;
    }
  }

}

int main() {
  struct Node *p;
  Insert(first,0,3);
  Insert(first,1,4);
  Insert(first,2,5);
  Insert(first,3,15);
  Insert(first,4,25);
  Insert(first,5,35);
  Display(first);
  InsertSorted(first,1);
  Display(first);
  cout<<endl;
  cout<<"Maximum element is: "<<Max(first)<<endl;
  cout<<"Total count of element is: "<<count(first)<<endl;
  cout<<"Element is at: "<<LinearSearch(first,10)<<endl;
  cout<<"Imporoved Linear Search: "<<ImprovedLL(first,15)<<endl;
  cout<<"Summation of LL: "<<Sum(first)<<endl;
} 