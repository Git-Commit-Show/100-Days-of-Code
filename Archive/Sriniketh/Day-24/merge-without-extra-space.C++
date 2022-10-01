#include <iostream>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

void nextPermutation(vector<int> &nums)
{
    int infpt = 0;
    int n = nums.size() - 1;

    for (int i = n; i > 0; i--)
    {
        if (nums[i] > nums[i - 1])
        {
            infpt = i;
            break;
        }
    }

    if (infpt == 0)
    {
        sort(nums.begin(), nums.end());
    }
    else
    {
        int toswap = nums[infpt - 1];
        int min = INT_MAX;

        for (int j = infpt; j <= n; j++)
        {
            if (nums[j] - toswap > 0 && nums[j] - toswap < min)
            {
                int temp = nums[j];
                nums[j] = nums[infpt - 1];
                nums[infpt - 1] temp;
            }
        }
        sort(nums.begin() + infpt, nums.end());
    }
}

int main () {
    int n;
    cin >> n;

    vector<int> a;
    for (int i = 0; i < n; i++)
    {
        cin>>temp;
        a[i].push_back(temp);
    }
    
    next_permutation(a);

    for (int i = 0; i < a.size(); i++)
    {
        cout << a[i] << " ";
    }

    return 0;
}
