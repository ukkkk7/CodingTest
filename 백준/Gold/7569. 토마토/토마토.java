import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n,m,h;
    static int[] dx = {1,-1,0,0,0,0};
    static int[] dy = {0,0,1,-1,0,0};
    static int[] dz = {0,0,0,0,1,-1};
    static int[][][] box;

    static Queue<tomato> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        box = new int[n][m][h];

        for(int k = 0; k < h; k++){

            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<m; j++){
                    box[i][j][k] = Integer.parseInt(st.nextToken());

                    if(box[i][j][k] == 1){
                        q.offer(new tomato(i, j, k, 0));
                    }
                }
            }
        }//for-k

        bfs();


    }

    private static void bfs() {

        int day = 0;


        while (!q.isEmpty()){
            tomato t = q.poll();
            day = t.day;

            for(int i=0; i<6; i++){

                int nx = t.x + dx[i];
                int ny = t.y + dy[i];
                int nz = t.z + dz[i];

                if(0 <= nx && nx < n && 0 <= ny && ny < m && 0 <= nz && nz < h){
                    if(box[nx][ny][nz] == 0){
                        box[nx][ny][nz] = 1;
                        q.offer(new tomato(nx, ny, nz,day + 1));

                    }
                }
            }
        }

        if(check()){
            System.out.println(day);
        } else {
            System.out.println(-1);
        }


    }

    static boolean check(){

        for(int k=0; k<h; k++) {


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (box[i][j][k] == 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }


    }




class tomato {
    int x;
    int y;
    int z;
    int day;

    public tomato(int x, int y, int z, int day) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.day = day;
    }
}
