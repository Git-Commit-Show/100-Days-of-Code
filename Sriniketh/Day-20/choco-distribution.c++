#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;

    int arr[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int m;
    cin >> m;

    int min_diff = INT_MAX;

    if (n == 0 || m == 0) {
        cout << 0;
        goto end;
    }
        
    sort (arr, arr + n);

    for (int i = 0; i + m - 1; i++) {
        int diff = arr[i + m - 1] - arr[i];
        if (diff < min_diff) {
            min_diff = diff;
        }
    }
    cout << min_diff;

end:    return 0;
}
