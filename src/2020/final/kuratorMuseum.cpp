#include <bits/stdc++.h>
using namespace std;
#define ios                       \
    ios_base::sync_with_stdio(0); \
    cin.tie(0);                   \
    cout.tie(0);
#define pb push_back

int main() {
    int n, diff = INT_MIN;
    cin >> n;

    vector <int> arr;
    vector <int> copyArr;
    for (int i = 0; i < n; i++) {
        int a;
        cin >> a;
        arr.pb(a);
        copyArr.pb(a * -1);
    }

    bool setFound[arr.size()];
    sort(copyArr.begin(), copyArr.end());
    // print copyArr
    for (int i = 0; i < copyArr.size(); i++) {
        int diff = 0;
        for (int j = 0; j < arr.size(); j++) {
            
        }
    }
    
    // for (int i = 0; i < copyArr.size(); i++) {
    //     for (int j = 0; j < copyArr.size(); j++) {

    //     }
    // }
}