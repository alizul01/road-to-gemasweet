#include <iostream>
#include <bits/stdc++.h>
using namespace std;

long long fpb(long long a, long long b)
{
    if (b == 0)
    {
        return a;
    }
    else
    {
        return fpb(b, a % b);
    }
}

int main()
{

    long long a, b, c, d;

    cin >> a >> b >> c >> d;

    long long x = (a * d) + (b * c);
    long long y = b * d;
    long long z = __gcd(x, y);
    cout << x / z << " " << y / z << endl;
    return 0;
}