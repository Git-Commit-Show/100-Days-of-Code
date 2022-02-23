#include <bits/stdc++.h>

using namespace std;

int m;

int search (int arr[][m], int n, int m, int key) {
    int i = 0; j = m - 1;
    while (i < n and j >= 0) {
        if (arr[i][j] == key) {
            return 1;
        }
        if (arr[i][j] > key) {
            j--;
        }
        else {
            i--;
        }
    }
    
    return -1;
}

int main () {
    int n, m, key;
    cin >> n >> m;

    int arr[n][m];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> arr[i][j];
        }
    }

    cin >> key;

    cout << search(arr, n, m, key);

    return 0;
}
