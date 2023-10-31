import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int min = n;
        int sum = 0;


        for(int i=m; i<=n; i++){

            boolean chk = true;

            if( i == 1){
                continue;
            }

            for(int j=2; j<=Math.sqrt(i); j++){

                if(i % j == 0){
                    chk = false;
                    break;
                }


            }

            if(chk){
                if(min > i) {
                    min = i;
                }

                sum += i;
            }



        }

        if(sum == 0){

            System.out.println(-1);

        } else {
                
            System.out.println(sum);
            System.out.println(min);
            

        }





    }

}