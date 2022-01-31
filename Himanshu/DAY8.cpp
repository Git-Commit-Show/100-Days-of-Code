#include <iostream>
#include <climits>
using namespace std;

class Stack
{
private:
    int top = 0;
    int size;
    int *arr;

public:
    Stack(int size)
    {
        // Constructor
        this->arr = new int[size];
        cout << "Stack initialized" << endl;
    };

    void add(int element)
    {
        // adds an element in stack
        if (this->top == int(this->size - 1))
        {
            cout << "STACK OVERFLOW!" << endl;
        }
        else
        {
            this->arr[top] = element;
            top++;
            cout << "Added" << endl;
        };
    }

    void show()
    {
        for (int i = 0; i < this->top; i++)
        {
            cout << this->arr[i] << " ";
        }
    }
};
int main()
{
    Stack *s1 = new Stack(10);
    s1->add(10);
    s1->add(20);
    s1->show();
}
