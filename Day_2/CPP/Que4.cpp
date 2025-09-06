#include <iostream>
using namespace std;

int main()
{
    int n, m;
    cout << "Enter n and m: ";
    cin >> n >> m;

    if (n == 0)
    {
        cout << 0 << endl;
        return 0;
    }
    int a = 0, b = 1, fib;
    for (int i = 2; i <= n; ++i)
    {
        fib = (a + b) % m;
        a = b;
        b = fib;
    }
    cout << "Fibonacci number F" << n << " modulo " << m << " is: " << b % m << endl;
    return 0;
}