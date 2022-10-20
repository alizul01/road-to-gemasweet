package kemungkinanceritadibacasasaran;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 14;

        System.out.printf("%02d", a);
        
        int m = sc.nextInt();
        int s = sc.nextInt();
        Online target [] = new Online[s];

        for (int i = 0; i < s; i++) {
            target[i] = new Online(sc.nextInt(), sc.next(), sc.next());
        }

        for (Online online : target) {
            online.info();
        }

        sc.close();
    }
}

class Online {
    int day, hour, minutes, hour2, minutes2;
    Online(int day, String time1, String time2) {
        this.day = day;
        this.hour = Integer.parseInt(time1.split("[.]")[0]);
        this.hour2 = Integer.parseInt(time2.split("[.]")[0]);
        this.minutes = Integer.parseInt(time1.split("[.]")[1]);
        this.minutes2 = Integer.parseInt(time2.split("[.]")[1]);
    }

    void info() {
        System.out.println(day + " " + hour + "." + minutes + " " + hour2 + "." + minutes2);
    }
}