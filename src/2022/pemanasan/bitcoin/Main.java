import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int N = sc.nextInt();

        int price[] = new int[N];
        int res = 0;

        int minI = 0;
        int maxI = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            price[i] = sc.nextInt();
        }

        for (int i = maxI; i < N; i++) {
            int temp = 0;
            for (int j = i; j < N; j++) {
                if (price[j] < min) {
                    min = price[j];
                    minI = j;
                }
            } // mencari minimum

            for (int j = i + 1; j < N; j++) {
                if (price[j] > max) {
                    max = price[j];
                    maxI = j;
                    System.out.println("min = " + min);
                    System.out.println("max = " + max);
                    
                } // mencari maksimum
            }

            System.out.println("iterasi ke-" + i + " harga = " + (price[maxI] - price[minI]));
            res += (price[maxI] - price[minI]);
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            i = maxI + 1;
        }

        // for (int i = 0; i < N; i++) {
        //     price[i] = sc.nextInt();
        //     if (price[i] < min) {
        //         min = price[i];
        //     }
        // }

        // for (int i = 0; i < N; i++) {
        //     int temp = 0;
        //     for (int j = 0; j < N; j++) {
        //         if (price[j] < min) {
        //             min = price[j];
        //             minI = j;
        //         }
        //     }

        //     for (int j = i + 1; j < N; j++) {
        //         if (price[j] > price[minI]) {
        //             max = price[j];
        //             maxI = j;
        //         }
        //     }

        //     temp = (price[maxI] - price[minI]);
        //     res += temp;
            
        //     if (!((1 + maxI) >= N)) {
        //         i = maxI + 1;
        //     }

        //     max = Integer.MIN_VALUE;
        //     min = Integer.MAX_VALUE;
        // }

        System.out.println(res);
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
