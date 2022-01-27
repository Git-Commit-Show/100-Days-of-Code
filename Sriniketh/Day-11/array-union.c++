#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main() {
    int n1, n2;
    cin >> n1 >> n2;

    int a1[n1], a2[n2];
    unordered_map<int, int> map;

    for (int i = 0; i < n1; i++)
    {
        cin >> a1[i];

        map[a1[i]]++;
    }

    for (int i = 0; i < n2; i++)
    {
        cin >> a2[i];

        map[a2[i]]++;
    }

    cout << map.size();

    return 0;
    
}
