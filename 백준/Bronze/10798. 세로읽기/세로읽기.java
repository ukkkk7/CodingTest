import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        char[][] a = new char[5][15];


        int maxRow = 0;
        
        
        for(int i = 0; i<5; i++){
            String s = br.readLine();
            for(int j=0; j<s.length(); j++){

                a[i][j] = s.charAt(j);
                
                if(a[i].length > maxRow){
                    maxRow = a[i].length;
                }

            }
        }


        StringBuilder sb = new StringBuilder();

        for(int j=0; j<maxRow; j++){
            for (int i=0; i<5; i++){

                if(a[i][j] != 0){
                    sb.append(String.valueOf(a[i][j]));

                }


            }
        }

        System.out.println(sb);


    }
}
