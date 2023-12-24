

import java.io.*;
import java.util.*;


public class Main {

    static int n, m;
    static int[][] box;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    static Queue<tomato> q = new LinkedList<>();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // 상자의 가로 세로 입력받기
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        //상자를 입력받은 가로,세로 크기로 초기화
        box = new int[n][m];

        //상자에 토마토의 상태 집어넣기
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<m; j++){
                box[i][j] = Integer.parseInt(st.nextToken());
                //토마토가 익었다면 익은 토마토의 위치 저장
                if(box[i][j] == 1){
                    q.offer(new tomato(i,j,0));
                }
            }
        }

        //익은 토마토의 위치로 bfs 탐색
        bfs();

    }

    private static void bfs() {
        int day = 0;


        while (!q.isEmpty()){
            tomato t = q.poll();
            day = t.day;

            //저장한 토마토의 위치에서 4방향 탐색
            for(int i =0; i<4; i++){
                int nx = t.x + dx[i];
                int ny = t.y + dy[i];
                //만일 이동한 위치가 범위 안에 있다면
                if(0 <= nx && nx < n && 0 <= ny && ny <m){
                    //범위에 있을 때 안익은 토마토라면
                    if(box[nx][ny] == 0){
                        //토마토를 익히고
                        box[nx][ny] = 1;
                        //그 위치를 다시 집어넣어준다.
                        q.add(new tomato(nx, ny, day+1));
                    }
                }

            }

        }//while


        //최종적으로 while문을 다 거치고 나서 안 익은 토마토가 있는지 체크
        if(checkTomato()){
            System.out.println(day);
        } else {
            System.out.println(-1);
        }

    }

        static boolean checkTomato(){
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(box[i][j] == 0)
                        return false;
                }
            }
            return true;
        }

}


class tomato {
    int x;
    int y;
    int day;

    public tomato(int x, int y, int day) {
        this.x = x;
        this.y = y;
        this.day = day;
    }
}

