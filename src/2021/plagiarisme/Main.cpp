#include <iostream>
#include <bits/stdc++.h>
#include <cmath>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;

    int score[n][m];
    int time[n][m];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> score[i][j];
        }
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> time[i][j];
        }
    }

    int max = INT_MIN;
    int tempI = -1;
    int tempJ = -1;

    bool checked[n][n];
    cout << checked[0][0] << endl;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == j) {
                continue;
            }


            for (int k = 0; k < m; k++) {
                int diff = abs(score[i][k] - score[j][k]) + (abs(time[i][k] - time[j][k]));

                if (diff > max) {
                    max = diff;
                    tempI = i;
                    tempJ = j;
                }
            }
        }
    }
    cout << max + abs(tempI - tempJ) << endl;
}