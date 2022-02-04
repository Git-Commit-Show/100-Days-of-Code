#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int minOperation (int arr[], int n) {
    int operations = 0;
    int i = 0;
    int j = n - 1;

    while (i < j) {
        if (arr[i] == arr[j]) {
            i++;
            j--;
        }
        else if (arr[i] < arr[j]) {
            i++;
            arr[i] += arr[i - 1];
            operations++;
        }
        else {
            j--;
            arr[j] += arr[j + 1];
            operations++;
        }
    }

    return operations;
}

int main() {
    int n;

    cin >> n;

    int arr[n];

    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    cout << minOperation(arr, n);

    return 0;
}
