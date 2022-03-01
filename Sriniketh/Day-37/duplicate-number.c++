#include <bits/stdc++.h>

using namespace std;

int main () {
    int n, val, d = -1;
    cin >> n;

    vector<int> arr;
    for (int i = 0; i < n + 1; i++) {
        cin >> val;
        arr.push_back(val);
    }

    unordered_map<int,int> map;

    for (int i = 0; i < arr.size(); i++) {
        map[arr[i]]++;
    }

    for (auto x:map) {
        if (x.second > 1)
            d = x.first;
    }

    cout << d;

    return 0;
}
