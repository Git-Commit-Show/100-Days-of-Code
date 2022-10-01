#include <bits/stdc++.h>

using namespace std;

int main () {
    string s;
    cin >> s;
    int flag = 1;

    for (int i = 0; i < s.length(); i++) {
        if (s[i] != s[s.length() - 1 -i ]) {
            flag = 0;
            break;
        }
    }

    cout << flag;

    return 0;
}
