import java.util.*;
import java.lang.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<City> l = new ArrayList<City>();

        int p = s.nextInt();
        res = new String[p];

        for (int i = 0; i < p; i++) {
            String c1 = s.next();
            int x1 = s.nextInt();
            int y1 = s.nextInt();
            int r1 = s.nextInt();
            String c2 = s.next();
            int x2 = s.nextInt();
            int y2 = s.nextInt();
            int r2 = s.nextInt();

            int d = (int) Math.floor(Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2)));

            l.add(new City(c1, c2, d));
        }

        Collections.sort(l, new Comparator<City>() {
            public int compare(City o1, City o2) {
                return o2.result - o1.result;
            }
        });

        for (int i = 0; i < p; i++) {
            City c = l.get(i);

            System.out.println(c.first + " " + c.second + " " + c.result);
        }
    }

}

class City {
    String first;
    String second;
    int result;

    public City(String first, String second, int res) {
        this.first = first;
        this.second = second;
        this.result = res;
    }
}