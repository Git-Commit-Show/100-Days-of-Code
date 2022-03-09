#include<bits/stdc++.h>

using namespace std;

int main() {
    int n, val;
    cin >> n;

    vector<int> a;
    for (int i = 0; i < n; i++) {
        cin >> val;
        a.push_back(val);
    }

    next_permutation(a.begin(), a.end());
    for (int i = 0; i < n; i++) {
        cout << a[i] << " ";
    }

    return 0;
}
