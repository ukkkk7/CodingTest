import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visit;
    static int cnt =0;

    static List<ArrayList<Integer>> graph = new ArrayList<>();
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());

        int start = 1;
        visit = new boolean[n+1];


        for(int i=0; i<n+1; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<r; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);

        }

        dfs(start);

        System.out.println(cnt);

    }


    private static void dfs(int node){


        visit[node] = true;

        for(int i=0; i<graph.get(node).size(); i++){

            int newNode = graph.get(node).get(i);

            if(!visit[newNode]){
                cnt++;
                visit[newNode] = true;
                dfs(newNode);
            }
        }



    }

}
