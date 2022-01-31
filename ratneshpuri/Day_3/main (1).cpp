#include <iostream>
using namespace std;

class Diagnol{
  private:
    int n;
    int *A;

  public:
    Diagnol();
    Diagnol(int n);
    void create();
    void Set(int i, int j, int x);
    int Get(int i, int j);
    void Display();
    ~Diagnol(){
      delete [] A;
    }
};

Diagnol::Diagnol(){
  this->n=5;
  A=new int[n];
}

Diagnol::Diagnol(int n){
  this->n=n;
  A=new int[n];
}

void Diagnol::create(){
  int x;
  cout<<"Start creating the Matrix: "<<endl;
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
      cin>>x;
      if(i==j){
        A[i-1]=x;        
      }
    }
  }
}

void Diagnol::Set(int i, int j, int x){
  cout<<"Setting new value: "<<endl;
  if(i==j){
    A[i-1]=x;
  }
}

int Diagnol::Get(int i, int j){
  cout<<"Your Element: "<<endl;
  if(i==j){
    return A[i-1];
  }else{
    return 0;
  }
}

void Diagnol::Display(){
  cout<<"New Matrix is: "<<endl;
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
      if(i==j){
        cout<<A[i-1]<<" ";
      }else{
        cout<<"0"<<" ";
      }
    }
    cout<<endl;
  }
}

int main() {
  Diagnol D;
  D.create();
  D.Display();
  D.Set(1,1,9);
  D.Display();
  return 0;
}
