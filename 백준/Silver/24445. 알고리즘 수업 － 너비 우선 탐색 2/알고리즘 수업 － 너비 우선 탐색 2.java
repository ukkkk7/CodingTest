

import java.io.*;
import java.util.*;


public class Main {

    static boolean[] visit;
    static int n,m,r,cnt;
    static List<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] result;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 정점, 간선 수, 시작노드 입력받기
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());


        //정점의 수 만큼 visit배열 초기화
        visit = new boolean[n+1]; // 노드가 1번부터이기 때문에 1더함

        //graph 초기화
        for(int i=0; i<n+1; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++){

            st = new StringTokenizer(br.readLine());
            //간선 정보 입력받기
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            // 간선정보는 양방향
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for(int i=1; i<n+1; i++){
            //그래프 내림차순 정렬이기 때문에 내림차순으로 변경
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        cnt = 1;

        bfs(r);

        for(int i=1; i< result.length; i++){
            sb.append(result[i]).append("\n");
        }

        System.out.println(sb);


    }



    private static void bfs(int node){

        //시작 노드 방문 체크
        visit[node]= true;
        //순서 저장하기 위한 배열 추가
        result = new int[n+1];

        Queue<Integer> q = new LinkedList<>();

        q.add(node);

        result[node] = cnt++;

        while (!q.isEmpty()){
            int a = q.poll();

            for(int i=0; i<graph.get(a).size(); i++){

                int newNode = graph.get(a).get(i);

                if(!visit[newNode]){
                    q.add(newNode);
                    result[newNode] = cnt++;
                    visit[newNode] = true;
                }

            }

        }



    }

}
