#include <iostream>
using namespace std;
int main()
{
    int num;
    cout << "Enter number: ";
    cin >> num;
    bool isPrime = true;
    for (int i = 2; i < num / 2; i++)
    {
        if (num % i == 0)
        {
            isPrime = false;
            break;
        }
    }
    if (isPrime)
    {
        cout << "Prime";
    }
    else
    {
        cout << "Not prime";
    }

    return 0;
}