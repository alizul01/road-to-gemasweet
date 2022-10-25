import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int N = sc.nextInt();
        int m[] = new int[N];

        for (int i = 0; i < N; i++) {
            m[i] = sc.nextInt();
        }

        int[][] arah = {
                { 1, 0 }, // timur
                { 0, 1 }, // utara
                { -1, 0 }, // barat
                { 0, -1 } // selatan
        };

        for (int i = 0; i < N; i++) {
            int a = 0;
            int x = 0, y = 0;
            int curr = 1;

            for (int j = 0; j < m[i]; j++) {
                int z = 0;

                for ( ; z < curr && z < m[i]; z++) {
                    x += arah[a][0];
                    y += arah[a][1];
                }

                
            }
        }

        // for (int x = 0; x < N; x++) {
        // int it = 1;
        // int a = 0;
        // int[] pos = { 0, 0 };

        // for (int i = 0; i < m[x]; i++) {
        // for (int j = 0; j < it; j++) {
        // pos[0] += arah[a][0];
        // pos[1] += arah[a][1];
        // }
        // it++;
        // a = ++a % 4;
        // }

        // System.out.println(pos[0] + " " + pos[1]);

        // }
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