package jalurhartakarun;

import java.util.*;

public class Tio {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Hashtable<Integer, ArrayList<Integer>> ruangan = new Hashtable<Integer, ArrayList<Integer>>();

    int n = sc.nextInt();
    int k = sc.nextInt();
    int max = -1;

    int score[] = new int[n];

    for (int i = 0; i < n; i++) {
      score[i] = sc.nextInt();
      ruangan.put(i, new ArrayList<>());
    }

    for (int i = 0; i < k; i++) {
      ruangan.get(sc.nextInt()).add(sc.nextInt());
  }

    // loop every node, traverse every possible path, find max score for every path using DFS
    for (int i = 0; i < n; i++) {
      int maxScore = 0;
      Stack<Integer> stack = new Stack<>();
      boolean[] visited = new boolean[n];
      
      stack.push(i);
      visited[i] = true;

      while (!stack.isEmpty()) {
        int node = stack.pop();
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

    System.out.println(max);

    sc.close();
  }
}
