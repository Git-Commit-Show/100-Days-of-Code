#include <iostream>
#include<cstring>
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
    struct Node *p;
    p=top;
    top=top->next;
    x=p->data;
    delete p;
  }
  return x;
}

int isOperand(char x){
  if(x=='+' ||x=='-' ||x=='*' ||x=='/'){
    return 0;
  }else{
    return 1;
  }
}

int prec(char x){
   if(x=='+' ||x=='-'){
     return 1;
   }else  if(x=='*' ||x=='/'){
     return 2;
   }
   return 0;
}

char* convert(char *infix){
  char *postfix=new char[strlen(infix)+2];
  int i=0,j=0;
  while(infix[i]!='\0'){
    if(isOperand(infix[i])){
      postfix[j++]=infix[i++];
    }else{
      if(prec(infix[i])>prec(top->data)){
        push(infix[i++]);
      }else{
        postfix[j++]=pop();
      }
    }
  }
  while(top!=NULL){
    postfix[j++]=pop();
  }
  postfix[j]='\0';
  return postfix;
}


// To find the type of a variable use typeid(exp).name()
int main() {
  char infix[]="a+b*c-d/e";
  push('#');
  char *postfix=convert(infix);
  cout<<"** # is used here to avoid error ** "<<endl<<endl;
  cout<<"Infix expression : "<<endl<<infix<<endl<<endl;
  cout<<"Postfix conversion: "<<endl;
  cout<<postfix<<endl;  
  return 0;
}