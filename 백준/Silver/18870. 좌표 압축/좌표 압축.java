import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/*
예제 입력 1
5
2 4 -10 4 -9
예제 출력 1
2 3 0 3 1
 */
public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] org = new int[n];
        Integer [] copy = new Integer[n];

            StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            org[i] = copy[i] = Integer.parseInt(st.nextToken());
        }

        //복사한 배열 정렬
        Arrays.sort(copy);


        HashMap<Integer, Integer> map = new HashMap<>();




            int cnt = 0;
        for(int i=0; i<n; i++){
            if(!map.containsKey(copy[i]))
                map.put(copy[i], cnt++);


        }

        //org의 인덱스에 해당하는 값과 map의 value에 해당하는 값이 같을 때 map의 키 값을 출력


        StringBuilder sb = new StringBuilder();

        for(int key : org){
            int rank = map.get(key);

                sb.append(rank).append(" ");

        }


        System.out.println(sb);


    }
}