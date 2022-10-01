
#include <bits/stdc++.h>
using namespace std;

#define mkp make_pair
#define pb push_back
#define scan(x) scanf("%d", &x)
#define ll long long int
#define MOD 1000000007
#define pii pair<int, int>

vector <long double> v;

int main()
{
	ll n, q, i, j;
	long double a, b, c, r;
	cin >> n;
	while (n--) {
	    cin >> a >> b;
	    v.pb(sqrtl(a*a + b*b));
	}
	sort(v.begin(), v.end());
	cin >> q;
	while (q--) {
	    cin >> r;
	    cout << upper_bound(v.begin(), v.end(), r) - v.begin() << endl;
	}
	
	return 0;
}
