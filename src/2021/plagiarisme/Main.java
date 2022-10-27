import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
      FastReader s = new FastReader();
  
      int n = s.nextInt();
      int m = s.nextInt();
  
      int[][] score = new int[n][m];
      int[][] time = new int[n][m];
  
      for (int i = 0; i < score.length; i++) {
        for (int j = 0; j < score[i].length; j++) {
          score[i][j] = s.nextInt();
        }
      }
  
      for (int i = 0; i < time.length; i++) {
        for (int j = 0; j < time[i].length; j++) {
          time[i][j] = s.nextInt();
        }
      }
  
      int max = Integer.MIN_VALUE;
      int tempI = -1;
      int tempJ = -1;
  
      boolean[][] checked = new boolean[n][n];
  
      for (int i = 0; i < score.length; i++) {
        for (int j = 0; j < score.length; j++) {
          if (i == j || checked[i][j] || checked[j][i]) continue;
  
          checked[i][j] = true;
          checked[j][i] = true;
  
          for (int k = 0; k < score[i].length; k++) {
            int dif = Math.abs(score[i][k] - score[j][k]) + Math.abs(time[i][k] - time[j][k]);
  
            if(dif > max) {
              max = dif;
              tempI = i;
              tempJ = j;
            }
          }
        }
      }
  
      System.out.println(max + Math.abs(tempI - tempJ));
    }
  }
  

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            if (st.hasMoreTokens()) {
                str = st.nextToken("\n");
            } else {
                str = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}