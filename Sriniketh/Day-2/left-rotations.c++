#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
    int n, d;
    cin>>n>>d;
    int arr[n];

    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }

    d = d % n;

    for (int i = d; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }

    for (int i = 0; i < d; i++)
    {
        cout<<arr[i]<<" ";
    }

    return 0;
}
