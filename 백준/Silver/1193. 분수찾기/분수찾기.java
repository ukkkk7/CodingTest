import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int prevCrossSum = 0;
        int crossCnt = 1;

        int n = Integer.parseInt(br.readLine());

        while(true){

            if(n <= crossCnt + prevCrossSum){
                //대각선의 개수가 홀수일 때 짝수일 때
                if(crossCnt % 2 == 1){
                    System.out.println((crossCnt - (n-prevCrossSum) + 1) + "/" + (n - prevCrossSum));
                    break;
                } else {
                    System.out.println((n - prevCrossSum) + "/" + (crossCnt - (n-prevCrossSum) + 1));
                    break;
                }
            } else {

                prevCrossSum += crossCnt;
                crossCnt++;
                
            }
         }



    }
}