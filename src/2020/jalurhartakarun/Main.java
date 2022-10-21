package jalurhartakarun;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<Integer, ArrayList<Integer>> ruangan = new Hashtable<Integer, ArrayList<Integer>>(); 

        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = -1;

        int score [] = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            ruangan.put(i, new ArrayList<>());
        }

        for (int i = 0; i < k; i++) {
            ruangan.get(sc.nextInt()).add(sc.nextInt());
        }

        // for(Map.Entry<Integer, ArrayList<Integer>> ruang:ruangan.entrySet()) {
        //     System.out.println(ruang.getKey() + " " + ruang.getValue());
        // }
        
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> curr = ruangan.get(i);
            int temp = 0;

            q.add(i);

            while(q.size() > 0) {
                int cur = q.remove();
                curr = ruangan.get(cur);
                int curScore = score[cur];

                temp += curScore;

                q.addAll(ruangan.get(cur));
            }

            if (temp > max) {
                max = temp;
            }
        }

        System.out.println(max);


        sc.close();
    }
}