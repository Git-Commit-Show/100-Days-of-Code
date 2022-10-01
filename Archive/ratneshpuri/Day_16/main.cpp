#include <iostream>
using namespace std;

class Queue{
  private:
  int size;
  int front;
  int rear;
  int *Q;

  public:
  Queue(){
    front=rear=-1;
    size=5;
    Q=new int[size];
  }

  Queue(int size){
    front=rear=-1;
    this->size=size;
    Q=new int[size];
  }

  void enqueue(int x){
    if(rear==size-1){
      cout<<"Queue is Full"<<endl;
    }else{
      rear++;
      Q[rear]=x;
    }
  }

  int dequeue(){
    int x=-1;
    if(front==rear){
      cout<<"Queue is Empty"<<endl;
    }else{
      x=Q[front+1];
      front++;
    }
    return x;
  }

  void Display(){
    for(int i=front+1; i<=rear;i++){
      cout<<Q[i]<<" ";
    }
    cout<<endl;
  }
};

int main() {
  Queue q;
  cout<<"Inserting elemetns into the queue.... "<<endl<<endl;
  q.enqueue(25);
  q.enqueue(26);
  q.enqueue(27);
  q.enqueue(28);
  cout<<"Displaying the elemetns: "<<endl;
  q.Display();
  cout<<"Dequeuing the elemetn: "<<endl;
  cout<<q.dequeue();
  cout<<endl<<"Again displaying after dequeuing: "<<endl;
  q.Display();
}