#include <bits/stdc++.h>

using namespace std;

const int MAX = 100;

int find_median (int mat[][MAX], int n, int m) {
    int min = INT_MAX, max = INT_MIN;
    for (int i = 0; i < n; i++) {
        if (mat[i][0] < min) {
            min = mat[i][0];
        }
        if (mat[i][m - 1] > max) {
            max = mat[i][m - 1];
        }
    }

    int desired = (n * m + 1) / 2;

    while (min < max) {
        int mid = min + (max - min) / 2;
        int place = 0;

        for (int i = 0; i < n; ++i)
            place += upper_bound(mat[i], mat[i] + m, mid) - mat[i];
        if (place < desired)
            min = mid + 1;
        else
            max = mid;
    }

    return min;
}

int main () {
    int n, m;
    cin >> n >> m;

    int mat[n][MAX];

    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            cin >> mat[i][j];

    cout << find_median(mat, n, m);

    return 0;

}
