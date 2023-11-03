import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int max_x = Integer.MIN_VALUE;
        int min_x = Integer.MAX_VALUE;
        int max_y = Integer.MIN_VALUE;
        int min_y = Integer.MAX_VALUE;


        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

           int x = Integer.parseInt(st.nextToken());
           int y = Integer.parseInt(st.nextToken());


           if(max_x <= x) max_x = x;
           if(max_y <= y) max_y = y;
           if(min_x >= x) min_x = x;
           if(min_y >= y) min_y = y;


        }

        int result = (max_x - min_x) * (max_y - min_y);

        System.out.println(result);

    }
}