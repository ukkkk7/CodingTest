import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws IOException {

        //숫자 5개를 배열에 하나씩 입력받는다
        //입력받은 숫자를 정렬한다
        //정렬한 숫자의 평균값과 중앙값을 구한다. 숫자는 5개만 주어진다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        int sum = 0;
        int avg = 0;
        int mid = 0;
        
        for(int i=0; i<5; i++){

            arr[i] = Integer.parseInt(br.readLine());

            sum += arr[i];

        }

        Arrays.sort(arr);




        avg = sum/arr.length;
        mid = arr[2];
        
        System.out.println(avg);
        System.out.println(mid);





    }

}