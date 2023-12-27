import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int  n,m,v, graph[][];
    static boolean visit[];

    static Queue<Integer> q = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //정점
        n = Integer.parseInt(st.nextToken());
        //간선
        m = Integer.parseInt(st.nextToken());
        //시작노드
        v = Integer.parseInt(st.nextToken());

        graph = new int[n+1][n+1];
        visit = new boolean[n+1];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u][v] = graph[v][u] = 1;

        }



        dfs(v);

        System.out.println();
        visit = new boolean[n+1];

        bfs(v);

    }

    private static void dfs(int node){

        visit[node] = true;
        System.out.print(node + " ");

        for(int i=1; i<=n; i++){
            if(graph[node][i] == 1 && !visit[i]){
                dfs(i);
            }
        }

    }
    private static void bfs(int node){

        visit[node] = true;



        q.offer(node);

        while (!q.isEmpty()){

            node = q.poll();
            System.out.print(node + " ");

            for(int i=1; i<=n; i++){
                if(graph[node][i] == 1 && !visit[i]){
                    q.offer(i);
                    visit[i] = true;


                }
            }
        }


    }




}
