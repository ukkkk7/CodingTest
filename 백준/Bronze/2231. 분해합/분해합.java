import java.io.BufferedReader;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str_n = br.readLine();

        int size = str_n.length();
        int result = 0;
        int n = Integer.parseInt(str_n);


        for(int i = (n-(9*size)); i<=n; i++){

            int temp = i;
            int sum = 0;


            while (temp != 0){

                sum += temp % 10;
                temp /= 10;

            }

            if(sum + i == n){
                result = i;
                break;
            } else {
                result = 0;
            }
        }

        System.out.println(result);
    }
}