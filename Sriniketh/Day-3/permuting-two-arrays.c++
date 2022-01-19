#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int A[1005], B[1005];
int main()
{
    int T;
    scanf("%d", &T);
    while (T--)
    {
        int N, K;
        scanf("%d%d", &N, &K);
        for (int i = 0; i < N; ++i)
            scanf("%d", A + i);
        for (int i = 0; i < N; ++i)
            scanf("%d", B + i);
        sort(A, A + N);
        sort(B, B + N);
        bool ok = 1;
        for (int i = 0; i < N; ++i)
            if (A[i] + B[N - 1 - i] < K)
                ok = 0;
        if (ok)
            printf("YES\n");
        else
            printf("NO\n");
    }

    return 0;
}
