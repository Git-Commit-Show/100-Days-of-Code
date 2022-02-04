#include <iostream>
#include <bits/stdc++.h>

using namespace std;

bool find_3_nos (int arr[], int n, int sum) {
    for (int i = 0; i < n - 2; i++) {
        for (int j = 0; j < n - 1; j++) {
            for (int k = 0; k < n; k++) {
                if (arr[i] + arr[j] + arr[k] == sum) {
                    return true;
                }
            }
        }
    }

    return false;
}

int main () {
    int n;
    cin >> n;

    int arr[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    int sum;
    cin >> sum;

    if (find_3_nos(arr, n, sum)) {
        cout << 1;
    }
    else {
        cout << 0;
    }

    return 0;
}
