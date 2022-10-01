#include<bits/stdc++.h>

using namespace std;

int main () {
    int n, val;
    cin >> n;

    vector<vector <int>> arr;

    for (int i = 0; i < n; i++) {
        vector<int> temp;
        for (int j = 0; j < n; j++) {
            cin >> val;
            temp.push_back(val);
        }
        arr.push_back(temp);
        temp.clear();
    }

    // Rotate 90 Degrees Matrix: Transpose + Reverse Columns

    // Transpose
    for (int i = 0; i < arr.size(); i++) {
        for (int j = i; j < arr[i].size(); j++) {
            if (i != j) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    // Reverse Rows
    int r = n;
    int c = n;
    
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c/2; j++) {
            int temp = arr[i][j];
            arr[i][j] = arr[i][c - j - 1];
            arr[i][c - j - 1] = temp;
        }
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}
