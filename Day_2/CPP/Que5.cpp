#include <iostream>
#include <vector>
using namespace std;

int main()
{
    int n;
    cout << "Enter number of elements: ";
    cin >> n;
    vector<int> arr(n);

    cout << "Enter array elements: ";
    for (int i = 0; i < n; ++i)
        cin >> arr[i];

    if (n < 2)
    {
        cout << "Insufficient Array";
        return 0;
    }

    int max1 = arr[0], max2 = arr[0];
    for (int i = 0; i < n; ++i)
    {
        if (arr[i] > max1)
        {
            max2 = max1;
            max1 = arr[i];
        }
        else if (arr[i] > max2 && arr[i] != max1)
        {
            max2 = arr[i];
        }
    }

    cout << "Second maximum is: " << max2 << endl;

    return 0;
}