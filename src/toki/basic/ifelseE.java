// package toki.basic;

import java.util.Scanner;

public class ifelseE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String ans = "";
        int lengthAns = input.length();

        if (lengthAns == 1) {
            ans = "satuan";
        } else if (lengthAns == 2) {
            ans = "puluhan";
        } else if (lengthAns == 3) {
            ans = "ratusan";
        } else if (lengthAns == 4) {
            ans = "ribuan";
        } else if (lengthAns == 5) {
            ans = "puluhribuan";
        }

        System.out.println(ans);
    }
}
