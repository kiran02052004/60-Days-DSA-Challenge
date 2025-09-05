#include <iostream>
using namespace std;
int main()
{
    int num;
    cout << "Enter number ";
    cin >> num;
    int sum = 0;
    while (num > 0)
    {
        int rem = num % 10;
        sum = sum + rem;
        num = num / 10;
    }
    cout << "Sum of Digit is " << sum;
    return 0;
}