#include <iostream>
#include <math.h>

using namespace std;
int main()
{
    int n;
    cin >> n;
    
    for (int m = 0; m < n; m++) {
        if (m < 4) {
            if (m == 2) {
                cout << m << " ";
            }
            else if (m == 3) {
                cout << m << " ";
            }
        }
        for (int n = 2; n * n <= m; n++) {
                if (m % n == 0)
                    break;
                else if (n + 1 > sqrt(m)) {
                    cout << m << " ";
                }
            }
        }
    return 0;
}