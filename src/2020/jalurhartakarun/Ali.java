package jalurhartakarun;
import java.util.*;

public class Ali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<Integer, ArrayList<Integer>> ruangan = new Hashtable<Integer, ArrayList<Integer>>();

        int n = sc.nextInt();
        int k = sc.nextInt();

        int score [] = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            ruangan.put(i, new ArrayList<>());
        }

        for (int i = 0; i < k; i++) {
            ruangan.get(sc.nextInt()).add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            int max = 0;
            Stack<Integer> stack = new Stack<>();
            boolean[] visited = new boolean[n];

            stack.push(i);
            visited[i] = true;

            while (!stack.isEmpty()) {
                int node = stack.pop();
                max += score[node];

                for (int j = 0; j < ruangan.get(node).size(); j++) {
                    
                }
            }
        }

        sc.close();
    }
}
