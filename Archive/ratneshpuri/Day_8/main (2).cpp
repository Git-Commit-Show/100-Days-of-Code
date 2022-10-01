#include <iostream>
using namespace std;

struct Stack{
  int size;
  int top;
  int *s;
};

void create(struct Stack *st){
  cout<<"Enter the size: "<<endl;
  cin>>st->size;
  st->top=-1;
  st->s=new int[st->size];
}

void Display(struct Stack st){
  while(st.top!=-1){
    cout<<st.s[st.top]<<" ";
    st.top--;
  }
}

void push(struct Stack *st,int element){
  int x=-1;
  if(st->top==st->size-1){
    cout<<"Stack Overflow"<<endl;
    return;
  }else{
    st->top++;
    st->s[st->top]=element;
  }
}

int pop(struct Stack *st){
  int x=-1;
  if(st->top==-1){
    cout<<"Stack Underflow"<<endl;
    return x;
  }else{
    x=st->s[st->top--];
    return x;
  }
}

void isFull(struct Stack st){
  if(st.top==st.size-1){
    cout<<"Stack is Full"<<endl;
    return;
  }else{
    cout<<"Some space is left"<<endl;
    return;
  }
}

void isEmpty(struct Stack st){
  if(st.top==-1){
    cout<<"Stack is Empty"<<endl;
    return;
  }else{
    cout<<"Some element are already inserted"<<endl;
    return;
  }
}

int peek(struct Stack st, int pos){
  int x=-1;
  if(pos<0 && pos>=st.size){
    return x;
  }else{
    x=st.s[st.top-pos+1];
    return x;
  }
}

int main() {
  struct Stack st;
  create(&st);
  push(&st,21);
  push(&st,22);
  push(&st,23);
  push(&st,24);
  push(&st,25);
  Display(st);
  pop(&st);
  pop(&st);
  cout<<endl<<"After pooping some element: "<<endl;
  Display(st);
  cout<<endl;
  cout<<"Peeking function: "<<endl<<peek(st,1);
} 