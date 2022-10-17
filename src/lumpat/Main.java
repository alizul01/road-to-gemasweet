package lumpat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l;

        p = sc.nextInt();
        l = sc.nextInt();

        char[][] m = new char[p][l];

        for(int i = 0; i < p; i++) {
            m[i] = sc.nextLine().split("").toCharArray();
        }



        System.out.println(p + " " + l);

        sc.close();
    }

    public static boolean isHWall(char[] p) {
        return  !Arrays.asList(p).stream().anyMatch(x -> x == " ");
    }

    

}
