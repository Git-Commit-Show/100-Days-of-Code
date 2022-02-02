#include <iostream>
using namespace std;

struct Node{
  int data;
  struct Node *next;
}*top=NULL;

void push(int x){
  struct Node *t;
  t=new Node;
  if(t==NULL){
    cout<<"Stack is full"<<endl;
  }else{
    t->data=x;
    t->next=top;
    top=t;
  }
}

int pop(){
  struct Node *t;
  int x=-1;
  if(top==NULL){
    cout<<"Stack is empty"<<endl;
    return x;
  }else{
    t=top;
    top=top->next;
    x=t->data;
    delete t;
  }
  return x;
}

void Display(){
  struct Node *t;
  t=top;
  while(t){
    cout<<t->data<<" ";
    t=t->next;
  }
  cout<<endl;
}

int main() {
  cout<<"Pushing the elements into the stack........ "<<endl<<endl;
  push(40);
  push(50);
  push(60);
  push(70);
  push(80);
  cout<<"Displaying the elements: "<<endl;
  Display();
  cout<<"Popping the elements: "<<endl;
  cout<<pop();
  cout<<endl;
  cout<<pop();
  cout<<endl;
  cout<<"Displaying the elements after popping: "<<endl;
  Display();
}