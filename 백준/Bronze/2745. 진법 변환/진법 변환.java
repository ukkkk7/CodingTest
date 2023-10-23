import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();

        int b = Integer.parseInt(st.nextToken());

        // 지수의 승을 높여주기 위해 선언 ex) 2^1, 2^2, 2^3...
        int tmp = 1;
        int sum = 0;

        // 문자를 입력하면 zzzzz 여기서 제일 끝 문자부터 탐색해야 하기 때문에 조건식은 하나씩 - 되도록 작성
        for(int i=n.length()-1; i>=0; i--){
            //10진법으로 변환해주기 위해 char형으로 변환
            char c = n.charAt(i);

            // 입력받은 문자가 해당 조건에 있다면
            if('A' <= c && c <= 'Z'){
                //입력받은 문자에서 65인 대문자 A를 빼주고 A가 10이라 했으니 10을 더해준다 이후 누적된 진법을 곱해준다.
                sum += (c -'A' + 10) * tmp;
            } else{
                // 문자가 대문자가 아니라면 0~9사이의 값이라는 거니까 실수 48에 해당하는 0을 빼주고 누적된 진법을 곱해준다 
                sum += (c - '0') * tmp;
            }

            //입력받은 진법을 누적시켜준다
            tmp *= b;

        }


        System.out.println(sum);
        
    }
}
