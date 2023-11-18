import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int tmp = -1;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<arr.length -1 ; i++){
            for(int j=i+1; j<arr.length; j++){

                if(arr[i] > arr[j]){

                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;

                }

            }

        }

        for(int val : arr){

            sb.append(val).append("\n");

        }

        System.out.println(sb);

    }

}