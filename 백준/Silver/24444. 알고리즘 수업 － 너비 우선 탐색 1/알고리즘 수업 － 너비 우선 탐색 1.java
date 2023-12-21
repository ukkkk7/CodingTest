

import java.io.*;
import java.util.*;

/*




 */
public class Main {

    static int cnt;
    static int[] visit;
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        visit = new int[n+1];

        for(int i=0; i<n+1; i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            list.get(u).add(v);
            list.get(v).add(u);
        }

        for(int i=1; i<n+1; i++){
            Collections.sort(list.get(i));
        }

        cnt = 1;
        bfs(r);

        for(int i=1; i< visit.length; i++){
           sb.append(visit[i]).append("\n");
        }


        System.out.println(sb);

    }

    private static void bfs(int r) {

        Queue<Integer> q = new LinkedList<>();

        q.add(r);
        visit[r] = cnt++;

        while (!q.isEmpty()){
            int a = q.poll();

            for(int i=0; i<list.get(a).size(); i++){
                int next = list.get(a).get(i);

                if(visit[next] != 0) continue;

                q.add(next);
                visit[next] = cnt++;

            }

        }

    }

}
