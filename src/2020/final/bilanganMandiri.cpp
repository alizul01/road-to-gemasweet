#include <bits/stdc++.h>
using namespace std;
#define ios                       \
    ios_base::sync_with_stdio(0); \
    cin.tie(0);                   \
    cout.tie(0);
#define pb push_back

int solve(int A, int B)
{
    bool res[B];
    for (int i = A; i <= B; i++) {
        res[i] = true;
    }
    int ans = 0;
    for (int i = A; i <= B; i++) {
        for (int j = 2; j <= A; j++) {
            if (i % j == 0)
                res[i] = false;
        }
    }

    for (int i = A; i <= B; i++) {
        if (res[i] == true)
            ans++;
    }
    return ans;
}

int main()
{
    ios int N;
    cin >> N;
    vector<pair<int, int>> arr[N];

    for (int i = 0; i < N; i++)
    {
        int A, B;
        cin >> A >> B;
        arr[i].push_back(make_pair(A, B));
    }

    for (int i = 0; i < N; i++)
    {
        for (auto x = arr[i].begin(); x != arr[i].end(); x++)
        {
            cout << solve (x -> first, x -> second) << endl;
        }
    }
}