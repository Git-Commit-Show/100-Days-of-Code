// #include <iostream>
// #include <set>
// #include <climits>

// using namespace std;

// int main() {
//     int n;
//     cin >> n;

//     int arr[n];
//     for (int i = 0; i < n; i++)
//     {
//         cin >> arr[i];
//     }

//     set<int> a;
//     for (int i = 0; i < n; i++) {
//         a.insert(arr[i]);
//     }

//     cout << arr;

//     int ans = INT_MIN;
//     for (int i = 0; i < n; i++) {
//         if (a.find(arr[i] - 1) == a.end()) {
//             int j = arr[i] + 1;
//             while (a.find(j) != a.end()) {
//                 j++;
//             }
//             ans = max(ans, j - arr[j]);
//         }
//         // cout << ans << "\n";
//     }
//     cout << ans;

//     return 0;
// }

#include <bits/stdc++.h>
using namespace std;

int findLongestConseqSubseq(int arr[], int N)
{
    set<int> a;
    for (int i = 0; i < N; i++)
        a.insert(arr[i]);
    int ans = INT_MIN;

    for (int i = 0; i < N; i++)
    {
        if (a.find(arr[i] - 1) == a.end())
        {
            int j = arr[i] + 1;
            while (a.find(j) != a.end())
                j++;

            ans = max(ans, j - arr[i]);
        }
    }
    return ans;
}

int main()
{
    int n;
    cin >> n;
    
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    int ans = findLongestConseqSubseq(arr, n);
    cout << ans;

    return 0;
}
