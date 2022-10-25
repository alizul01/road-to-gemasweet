#include <iostream>
#include <math.h>
#define ios                       \
    ios_base::sync_with_stdio(0); \
    cin.tie(0);                   \
    cout.tie(0);

using namespace std;

void printNol(int n) {
    if (n < 10) {
        cout << "0000";
    } else if (n < 100) {
        cout << "000";
    } else if (n < 1000) {
        cout << "00";
    } else if (n < 10000) {
        cout << "0";
    }
}

int main()
{
    ios int N, X;

    cin >> N >> X;
    int *arr = new int[N];
    int arrLow[N];
    int counter = 0;
    int lowest = abs(arr[0] - X);

    for (int i = 0; i < N; i++)
    {
        cin >> arr[i];
        int diff = abs(X - arr[i]);
        if (diff <= lowest)
        {
            lowest = diff;
        }
    }
    

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            if (arr[i] < arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    for (int i = 0; i < N; i++)
    {
        int diff = abs(X - arr[i]);
        if (diff == lowest)
        {
            printNol(arr[i]);
            cout << arr[i] << endl;
        }
    }
}