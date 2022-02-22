#include<bits/stdc++.h>

using namespace std;

void next_permutation (vector<int> &arr, int n) {
    if (n == 1) {
        return;
    }

    int lastInc = -1, i = 1;
    while (i < n) {
        if (arr[i] > arr[i - 1])
            lastInc = i;
        i++;
    }

    if (lastInc == -1) {
        for (int i = 0; i < n / 2; ++i) {
            swap(arr[i], arr[n - i - 1]);
        }
        return;
    }

    // int value = arr[lastInc];
    int index = lastInc;
    for (int i = 0; i < n; i++) {
        if (arr[i] > arr[lastInc - 1] and arr[i] < arr[index]) {
            index = i;
        }
    }

    swap(arr[lastInc - 1], arr[index]);
    sort(arr.begin() + lastInc, arr.end());

}

int main () {
    int n, val;
    cin >> n;

    vector<int> arr;

    for (int i = 0; i < n; i++) {
        cin >> val;
        arr.push_back(val);
    }

    next_permutation (arr, n);

    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }

    return 0;
}
