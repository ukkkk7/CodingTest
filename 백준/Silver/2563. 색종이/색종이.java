import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = 0;

        Boolean[][] b = new Boolean[100][100];

                for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                b[i][j] = false;
            }
        }
        
        int x = 0;
        int y = 0;

        for (int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());


            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            for(int j = x; j < x+10; j++){
                for(int k = y; k < y+10; k++){

                    if(!b[j][k]){
                        b[j][k] = true;
                        sum++;
                    }

                }
            }


        }


        System.out.println(sum);


    }
}
