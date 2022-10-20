#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    int max = a[0];
    for (int i = 0; i < n; i++)
    {
        if (a[i] > max)
        {
            max = a[i];
        }
    }
    int min = a[0];
    for (int i = 0; i < n; i++)
    {
        if (a[i] < min)
        {
            min = a[i];
        }
    }
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] == max)
        {
            count++;
        }
    }
    int count2 = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i] == min)
        {
            count2++;
        }
    }
    if (max == min)
    {
        cout << 0 << endl;
    }
    else
    {
        cout << max - min << " " << count * count2 << endl;
    }
    return 0;
}