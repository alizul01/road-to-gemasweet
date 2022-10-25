#include <bits/stdc++.h>
using namespace std;

int main() {
	string input;
	cin >> input;
	string ans = "";
	int lengthAns = input.length();

	if (lengthAns == 1) {
		ans = "satuan";
	} else if (lengthAns == 2) {
		ans = "puluhan";
	} else if (lengthAns == 3) {
		ans = "ratusan";
	} else if (lengthAns == 4) {
		ans = "ribuan";
	} else if (lengthAns == 5) {
		ans = "puluhribuan";
	}

	cout << ans << endl;
}