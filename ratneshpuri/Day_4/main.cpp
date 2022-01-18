#include <iostream>
using namespace std;

class LowerTriangle{
  private:
    int *A;
    int n;
  public:
    LowerTriangle();
    LowerTriangle(int n);
    void Create();
    void Set(int i, int j, int x);
    int Get(int i, int j);
    void Display();
    ~LowerTriangle(){
      delete[] A;
    }
};

LowerTriangle::LowerTriangle(){
  this->n=4;
  A=new int[(n*(n+1))/2];
}

LowerTriangle::LowerTriangle(int n){
  this->n=n;
  A=new int[(n*(n+1))/2];
}

void LowerTriangle::Create(){
  cout<<"Creating Matrix: "<<endl;
  int x;
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
      int index=((i*(i-1))/2)+j-1;
      cin>>x;
      if(i>=j){
        A[index]=x;
      }
    }
  }
}

void LowerTriangle::Set(int i, int j, int x){
  cout<<"Setting Element..."<<endl;
  if(i>=j){
    int index=((i*(i-1))/2)+j-1;
    A[index]=x;
  }
}

int LowerTriangle::Get(int i, int j){
  cout<<"Getting Element: "<<endl;
  if(i>=j){
    int index=((i*(i-1))/2)+j-1;
    return A[index];
  }else{
    return 0;
  }
}

void LowerTriangle::Display(){
  cout<<"New Matrix: "<<endl;
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
      if(i>=j){
        cout<<A[((i*(i-1))/2)+j-1]<<" ";
      }else if(i<j){
        cout<<A[((j*(j-1))/2)+i-1]<<" ";
      }
    }
    cout<<endl;
  }
}
int main() {
  LowerTriangle LT(4);
  LT.Create();
  LT.Display();
  LT.Set(2,1,99);
  LT.Display();
  cout<<LT.Get(1,1);
  return 0;
} 