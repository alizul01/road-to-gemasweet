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

    int maxScore = -1;

    for (int i = 0; i < n; i++) {
      int temp = findMaxScore(ruangan, score, i);

      if(temp > maxScore) {
        maxScore = temp;
      }
    }

    System.out.println(maxScore);

    sc.close();
  }

  static int findMaxScore(Hashtable<Integer, ArrayList<Integer>> r, int[] score, int i) {
    int currentScore = score[i];
    ArrayList<Integer> neighbours = r.get(i);
    
    int maxNeighbourScore = 0;
    for(int j = 0; j < neighbours.size(); j++) {
      int neighbourScore = findMaxScore(r, score, neighbours.get(j));

      if(neighbourScore > maxNeighbourScore) {
        maxNeighbourScore = neighbourScore;
      }
    }

    return currentScore + maxNeighbourScore;
  }
}
