import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());


        //수의 범위 0 ~ 10,000
        //중복값이 존재하기 때문에 int배열로 선언
        int[] arr = new int[10001];


        for(int i=0; i<n; i++){
            //입력받은 인덱스의 값을 1증가시킨다 -> 중복값이 존재하면 해당 인덱스의 값은 계속 증가할 것
            arr[Integer.parseInt(br.readLine())]++;
        }

        
        for(int i=0; i<arr.length; i++) {
            while (arr[i] > 0){
                sb.append(i).append("\n");
                //만약 중복값이 있다면 -1을 해줌으로써 index가 올라감에 따라 중복값을 점차 제거하며 올바른 출력을 할 수 있다.
                arr[i]--;
            }
        }

        System.out.println(sb);



    }
}