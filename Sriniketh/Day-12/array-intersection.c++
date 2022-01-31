#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main() {
    int n1, n2;
    cin >> n1 >> n2;

    int a1[n1], a2[n2];
    
    for (int i = 0; i < n1; i++)
    {
        cin >> a1[i];
    }

    for (int i = 0; i < n2; i++)
    {
        cin >> a2[i];
    }

    int i = 0, j = 0;

    while (i < n1 && j < n2)
    {
        if (a1[i] < a2[j])
        {
            i++;
        }
        else if (a1[i] > a2[j])
        {
            j++;
        }
        else {
            cout << a1[i] << " ";
            i++;
            j++;
        }
    }

    return 0;
}
