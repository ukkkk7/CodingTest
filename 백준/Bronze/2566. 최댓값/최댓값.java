import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        // 값은 1,1 행열부터 시작한다
        int[][] a = new int[10][10];

        int max = -1;

        int n = 0;
        int m = 0;


        for(int i=1; i<10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<10; j++){


                a[i][j] = Integer.parseInt(st.nextToken());


                if(max < a[i][j]){

                        max = a[i][j];

                        n = i;
                        m = j;

                }

            }
        }


        System.out.println(max);
        System.out.println(n + " " + m);





    }
}
