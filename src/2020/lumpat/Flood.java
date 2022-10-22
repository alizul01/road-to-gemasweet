package lumpat;

import java.util.*;

public class Flood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l;

        p = sc.nextInt();
        l = sc.nextInt();

        int[] cp = new int[2];
        int[] dp = new int[2];

        char[][] m = new char[p][l];

        sc.nextLine();

        for (int i = 0; i < p; i++) {
            m[i] = sc.nextLine().toCharArray();

            if(cp[0] != 0 && cp[1] != 0 && dp[0] != 0 && dp[1] != 0) continue;

            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 'C') {
                    cp[0] = i;
                    cp[1] = j;
                }

                if (m[i][j] == 'D') {
                    dp[0] = i;
                    dp[1] = j;
                }
            }
        }

        boolean[][] vis = new boolean[p][l];
        boolean[][] vis2 = new boolean[p][l];
        
        boolean dFoundP = searchFlood(m, dp[0], dp[1], 'C', false, new char[]{'-', '|', 'x'}, vis);
        boolean cFoundE = searchFlood(m, cp[0], cp[1], ' ', true, new char[]{'-', '|', 'x'}, vis2);

        if(dFoundP) {
            System.out.println("Dawala bertemu cepot");
        } else {
            System.out.println("Dawala tidak bertemu cepot");
        }

        if(cFoundE) {
            System.out.println("ada jalan Cepot lumpat");
        } else {
            System.out.println("tidak ada jalan Cepot lumpat");
        }

        sc.close();
    }

    static boolean searchFlood(char[][] pool, int row, int col, char search, boolean isEscape, char[] obs, boolean[][] vis) {
        if(vis[row][col]) return false;

        vis[row][col] = true;

        if(new String(obs).contains(pool[row][col] + "")) {
            return false;
        }

        if(pool[row][col] == search) {
            if(isEscape && (row == 0 || row == pool.length - 1 || col == 0 || col == pool[0].length - 1)) {
                return true;
            } else if (!isEscape) {
                return true;
            }
        }

        boolean hasFound = false;

        if(row - 1 >= 0 && searchFlood(pool, row - 1, col, search, isEscape, obs, vis)) {
            return true;
        } else if (col + 1 <= pool[0].length - 1 && searchFlood(pool, row, col + 1, search, isEscape, obs, vis)) {
            return true;
        } else if (row + 1 <= pool.length - 1 && searchFlood(pool, row + 1, col, search, isEscape, obs, vis)) {
            return true;
        } else if (col - 1 >= 0 && searchFlood(pool, row, col - 1, search, isEscape, obs, vis)) {
            return true;
        }

        return false;
    }
}