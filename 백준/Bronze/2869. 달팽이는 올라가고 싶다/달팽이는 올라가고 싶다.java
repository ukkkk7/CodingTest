import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); // 낮에 올라가는 거리
        int b = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 거리
        int v = Integer.parseInt(st.nextToken());

        int d = (v - b) / (a - b);

        if((v - b) % (a - b) != 0 ){
            d++;
        }

        System.out.println(d);



    }
}