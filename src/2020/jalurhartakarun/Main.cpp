#include <bits/stdc++.h>
using namespace std;

int main() {
  int n, k;
  cin >> n >> k;
  int max = -1;

  int score[n];

  for (int i = 0; i < n; i++) {
    cin >> score[i];
  }

  for (int i = 0; i < k; i++) {
    int from, to;
    cin >> from >> to;
  }

  // loop every node, traverse every possible path, find max score for every path using DFS
  for (int i = 0; i < n; i++) {
    int maxScore = 0;
    stack<int> stack;
    bool visited[n];
    
    stack.push(i);
    visited[i] = true;

    while (!stack.empty()) {
      int node = stack.top();
      stack.pop();
      maxScore += score[node];

      for (int j = 0; j < ruangan.get(node).size(); j++) {
        int nextNode = ruangan.get(node).get(j);
        if (!visited[nextNode]) {
          stack.push(nextNode);
          visited[nextNode] = true;
        }
      }
    }

    if (maxScore > max) {
      max = maxScore;
    }
  }

  cout << max;

  return 0;
}