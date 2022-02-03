#include <iostream>
using namespace std;

struct Node{
  char data;
  Node *next;
}*top=NULL;

void push(char x){
  Node *t=new Node;
  if(t==NULL){
    cout<<"Stack is full"<<endl;
    return;
  }else{
    t->data=x;
    t->next=top;
    top=t;
  }
}

char pop(){
  char x=-1;
  if(top==NULL){
    cout<<"Stack is empty"<<endl;
    return x;
  }else{
    Node *p;
    p=top;
    top=top->next;
    x=p->data;
    delete p;
  }
  return x;
}

int isBalance(char *exp){
  for(int i=0;exp[i]!='\0';i++){
    if(exp[i]=='(' ||exp[i]=='{' ||exp[i]=='['){
      push(exp[i]);
    }else if(exp[i]==')'||exp[i]=='}' ||exp[i]==']'){
      if(top==NULL){
        cout<<"No match found"<<endl;
        return false;
      }else{
        if( (int(exp[i])==41&&int(top->data)==40) || (int(exp[i])==93&&int(top->data)==91) || (int(exp[i])==125&&int(top->data)==123) )
        pop();
      }
    }
  }
  if(top==NULL){
    cout<<"Balanced"<<endl;
    return 1;
  }else{
    cout<<"Not Balanced"<<endl;
    return 0;
  }
}

int main() {
  char exp[]="{[a+b]*[c+d]}";
  cout<<"The expression is: "<<endl<<exp<<endl<<endl;
  cout<<isBalance(exp);
  //cout<<int(exp[0]);
}