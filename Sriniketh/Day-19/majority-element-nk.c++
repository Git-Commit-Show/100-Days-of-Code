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

    int k;
    cin >> k;

    int base = n / k, count = 0, i = 0;

    sort(arr, arr + n);

    while (i < n) {
        for (int j = 0; j < n; j++) {
            if (arr[i] == arr[j]) {
                count ++;
            }
        }
        if (count > base) {
            cout << arr[i] << "\n";
        }
        i += count;
        count = 0;
    }

    return 0;
}
