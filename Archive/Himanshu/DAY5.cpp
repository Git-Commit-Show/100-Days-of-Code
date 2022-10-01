#include <iostream>
using namespace std;


void duplicates(char s[], int len)
{
    char *hsh = new char[26];
    for (int i = 0; i < len; i++)
    {
        if (int(s[i]) < 90)
        {
            int id = int(s[i]) - 64;
            hsh[id]++;
        }
        else
        {
            int id = int(s[i]) - 96;
            hsh[id]++;
        }
    }
    for (int i = 0; i < 26; i++)
    {
        if (hsh[i] != 0)
        {
            int ch = i + 64;
            int times = hsh[i];
            cout << char(ch) << "repeated " << times << " times" << endl;
        }
    }
}
int main()
{
    char name[] = "BRAHMAJEET";
    duplicates(name, 10);
}
