#include <iostream>
using namespace std;

struct Node{
  int data;
  Node *next;
}*top=NULL;

void push(int x){
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

int pop(){
  int x=-1;
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

int Eval(char *postfix){
  int x2,x1,r;
  for(int i=0;postfix[i]!='\0';i++){
    if(isOperand(postfix[i])){
      push(postfix[i]-'0');
    }else{
      x2=pop();
      x1=pop();
      switch(postfix[i]){
        case '+':{
          r=x1+x2;
          push(r);
          break;
          }
        case '-':{
          r=x1-x2;
          push(r);
          break;
        }
        case '*':{
          r=x1*x2;
          push(r);
          break;
        }
        case '/':{
          r=x1/x2;
          push(r);
          break;
          }
      }
    }
  }
  return pop();
}
int main() {
  char pos[]="35*62/+4-";
  cout<<"Expression: "<<endl<<pos<<endl<<endl;
  cout<<"Ans: "<<endl;
  cout<<Eval(pos);
}