#include <iostream>

using namespace std;

void max_till_i(int a[], int len)
{
    for (int i = 0; i < len; i++)
    {
        int max = 0;
        for (int j = 0; j <= i; j++)
        {
            if (a[j] > max)
            {
                max = a[j];
            }
        }
        cout << "\nmax till " << i << "th index is :" << max << endl;
    }
}
int main()
{
    int a[] = {6, 2, 3, 9, 6, 10, 11, 20, 69, 400, 500, 1000, 3, 10, 1009};
    max_till_i(a, 15);
}
