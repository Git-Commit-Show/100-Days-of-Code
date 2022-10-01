#include <bits/stdc++.h>

using namespace std;

string count_say(int n) {
    if (n == 1) return "1";
    if (n == 2) return "11";

    string s = "11";
    for (int i = 3; i <= n; i++) {
        string t = "";
        s = s + "&";
        int c = 1;
        for (int j = 1; j < s.length(); j++) {
            if (s[j] != s[j - 1]) {
                t = t + to_string(c);
                t = t + s[j - 1];
                c = 1;
            }
            else {
                c++;
            }
        }
        s = t;
    }

    return s;
}

int main() {
    int n;
    cin >> n;

    cout << count_say(n);

    return 0;
}
