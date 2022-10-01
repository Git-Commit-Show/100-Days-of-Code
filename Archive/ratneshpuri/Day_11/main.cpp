#include <iostream>
#include <math.h>
using namespace std;

struct Node{
  int coef;
  int expo;
  struct Node *next;
}*poly=NULL;

void create(){
  struct Node *t,*last=NULL;
  cout<<"Enter no. of terms"<<endl;
  int num;
  cin>>num;
  cout<<"Start entring the terms: "<<endl;
  for(int i=0;i<num;i++){
    t=new Node;
    cin>>t->coef>>t->expo;
    t->next=NULL;
    if(poly==NULL){
      poly=last=t;
    }else{
      last->next=t;
      last=t;
    }
  }
}

void Display(struct Node *p){
  cout<<"Expression is: "<<endl;
  while(p){
    cout<<p->coef<<"x"<<p->expo<<"+";
    p=p->next;
  }
  cout<<endl;
}

long evaluate(struct Node *p, int x){
  cout<<"Sum: "<<endl;
  long sum=0;
  while(p){
    sum+=p->coef*pow(x,p->expo);
    p=p->next;
  }
  return sum;
}

int main() {
  create();
  Display(poly);
  cout<<evaluate(poly,1);
}