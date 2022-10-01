#include<bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;

    int arr[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int max_ending_here = 0, max_so_far = INT_MIN;
    for (int i = 0; i < n; i++) {
        if (arr[i] <= max_ending_here + arr[i]) {
            max_ending_here += arr[i];
        }
        else {
            max_ending_here = arr[i];
        }
        if (max_ending_here > max_so_far)
            max_so_far = max_ending_here;
    }
    if (max_so_far < 0)
        cout << "Invalid Input";
    else
        cout << max_so_far;

    return 0;
}
