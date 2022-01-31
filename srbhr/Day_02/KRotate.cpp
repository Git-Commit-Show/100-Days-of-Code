#include <bits/stdc++.h>
using namespace std;

vector<int> kRotate(vector<int> a, int k)
{
    // your code  goes here
    vector<int> v;
    int len = a.size();
    k = k % len;
    for (int i = 0; i < len; i++)
    {
        if (i < k)
        {
            v.push_back(a[n + i - k]);
        }
        else
        {
            v.push_back(a[i - k]);
        }
    }
    return v;
}