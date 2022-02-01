#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int find_palindromes_in_sub_string(const string &input, int j, int k)
{
    int count = 0;
    for (; j >= 0 && k < input.length(); --j, ++k)
    {
        if (input[j] != input[k])
        {
            break;
        }
        // cout << input.substr(j, k - j + 1) << endl;
        ++count;
    }
    return count;
}

int find_all_palindrome_substrings(const string &input)
{
    int count = 0;
    for (int i = 0; i < input.length(); ++i)
    {
        count += find_palindromes_in_sub_string(input, i - 1, i + 1);
        count += find_palindromes_in_sub_string(input, i, i + 1);
    }
    return count;
}

int main()
{
    string str;
    getline(cin, str);

    cout << find_all_palindrome_substrings(str);

    return 0;
}
