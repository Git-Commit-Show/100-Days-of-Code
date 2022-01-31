#include <iostream>

using namespace std;

void swap(int &a, int &b)
{
    int temp;
    temp = a;
    a = b;
    b = temp;
};
int main()
{
    int i = 0;
    int j = 10;
    int a[] = {-1, -2, 3, 4, 5, -9, -10, -11, 5, 6, 10};
    while (i < j)
    {
        while (a[i] < 0)
        {
            i++;
        }
        while (a[j] >= 0)
        {
            j--;
        }
        if (i < j)
        {
            swap(a[i], a[j]);
        }
    };
    for (int i = 0; i < 11; i++)
    {
        cout << a[i] << " ";
    }
}
