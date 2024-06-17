import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Long> G = new ArrayList<>();
        ArrayList<Long> L = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (sc.next().equals("G")) {
                G.add(sc.nextLong());
            } else {
                L.add(sc.nextLong());
            }
        }
        Collections.sort(G);
        Collections.sort(L);
        int count = N;
        int j = 0;
        for (int i = 0; i < G.size(); i++) {
            int liars = 0;
            while(j < L.size() && G.get(i) > L.get(j)) {
                j++;
            }
            liars = G.size() - 1 - i + j;
            count = Math.min(count, liars);
        }

        System.out.println(count);
    }
}
