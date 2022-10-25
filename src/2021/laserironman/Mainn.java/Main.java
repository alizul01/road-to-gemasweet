import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ironmanPos = new int[2];

        ironmanPos[0] = sc.nextInt(); // posisi X dari ironman
        ironmanPos[1] = sc.nextInt(); // posisi y dari ironman

        int res = 0;
        int N = sc.nextInt(); // jumlah ultron

        int[][] ultrons = new int[N][2]; // koordinat ultron

        for (int i = 0; i < N; i++) { // i => ultron ke berapa?
            ultrons[i][0] = sc.nextInt(); // titik x
            ultrons[i][1] = sc.nextInt(); // titik y
        }

        int K = sc.nextInt();

        int[][] obstacle = new int[K][4];

        for (int i = 0; i < K; i++) {
            obstacle[i][0] = sc.nextInt();
            obstacle[i][1] = sc.nextInt();
            obstacle[i][2] = sc.nextInt();
            obstacle[i][3] = sc.nextInt();
        } 

        for (int i = 0; i < ultrons.length; i++) {
            int hit = 1;
            for (int j = 0; j < obstacle.length; j++) {
                if (isIntersecting(ironmanPos, ultrons[i], new int [] {obstacle[j][0], obstacle[j][1]}, new int [] {obstacle[j][2], obstacle[j][3]})) {
                    hit = 0;
                    break;
                }
            }
            res += hit;
        }

        System.out.println(res);

        sc.close();
    }

    public static boolean isPerpendicularIntersection(int[] ironmanPos, int[] ultronPos, int[] obs1, int[] obs2) {
        if ((obs1[0] < ironmanPos[0] && obs1[0] > ultronPos[0])
                || (obs1[1] < ironmanPos[1] && obs1[1] > ironmanPos[1])) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isIntersecting(int ironmanPos[], int ultronPos[], int obs1[], int obs2[]) {
        double denominator = ((ironmanPos[0] - ultronPos[0]) * (obs1[1] - obs2[1]))
                - ((ironmanPos[1] - ultronPos[1]) * (obs1[0] - obs2[0]));
        if (denominator == 0)
            return false;

        double t = (((ironmanPos[0] - obs1[0]) * (ironmanPos[1] - ultronPos[1]))
                - ((ironmanPos[1] - obs1[1]) * (ironmanPos[0] - ultronPos[0]))) / denominator;
        double u = (((ironmanPos[0] - obs1[0]) * (obs1[1] - obs2[1]))
                - ((ironmanPos[1] - obs1[1]) * (obs1[0] - obs2[0]))) / denominator;

        if ((t >= 0 && t <= 1) && (u >= 0 && u <= 1))
            return true;
        return false;
    }
}