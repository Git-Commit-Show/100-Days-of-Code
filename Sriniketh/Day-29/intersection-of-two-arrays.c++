#include<bits/stdc++.h>

using namespace std;

int main () {
    long int m, n;
    cin >> m >> n;

    vector<int> arr1, arr2, ans;
    long int val;

    for (int i = 0; i < m; i++) {
        cin >> val;
        arr1.push_back(val);
    }

    for (int i = 0; i < n; i++) {
        cin >> val;
        arr2.push_back(val);
    }

    // Code to Remove Duplicates in an Array - Not Required Here
    // vector<int>::iterator ip;
    // ip = std::unique(arr1.begin(), arr1.begin() + m);
    // arr1.resize(std::distance(arr1.begin(), ip));

    // ip = std::unique(arr2.begin(), arr2.begin() + m);
    // arr2.resize(std::distance(arr2.begin(), ip));

    long int i = 0, j = 0;
    m = arr1.size();
    n = arr2.size();

    while (i < m and j < n) {
        if (arr1[i] < arr2[j]) {
            i++;
        }
        else if (arr1[i] > arr2[j]) {
            j++;
        }
        else {
            ans.push_back(arr1[i]);
            i++;
            j++;
        }
    }

    if (ans.size() == 0) {
        cout << -1;
    }
    else {
        for (int i = 0; i < ans.size(); i++) {
            cout << ans[i] << " ";
        }
    }

    return 0;
}
