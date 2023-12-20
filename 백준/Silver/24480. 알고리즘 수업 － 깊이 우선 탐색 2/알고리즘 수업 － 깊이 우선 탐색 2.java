

import java.io.*;
import java.util.*;

/*




 */
public class Main {

    static int[] check;
    static int cnt;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        check = new int[n+1];

        for(int i=0; i<n+1; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++){
           st = new StringTokenizer(br.readLine());

           int u = Integer.parseInt(st.nextToken());
           int v = Integer.parseInt(st.nextToken());

           graph.get(u).add(v);
           graph.get(v).add(u);

        }

        for(int i=1; i< graph.size(); i++){
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        cnt = 1;

        dfs(r);

        for(int i=1; i< check.length; i++){
            sb.append(check[i]).append("\n");
        }

        System.out.println(sb);
    }

    private static void dfs(int r) {

        check[r] = cnt;

        for(int i=0; i<graph.get(r).size(); i++){
            int newR = graph.get(r).get(i);

            if(check[newR] == 0){
                cnt++;
                dfs(newR);
            }

        }


    }

}
