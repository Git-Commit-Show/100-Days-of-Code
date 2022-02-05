#include <iostream>
using namespace std;

struct Node{
  int data;
  Node *next;
}*front=NULL,*rear=NULL;

void enqueue(int x){
  Node *t=new Node;
  if(t==NULL){
    cout<<"Node is full"<<endl;
  }else{
    t->data=x;
    t->next=NULL;
    if(front==NULL){
      front=rear=t;
    }else{
      rear->next=t;
      rear=t;
    }
  }
}

int dequque(){
  int x=-1;
  Node *p;
  if(front==NULL){
    cout<<"Queue is empty"<<endl;
    return -1;
  }else{
    p=front;
    front=front->next;
    x=p->data;
    delete p;
  }
  return x;
}

void Display(){
  struct Node *p;
  p=front;
  while(p){
    cout<<p->data<<" ";
    p=p->next;
  }
  cout<<endl;
}

int main() {
  cout<<"Inserting elements into Queue......"<<endl;
  enqueue(10);
  enqueue(20);
  enqueue(25);
  enqueue(30);
  enqueue(40);
  enqueue(50);
  cout<<"Elements are: "<<endl;
  Display();
  cout<<"Deleting element from the queue: "<<endl;
  cout<<dequque();
  cout<<endl<<endl<<"Elements after deletion: "<<endl;
  Display();
}