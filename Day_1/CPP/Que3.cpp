#include <iostream>
using namespace std;
int main()
{
    int num;
    cout << "Enter number ";
    cin >> num;
    int rev = 0;
    while (num > 0)
    {
        int rem = num % 10;
        rev = rev * 10 + rem;
        num = num / 10;
    }
    cout << "Reversed: " << rev;
    return 0;
}