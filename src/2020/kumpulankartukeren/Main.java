package kumpulankartukeren;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // jumlah kartu
        int res = 0;
        ArrayList<Integer> arr = new ArrayList<>(); // menyimpan kartu sejumlah N input dari user

        for (int i = 0; i < N; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println("Array sebelum diubah : " + arr.toString());

        for (int i = 0; i < arr.size()/2; i++) {
            if (arr.get(i) != arr.get(arr.size() - i - 1)) {
                arr.add(arr.size() - i , arr.get(i));
                res += 1;
            }
        }

        System.out.println("Array setelah diubah : " + arr.toString());
        System.out.println(res);

        sc.close();
    }
}