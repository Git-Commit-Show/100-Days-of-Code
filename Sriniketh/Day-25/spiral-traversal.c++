#include<iostream>
#include <bits/stdc++.h>
using namespace std;

int main () {
    int n;
    cin >> n;

    int a[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> a[i][j];
        }
    }

    int dir = 0, top = 0, bottom = n - 1, left = 0, right = n - 1;

    while (top <= bottom && left <= right) {
        if (dir == 0) {
            for (int i = left; i <= right; i++) {
                cout << a[top][i] << " ";
            }
            top += 1;
        }
        else if (dir == 1) {
            for (int i = top; i <= bottom; i++) {
                cout << a[i][right] << " ";
            }
            right -= 1;
        }
        else if (dir == 2) {
            for (int i = right; i >= left; i--) {
                cout << a[bottom][i] << " ";
            }
            bottom -= 1;
        }
        else {
            for (int i = bottom; i >= top; i--) {
                cout << a[i][left] << " ";
            }
            left += 1;
        }

        dir = (dir + 1) %4;
    }

    return 0;
}
