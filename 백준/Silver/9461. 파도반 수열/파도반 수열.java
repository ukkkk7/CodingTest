import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Long[] p = new Long[101];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        p[1] = 1L;
        p[2] = 1L;
        p[3] = 1L;




        StringBuilder sb = new StringBuilder();
        while (n --> 0) {
            sb.append(p(Integer.parseInt(br.readLine()))).append("\n");
        }

        System.out.println(sb);
    }

    public static Long p(int n){
        if(p[n] == null ){
            p[n] = p(n-2)+p(n-3);
        }
        return p[n];
    }

}
