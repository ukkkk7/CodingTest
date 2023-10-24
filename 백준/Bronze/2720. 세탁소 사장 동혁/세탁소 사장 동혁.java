import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;


        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){

            int s = Integer.parseInt(br.readLine());

            sb.append(s/quarter + " ");
            s %= quarter;
            sb.append(s/dime + " ");
            s %= dime;
            sb.append(s/nickel + " ");
            s %= nickel;
            sb.append(s/penny + "\n");
            s %= penny;

           

        }
            
         System.out.print(sb);
    
    }
}
