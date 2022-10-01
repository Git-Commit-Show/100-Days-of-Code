#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int length_last_str(string str) {
    int count = 0;
    bool flag = false;
    for (int i = str.length() - 1; i > 0; i--)
    {
        if (str.length() == 0)
        {
            return count;
        }
        
        else if ((str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z'))
        {
            flag = true;
            ++count;
        }
        else {
            if (flag == true)
            {
                return count;
            }
        }
    }
    return count;
}

int main()
{
    string str;
    getline(cin, str);

    int length = length_last_str(str);
    cout << length;

    return 0;
}
