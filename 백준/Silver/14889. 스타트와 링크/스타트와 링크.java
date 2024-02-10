import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[][] map;
    static boolean[] visit;
    static int min = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        //좌표를 저장할 이차원 배열
        map = new int[n][n];
        //해당 좌표를 방문했는지 체크할 배열-왜 이차원 배열이 아님? -
        visit = new boolean[n];

        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //
        dfs(0, 0);
        System.out.println(min);

    }

    public static void dfs(int idx , int depth){

        // if n이 4이고 12가 팀이라면 자연스럽게 34가 팀이 되므로 n을 절반으로 나눈값으로 조건문을 생성하고 조건에 맞으면 조건문 실행
        if(depth == n/2){
            //나눈 팀에서 배열을 확인하며 최솟값 구하는 메소드
            diff();
            return;
        }


        //n까지의 값
        for(int i=idx; i<n; i++){
                if(!visit[i]){
                    visit[i] = true;
                    dfs(i+1, depth+1);
                    visit[i] = false;

            }
        }

    }

    public static void diff(){

        int teamStart = 0;
        int teamLink = 0;


        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){

                if(visit[i] == true && visit[j] == true){
                    teamStart += map[i][j];
                    teamStart += map[j][i];
                } else if (visit[i] == false && visit[j] == false) {
                    teamLink += map[i][j];
                    teamLink += map[j][i];
                }
            }
        }

        int val = Math.abs(teamStart - teamLink);

        if(val == 0){
            System.out.println(val);
            System.exit(0);
        }

        min = Math.min(val, min);

    }

}
