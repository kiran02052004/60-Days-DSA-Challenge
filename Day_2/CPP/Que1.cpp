#include <iostream>
using namespace std;

int main()
{
    int a, b, c;
    cout << "Enter three numbers: ";
    cin >> a >> b >> c;

    int greatest;
    if (a >= b && a >= c)
        greatest = a;
    else if (b >= a && b >= c)
        greatest = b;
    else
        greatest = c;

    cout << "Greatest number is: " << greatest << endl;
    return 0;
}