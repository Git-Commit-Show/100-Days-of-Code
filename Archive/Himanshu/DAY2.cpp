/*
Today learnd about recursion, different types of recursion, backtracking and TOWER OF HANOI problem. Whats the point of coding if you are not artistic :)
*/
#include <iostream>
#include <iomanip>
using namespace std;

void tower_of_hanoi(int n, char a, char b, char c)
{
    if (n > 0)
    {
        tower_of_hanoi(n - 1, a, c, b);
        cout << "tower " << n << " from " << a << " to "
             << "tower " << c << endl;
        tower_of_hanoi(n - 1, b, a, c);
    }
}
int main()
{
    int n;
    cout << "        ,*                        .,                         .*" << endl;
    cout << "        ,*                        .,                         .*" << endl;
    cout << "        ,*                        .,                         .*" << endl;
    cout << "        ,*                        .,                         .*" << endl;
    cout << "        ,*                        .,                         .*" << endl;
    cout << "        ,*                        .,                         .*" << endl;
    cout << "        ,*                    /(///****/*                    .*" << endl;
    cout << "        ,*                    //////**//*                    .*" << endl;
    cout << "        ,*                   %%%%%%######                   .*" << endl;
    cout << ".(((((())))))))*          ((((((((())))))))           (((((((((())))))))))  " << endl;
    cout << setw(80) << setfill(' ') << endl;
    cout << setw(40) << setfill(' ') << "Tower of Hanoi" << endl;
    cout << setw(39) << setfill(' ') << "by Himanshu" << endl;
    cout << "Enter number of slabs: ";
    cin >> n;
    cout << setw(80) << setfill(' ') << endl;
    cout << "Follow these steps:- " << endl;
    tower_of_hanoi(n, 'A', 'B', 'C');
    return (0);
}
