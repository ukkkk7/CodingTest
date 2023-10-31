import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        br.readLine();


        int cnt = 0;


        StringTokenizer st = new StringTokenizer(br.readLine());


        // n개의 수를 입력할 거기 때문에 다음 토큰이 없다면 종료
        while(st.hasMoreTokens()) {

            boolean chk = true;

            int num = Integer.parseInt(st.nextToken());

            //1은 소수가 아니므로 다음 동작하도록
            if (num == 1) {
                continue;
            }

            //i = 2부터  num의 제곱근 전까지
            for (int i = 2; i <= Math.sqrt(num); i++) {

                //num이 i중 하나라도 나눠진다면 약수가 존재한다는 것이기 때문에 바로 동작 종료
                if (num % i == 0) {
                    chk = false;
                    break;
                }

            }

            if(chk) {
                cnt++;
            }

        }

        System.out.println(cnt);


    }

}