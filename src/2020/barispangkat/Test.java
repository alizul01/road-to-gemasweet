package barispangkat;

import java.math.BigInteger;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp;
        BigInteger[] a = new BigInteger[n];

        for (int i = 0; i < a.length; i++) {
            tmp = sc.nextInt();
            a[i] = BigInteger.valueOf(tmp);
        }

        BigInteger result = a[n-2].pow(a[n-1].intValue());
        
        for (int i = n-3; i >= 0; i--)
            result = a[i].pow(result.intValue());


        BigInteger mod = BigInteger.valueOf(100000037);

        result = result.mod(mod);
        System.out.println(result);
    }
}