#include <bits/stdc++.h>

using namespace std;

int main() {
    int l, m, n;
    cin >> l >> m >> n;

    int arr1[l], arr2[m], arr3[n];
    for (int i = 0; i < l; i++) {
        cin >> arr1[i];
    }

    for (int i = 0; i < m; i++) {
        cin >> arr2[i];
    }

    for (int i = 0; i < n; i++) {
        cin >> arr3[i];
    }

    int prev1, prev2, prev3, i = 0, j = 0, k = 0;

    prev1 = prev2 = prev3 = INT_MIN;

    while (i < l && j < m && k < n) {
        while (arr1[i]== prev1 && i < l) {
            i++;
        }

        while (arr2[j]== prev2 && j < m) {
            j++;
        }

        while (arr3[k]== prev1 && k < n) {
            k++;
        }

        if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
            cout << arr1[i] << " ";
            prev1 = arr1[i];
            prev2 = arr2[j];
            prev3 = arr3[j];
            i++;
            j++;
            k++;
        }

        else if (arr1[i] < arr2[j]) {
            prev1 = arr1[i];
            i++;
        }
        
        else if (arr2[j] < arr3[k]) {
            prev2 = arr2[j];
            j++;
        }

        else {
            prev3 = arr3[k];
            k++;
        }
    }

    return 0;
}
