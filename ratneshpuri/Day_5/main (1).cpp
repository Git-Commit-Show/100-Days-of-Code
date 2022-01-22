#include <iostream>
#include<math.h>
using namespace std;

struct Term{
  int coef;
  int expo;
};

struct Polynomial{
  int num;
  struct Term *T;
};

void Create(struct Polynomial *P){
  cout<<"Enter the number of terms: "<<endl;
  cin>>P->num;
  P->T=new Term[P->num];
  cout<<"Enter the terms: "<<endl;
  for(int i=0;i<P->num;i++){
    cin>>P->T[i].coef>>P->T[i].expo;
  }
  cout<<"You entered: "<<endl;
  int sum=0;
  for(int i=0;i<P->num;i++){
    cout<<P->T[i].coef<<"x"<<P->T[i].expo<<"+ ";
  }
}

int sum(struct Polynomial P){
  int x;
  cout<<"Enter the value of x: "<<endl;
  cin>>x;
  int sum=0;
  for(int i=0;i<P.num;i++){
    sum+=P.T[i].coef*pow(x,P.T[i].expo);
  }
  cout<<"Sum is : ";
  return sum;
  
}
int main() {
  struct Polynomial P;
  Create(&P);
  cout<<endl;
  cout<<sum(P)<<endl;
  return 0;
} 