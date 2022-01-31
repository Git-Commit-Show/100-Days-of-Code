#include <iostream>
#include <string.h>
using namespace std;

// void perm(char s[], int k)
// {
//     static int size = strlen(s);
//     static char *result = new char[size];
//     static int *reference_array = new int[size];
//     if (s[k] == '\0')
//     {
//         result[k] = '\0';
//         cout << "Permutation: " << string(result) << endl;
//     }
//     else
//     {
//         for (int i = 0; s[i] != '\0'; i++)
//         {
//             if (reference_array[i] == 0)
//             {
//                 result[k] = s[i];
//                 reference_array[i] = 1;
//                 perm(s, k + 1);
//                 reference_array[i] = 0;
//             }
//         }
//     }
// }

struct term
{
    int exp;
    int coeff;
    /* data */
};
struct polynomial
{
    int n;
    term *terms;
};
int main()
{
    int n;
    struct polynomial p;
    cout << "Enter number of terms: ";
    cin >> n;
    p.n = n;
    p.terms = new term[p.n];
    for (int i = 0; i < n; i++)
    {
        int _exp, _coeff;
        cout << "\nEnter the term power: ";
        cin >> _exp;
        cout << "\nEnter coefficient: ";
        cin >> _coeff;
        p.terms[i].coeff = _coeff;
        p.terms[i].exp = _exp;
    }
    for (int i = 0; i < n; i++)
    {
        cout << p.terms[i].coeff << "x^" << p.terms[i].exp;
        if (i != int(n - 1))
        {
            cout << " + ";
        }
    }
    return 0;
}
