#include <iostream>
using namespace std;

class Node{
  public:
    int data;
    Node *next;
};

class Stack{
  private:
    Node *top;

  public:
    Stack(){top=NULL;}
    void push(int x);
    int pop();
    void Display();
};

void Stack::push(int x){
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

int Stack::pop(){
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

void Stack::Display(){
  struct Node *t;
  t=top;
  while(t){
    cout<<t->data<<" ";
    t=t->next;
  }
  cout<<endl;
}

int main() {
  Stack stk;
  cout<<"Pushing the elements into the stack........"<<endl<<endl;
  stk.push(40);
  stk.push(50);
  stk.push(60);
  stk.push(70);
  stk.push(80);
  cout<<"Displaying the elements: "<<endl;
  stk.Display();
  
}