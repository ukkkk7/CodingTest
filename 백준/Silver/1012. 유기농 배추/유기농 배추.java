import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    //테스트 케이스 갯수, 가로, 세로, 배추 심어진 갯수, 벌레
    static int t, m, n, k, cnt;

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static boolean[][] visit;
    static List<Integer> list;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        while (t>0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            map = new int[m][n];
            visit = new boolean[m][n];

            //전체 배열 0으로 초기화
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = 0;
                }
            }

            //이차원 배열 배추 심어져 있는 땅 초기화
            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            cnt = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] == 1 && !visit[i][j]) {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);

            t--;

        }


    }

    private static void dfs(int x, int y){

        visit[x][y] = true;


        for(int i=0; i<4; i++){

            int nx = x + dx[i];
            int ny = y + dy[i];

            if(0<= nx && nx< m && 0 <= ny && ny< n){
                if(map[nx][ny] == 1 && !visit[nx][ny]){
                    dfs(nx, ny);
                }
            }

        }



    }

}
