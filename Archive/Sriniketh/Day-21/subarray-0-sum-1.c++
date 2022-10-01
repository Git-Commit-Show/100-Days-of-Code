#include <iostream>
#include <bits/stdc++.h>

using namespace std;

bool subarray_sum_0_1(int arr[], int n)
{
    unordered_set<int> set;

    int sum = 0;

    for (int i = 0; i < n; i++)
    {
        sum += arr[i];

        if (sum == 0 || set.find(sum) != set.end())
            return true;

        set.insert(sum);
    }

    return false;
}

int main()
{
    int n;
    cin >> n;

    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    if (subarray_sum_0_1(arr, n))
    {
        cout << "Yes";
    }
    else
    {
        cout << "No";
    }

    return 0;
}
