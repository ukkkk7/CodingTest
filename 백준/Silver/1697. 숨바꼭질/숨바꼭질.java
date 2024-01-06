import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n,k,cnt;
    static boolean[] visit;

    static int[] spot;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        visit = new boolean[100001];
        spot = new int[100001];
        int result = bfs(n);

        System.out.println(result);

    }

    private static int bfs(int n){

        Queue<Integer> q = new LinkedList<>();

        visit[n] = true;

        spot[n] = 1;
        q.add(n);

        while (!q.isEmpty()){

            int a = q.poll();

            if(a == k){
               return spot[a]-1;
            }

            if(0<= a-1 && !visit[a-1]){
                visit[a-1] = true;
                spot[a-1] = spot[a]+1;
                q.add(a-1);

            }

            if(a+1 <= 100000 && !visit[a+1]){
                visit[a+1] = true;
                spot[a+1] = spot[a]+1;
                q.add(a+1);

            }
            if(a*2 <= 100000 && !visit[a*2]){
                visit[a*2] = true;
                spot[a*2] = spot[a]+1;
                q.add(a*2);

            }


        }
        return -1;
    }
}
