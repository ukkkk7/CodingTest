import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

   static boolean[][] visit;
   static int n,m,cnt;
   static int[][] map;
   static Queue<int[]> q = new LinkedList<>();

   static int[] dx = {1,-1,0,0};
   static int[] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visit = new boolean[n][m];

        for(int i=0; i<n; i++){
            String line = br.readLine();
            for(int j=0; j<m; j++){
                map[i][j] = line.charAt(j) - '0';
            }
        }



        bfs(0,0);

        System.out.println(map[n-1][m-1]);

    }


    public static void bfs(int x, int y){

        visit[x][y] = true;

        q.add(new int[]{x,y});

        while (!q.isEmpty()){
            int cur[] = q.poll();
            int curX = cur[0];
            int curY = cur[1];

            for(int i=0; i<4; i++){
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                if(0<= nextX && nextX < n && 0<= nextY && nextY <m){
                    if(map[nextX][nextY] == 1 && !visit[nextX][nextY]){
                        map[nextX][nextY] = map[curX][curY] + 1;
                        q.add(new int[]{nextX, nextY});
                        visit[nextX][nextY] = true;

                    }
                }

            }


        }
    }


}
