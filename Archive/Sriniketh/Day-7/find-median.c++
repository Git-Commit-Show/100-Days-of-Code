#include <iostream>

using namespace std;

void swap(int *x, int *y) {
    int temp = *x;
    *x = *y;
    *y = temp;
}

void bubbleSort(int a[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (a[j] > a[j + 1]) {
                swap(&a[j], &a[j + 1]);
            }
            
        }
    }
}

float findMedian (int a[], int n) {
    int median_value = 0;
    if (n % 2 != 0) {
        median_value = a[n / 2];
        return median_value;
    }
    else {
        median_value = ((a[n / 2]) + a[(n / 2) + 1]) / 2;
        return median_value;
    }
}

int main() {
    int n;
    cin >> n;
    
    int a[n];
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    
    bubbleSort(a, n);

    float ans = findMedian(a, n);
    cout << ans;
}
