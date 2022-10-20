package barispangkat;

import java.util.Scanner;

// Deskripsi Masalah
// Diberikan sebuah barisan bilangan bulat a1, a2, ... , an, tentukan nilai dari

// A = a1^(a2^(a3^(...^(an-1^an)))) mod 100 000 037.

// Format Masukan dan Keluaran
// Masukan dimulai dengan sebuah baris berisi sebuah bilangan n yang menyatakan panjang barisan,
// kemudian diikuti dengan n buah bilangan bulat yang menyatakan barisan bulat a1, a2, ... , an.
// Keluaran merupakan sebuah baris berisi satu buah bilangan yaitu nilai A.
// Nilai n memenuhi 1 ≤ n ≤ 10 000 dan nilai ai memenuhi 1 ≤ ai ≤ 100 000 untuk setiap
// 1 ≤ i ≤ n.

// Contoh Masukan/Keluaran
// Masukan
// 3
// 3
// 2
// 3
// Keluaran
// 6561

// Masukan
// 5
// 5
// 4
// 3
// 2
// 1
// Keluaran
// 55456697
public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    long result = 1;
    for (int i = n - 1; i >= 0; i--) {
      System.out.printf("powMod(%d, %d, 100000037) = ", a[i], result);
      result = powMod(a[i], result, 100000037);
      System.out.println(result);
    }

    System.out.println(result);
    sc.close();
  }

  public static long powMod(long a, long b, long mod) {
    long result = 1;
    while (b > 0) {
      if (b % 2 == 1) {
        result = (result * a) % mod;
      }
      a = (a * a) % mod;
      b /= 2;
    }
    return result;
  }
}