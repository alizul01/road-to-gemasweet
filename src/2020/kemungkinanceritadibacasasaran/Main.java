// package kemungkinanceritadibacasasaran;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hasTime = false;
        int m = sc.nextInt();
        int s = sc.nextInt();
        Online target[] = new Online[s];

        for (int i = 0; i < s; i++) {
            target[i] = new Online(sc.nextInt(), sc.next(), sc.next());
        }

        int p = sc.nextInt();   
        Online writer[] = new Online[p];

        for (int i = 0; i < p; i++) {
            writer[i] = new Online(sc.nextInt(), sc.next(), sc.next());
        }

        Arrays.sort(writer, (a,b) -> a.day - b.day);

        for (int i = 0; i < writer.length; i++) {
            Online curr = writer[i];

            for (int j = 0; j < target.length; j++) {
                Online targ = target[j];

                if(curr.day != targ.day) continue;

                int[] result = calculateOverlap(curr.start, curr.end, targ.start, targ.end);
                
                if(result[2] > m){
                    curr.solve(result[0], result[1]);
                    hasTime = true;
                }  
            }
        }

        if (!hasTime) System.out.println("ikhlaskan saja");
        
        sc.close();
    }

    static int[] calculateOverlap(int start1, int end1, int start2, int end2) {
        if ((start1 <= start2) && (end1 >= end2)) {
            return new int[]{start2, end2, end2 - start2};
        } else if ((start1 <= start2) && (end1 <= end2)) {
            return new int[]{start2, end1, end1 - start2};
        } else if ((start1 >= start2) && (end1 >= end2)) {
            return new int[]{start1, end2, end2 - start1};
        } else if ((start1 >= start2) && (end2 >= end1)) {
            return new int[]{start1, end1, end1 - start1};
        }
        return new int[]{0, 0, 0};
    }

}

class Online {
    int day, hour, start, end;

    Online(int day, String time1, String time2) {
        this.day = day;
        int hour = Integer.parseInt(time1.split("[.]")[0]);
        int hour2 = Integer.parseInt(time2.split("[.]")[0]);
        this.start = hour * 60 + Integer.parseInt(time1.split("[.]")[1]);
        this.end = hour2 * 60 + Integer.parseInt(time2.split("[.]")[1]);
    }

    void solve(int start, int end) {
        System.out.printf("%d %02d.%02d %02d.%02d%n", day, start / 60, start % 60, end / 60, end % 60);
    }
}