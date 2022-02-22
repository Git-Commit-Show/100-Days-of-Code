#include <bits/stdc++.h>

using namespace std;

bool is_rotation (string s1, string s2) {
    if (s1.length() != s2.length()) {
        return false;
    }
    else {
        string temp = s1 + s1;
        return (temp.find(s2) != string::npos);
    }
    
    return false;
}

int main() {
    string s1, s2;
    cin >> s1 >> s2;

    bool ans = is_rotation(s1, s2);

    if (ans) {
        cout << "Yes";
    }
    else {
        cout << "No";
    }

    return 0;
}
