#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <climits>

using namespace std;


int main() {
    int n;
    cin >> n;

    int a[n], sum = 0, result = INT_MIN;

    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    

    for  (int i = 0; i < n; i++) {
        sum += a[i];
        
        if (sum < a[i]) {
            sum = a[i];
        }
        if (result < sum) {
            result = sum;
        }
    }
    cout << result;
    
    return 0;
}
