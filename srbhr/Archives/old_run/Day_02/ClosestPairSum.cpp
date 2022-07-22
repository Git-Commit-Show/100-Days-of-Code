#include <bits/stdc++.h>
using namespace std;

pair<int, int> closestSum(vector<int> arr, int x)
{
    // your code goes here
    int len = arr.size();
    int resLeft, resRight;
    int l = 0;
    int r = len - 1;
    int diff = INT_MAX;
    while (l < r)
    {
        if (abs(arr[l] + arr[r] - x) < diff)
        {
            resLeft = arr[l];
            resRight = arr[r];
            diff = abs(arr[l] + arr[r] - x);
        }
        // move the right  pointer left if the sum is larger than x
        if (abs(arr[l] + arr[r]) > x)
        {
            r--;
        }
        else // move the left  pointer right if the sum is less than x
        {
            l++;
        }
    }
    return {resLeft, resRight};
}