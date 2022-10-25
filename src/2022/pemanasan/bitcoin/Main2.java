import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) {
        FastReader sc = new FastReader();

        int N = sc.nextInt();

        int prev = sc.nextInt();
        int res = 0;

        for (int index = 1; index < N; index++) {
            int temp = sc.nextInt();
            if ((temp - res) > 0) {
                res += (temp - res);
            } else {
                res += 0;
            }
            System.out.println(res);
            prev = temp;
        }

        System.out.println(res);


        // int N = sc.nextInt();

        // int price[] = new int[N];
        // int res = 0;

        // int min = Integer.MAX_VALUE;
        // int nextMin = min;
        // int max = Integer.MIN_VALUE;

        // int minI = 0;
        // int maxI = 0;
        // int nextMinI = 0;

        // for (int i = 0; i < N; i++) {
        //     price[i] = sc.nextInt();
        //     if (price[i] < min) {
        //         min = price[i];
        //         minI = i;
        //     }
        //     if (price[i] > min && price[i] < nextMin) {
        //         nextMin = price[i];
        //         nextMinI = i;
        //     }
        // }

        // int start = minI + 1;

        // while (nextMinI != -1) {
        //     for (int i = start; i < N; i++) {
        //         if (price[i] > max) {
        //             max = price[i];
        //             maxI = i;
        //         }

        //         if (price[i] < nextMin && price[i] > min) {
        //             nextMin = price[i];
        //             nextMinI = i;
        //         }
        //     }

        //     int oldMin = min;
        //     int oldMax = max;

        //     if (nextMin == Integer.MAX_VALUE) {
        //         break;
        //     } else {
        //         minI = nextMinI;
        //         min = nextMin;
        //         max = min;
        //         start = maxI + 1;
        //         nextMin = Integer.MAX_VALUE;
        //     }

        //     res += (oldMax - oldMin);
        // }

        // System.out.println(res);
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
