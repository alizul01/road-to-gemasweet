import java.util.Arrays;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();

        int arr[][] = new int[N][M];
        int res [] = new int[Q];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < Q; i++) {
            res[i] = calculate(
                arr,
                sc.nextInt() - 1,
                sc.nextInt() - 1,
                sc.nextInt() - 1,
                sc.nextInt() - 1
            );
        }

        for (int i : res) {
            System.out.println(i);
        }
        
        System.out.println();
    }

    public static int calculate(int[][] m, int x1, int y1, int x2, int y2) {
        int res = 0;

        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                res += m[i][j];
            }
        }

        return res;
    }
}