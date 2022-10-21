#include <iostream>
#include <vector>
using namespace std;

bool isIntersecting(int ironmanPos[], int ultronPos[], int obs1[], int obs2[]) {
    double denominator = ((ironmanPos[0] - ultronPos[0]) * (obs1[1] - obs2[1]))
            - ((ironmanPos[1] - ultronPos[1]) * (obs1[0] - obs2[0]));
    if (denominator == 0)
        return false;

    double t = (((ironmanPos[0] - obs1[0]) * (ironmanPos[1] - ultronPos[1]))
            - ((ironmanPos[1] - obs1[1]) * (ironmanPos[0] - ultronPos[0]))) / denominator;
    double u = (((ironmanPos[0] - obs1[0]) * (obs1[1] - obs2[1]))
            - ((ironmanPos[1] - obs1[1]) * (obs1[0] - obs2[0]))) / denominator;

    if ((t >= 0 && t <= 1) && (u >= 0 && u <= 1))
        return true;
    return false;
}

int main()
{
    int ironmanPos[2];
    cin >> ironmanPos[0] >> ironmanPos[1];
    int res = 0;
    int N;
    cin >> N;
    int** ultrons = new int*[N];
    for (int i = 0; i < N; i++) {
        ultrons[i] = new int[2];
        cin >> ultrons[i][0] >> ultrons[i][1];
    }
    int K;
    cin >> K;
    int** obstacle = new int*[K];
    for (int i = 0; i < K; i++) {
        obstacle[i] = new int[4];
        cin >> obstacle[i][0] >> obstacle[i][1] >> obstacle[i][2] >> obstacle[i][3];
    }
    for (int i = 0; i < N; i++) {
        int hit = 1;
        for (int j = 0; j < K; j++) {
            if (isIntersecting(ironmanPos, ultrons[i], obstacle[j], obstacle[j]+2)) {
                hit = 0;
                break;
            }
        }
        res += hit;
    }
    cout << res << endl;
    for (int i = 0; i < N; i++) {
        delete[] ultrons[i];
    }
    delete[] ultrons;
    for (int i = 0; i < K; i++) {
        delete[] obstacle[i];
    }
    delete[] obstacle;
    return 0;
}