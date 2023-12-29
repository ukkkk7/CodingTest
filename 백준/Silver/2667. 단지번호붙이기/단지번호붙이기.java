import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n, cnt;
    static boolean[][] visit;
    static int[][] apt;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static List<Integer> list;
    static Queue<int[]> q;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());

        visit = new boolean[n][n];
        apt = new int[n][n];

        list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            String line = br.readLine(); // 공백이 없기 때문에 StringTokenizer 사용못함
            for (int j = 0; j < n; j++) {
                apt[i][j] = line.charAt(j) - '0';
            }
        }

        cnt = 1;
/*
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
               if(apt[i][j] == 1 && !visit[i][j]){
                       dfs(i, j);
                       list.add(cnt);
                       cnt = 1;

                }
            }
        }
*/

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
               if(apt[i][j] == 1 && !visit[i][j]){
                       bfs(i, j);
                       list.add(cnt);
                       cnt = 1;

                }
            }
        }

        Collections.sort(list);

        sb.append(list.size()).append("\n");

        for(int num : list){
            sb.append(num).append("\n");
        }

        System.out.println(sb);


    }

    private static void dfs(int i, int j) {

        visit[i][j] = true;

        for(int k=0; k<4; k++){
            int nx = dx[k]+i;
            int ny = dy[k]+j;

            if((0<= nx && nx < n) && (0<= ny && ny < n)) {
                if (apt[nx][ny] == 1 && !visit[nx][ny]) {
                    cnt++;
                    dfs(nx, ny);
                }

            }

        }

    }


    private static void bfs(int i, int j){

        q = new LinkedList<>();
        q.add(new int[]{i,j});
        visit[i][j] = true;

            while (!q.isEmpty()){

                int curx = q.peek()[0];
                int cury = q.peek()[1];

                q.poll();

                for(int k=0; k<4; k++){

                    int nx = curx + dx[k];
                    int ny = cury + dy[k];

                    if(0<= nx && nx < n && 0<= ny && ny < n){
                        if(apt[nx][ny] == 1 && !visit[nx][ny]){
                            q.add(new int[]{nx,ny});
                            visit[nx][ny] = true;
                            cnt++;
                        }
                    }


                }

       }





    }




}
