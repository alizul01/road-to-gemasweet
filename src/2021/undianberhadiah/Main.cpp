#include <iostream>
#include <math.h>
#define ios ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

using namespace std;

int main() {
    ios
    int N, X;

    cin >> N >> X;
    int *arr = new int[N];
    int arrLow[N];
    int counter = 0;

    for (int i = 0; i < N; i++) {
        cin >> arr[i];
    }

    int lowest = abs(arr[0] - X);

    for (int i = 0; i < N; i++) {
        int diff = abs(X - arr[i]);
        if (diff <= lowest) {
            lowest = diff;
        }
    }

    for (int i = 0; i < N; i++) {
        int diff = abs(X - arr[i]);
        if (diff == lowest) {
            arrLow[counter++] = arr[i];
        }
    }

    for (int i = 0; i < counter; i++) {
        for (int j = 0; j < counter; j++) {
            if (arrLow[i] < arrLow[j]) {
                int temp = arrLow[i];
                arrLow[i] = arrLow[j];
                arrLow[j] = temp;
            }
        }
    }

    for (int i = 0; i < counter; i++) {
        cout << arrLow[i] << endl;
    }
}