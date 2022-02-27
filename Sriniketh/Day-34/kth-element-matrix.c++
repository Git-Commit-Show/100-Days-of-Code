#include <bits/stdc++.h>

using namespace std;

int main () {
    int n, k;
    cin >> n >> k;

    int arr[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> arr[i][j];
        }
    }

    vector <int> m;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            m.push_back(arr[i][j]);
        }
    }

    sort(m.begin(), m.end());

    cout << m[k - 1];

    return 0;
}
