/*
Prorgam to demonstrate passing function as a parameter
syntax:- 

<return_type> name( <return_type> (pointer)(param1,param2))

*/

#include <iostream>
using namespace std;

int add(int x, int y){
    return x+y;
};
int subtract(int x, int y){
    return x-y;
};
int multiply(int x, int y){
    return x*y;
};
int divide(int x, int y){
    return x/y;
};
int calc(int (*ptr)(int,int),int a, int b){
    return (ptr)(a,b);
}
int main()
{
    int a = 20,b=10;
    cout<<"Calculator function parses other functions and gievs the desired output";
    cout<<"\nWe have 2 integers: ";
    cout<<"int a= "<<a<<endl<<"int b= "<<b<<endl;
    cout<<"a+b= "<<calc(add,a,b);
    cout<<"\na-b= "<<calc(subtract,a,b);
    cout<<"\na/b= "<<calc(divide,a,b);
    cout<<"\na*b= "<<calc(multiply,a,b);
    cout<<"\n----------------------------";
    return 0;
}
