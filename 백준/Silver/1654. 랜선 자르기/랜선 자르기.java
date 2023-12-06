import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/*

입력
첫째 줄에는 오영식이 이미 가지고 있는 랜선의 개수 K, 그리고 필요한 랜선의 개수 N이 입력된다. K는 1이상 10,000이하의 정수이고, N은 1이상 1,000,000이하의 정수이다. 그리고 항상 K ≦ N 이다. 그 후 K줄에 걸쳐 이미 가지고 있는 각 랜선의 길이가 센티미터 단위의 정수로 입력된다. 랜선의 길이는 231-1보다 작거나 같은 자연수이다.

출력
첫째 줄에 N개를 만들 수 있는 랜선의 최대 길이를 센티미터 단위의 정수로 출력한다.

예제 입력 1
4 11
802
743
457
539
예제 출력 1
200

 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];
        
        // k랜선을 잘라 n개를 만들어야 하기 때문에 key값은 n이 되고 비교 값은 랜선의 길이가 된다
        // 따라서 변수는 랜선의 최소길이, 최대길이, 중간길이를 선언
        long min = 0;
        long max = -1;
        long mid;
        
        //반복문을 수행하며 입력받은 값들 중 최대 랜선 길이를 max로 지정
        for(int i=0; i<k; i++){
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }

        //이 부분은 다시 참고
        max++;
            
        //최소 길이가 최대 길이보다 작을 때 즉 최소 길이와 최대 길이가 같아질 때 루프를 종료
          while (min < max){
              
            mid = (min+max)/2;

            long cnt = 0;
            
            //최대 랜선 길이의 중간값으로 각 랜선을 잘랐을 때 나올 개수를 누적시킨다.
            for(int i=0; i<arr.length; i++){

                cnt += (arr[i] / mid);
            }

            // Upperbound 방식을 통해 누적시킨 개수가 n개보다 작다면 mid값을 max로 치환
            if(cnt < n){
                max = mid;
            } else {
                //cnt가 n과 같거나 크다면 min값을 mid값으로 치환
                min = mid + 1;
            }

        }

        System.out.println(min-1);

    }

}