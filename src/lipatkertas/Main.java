package lipatkertas;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[][] res = new int[n][2];

    for (int i = 0; i < n; i++) {
      int p = sc.nextInt();
      int q = sc.nextInt();
      int m = sc.nextInt();

      while (m-- > 0) {
        if (p > q) p /= 2;
        else q /= 2;
      }

      res[i][0] = p > q ? p : q;
      res[i][1] = p > q ? q : p;
    }

    for (

        int i = 0; i < res.length; i++) {
      System.out.println(res[i][0] + " " + res[i][1]);
    }

    sc.close();

  }
}
