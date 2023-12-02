import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/*

 */
public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        HashSet<Integer> num = new HashSet<>();


            StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            num.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){

            int val = Integer.parseInt(st.nextToken());

            if(num.contains(val)){
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }

        }

        System.out.println(sb);


    }
}