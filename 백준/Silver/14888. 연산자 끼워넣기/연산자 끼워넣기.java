import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    static int n;
    static int[] number;
    static int[] op;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        number = new int[n];
        op = new int[4];

        for(int i=0; i<n; i++){
            number[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<4; i++){
            op[i] = Integer.parseInt(st.nextToken());
        }

        dfs(number[0], 1);
        System.out.println(max);
        System.out.println(min);

    }

    public static void dfs(int num, int depth){

        if(depth == n){
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for(int i=0; i<4; i++){

            if(op[i] > 0){
                op[i]--;
                switch (i){
                    case 0:dfs(num + number[depth], depth + 1); break;
                    case 1:dfs(num - number[depth], depth + 1); break;
                    case 2:dfs(num * number[depth], depth + 1); break;
                    case 3:dfs(num / number[depth], depth + 1); break;
                }
                op[i]++;
            }

        }

    }

}
