package barispangkat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i  < arr.length; i++) {
        // for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(pangkat(0, arr));
        }
        sc.close();
    }

    public static long pangkat(int n, int [] arr) {
        if(n >= arr.length - 1) return arr[n];
        
        System.out.printf("pangkat(%d, %d) mod 100_000_037 = ", arr[n], pangkat(n+1, arr));
        long x=  (long) pow(arr[n], pangkat(n+1, arr), 100_000_037);
        System.out.println(x);

        return x;
    }

    public static long pow(long base, long power, long mod) {
      long res = 1;
        while (power-- > 0) {
          res = (res * base) % mod;
      }

      return res;
    }

    // public static long pangkat(int n, int[] arr) {
    //     int res = 1;
    //     int pow = arr[arr.length - 1];
    //     while (pow > 0) {
            
    //     } 
    // }
}
