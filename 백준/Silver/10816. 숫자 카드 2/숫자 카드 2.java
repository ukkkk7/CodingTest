import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/*

첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

출력
첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력한다.
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10

 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        //m개의 수를 입력받음과 동시에 이분탐색을 진행
        for(int i = 0; i<m; i++){

            int key = Integer.parseInt(st.nextToken());

            sb.append(upper(key, arr) - lower(key, arr)).append(" ");

        }

        System.out.println(sb);
    }

    //상한선을 구하는 메소드
    private static int upper(int key, int[] arr){

        //탐색하는 범위가
        int lo=0;
        int hi=arr.length;
        //lo와 hi가 같아지는 순간 while문이 종료되어야 한다.
        while(lo < hi){
            int mid = (lo+hi)/2;
            //만일 key값이 arr[mid]값이랑 같은데 다음 인덱스 또한 같다면? 다음 인덱스로 이동하기 위해 lo값을 높여주어야 한다.
            //그러므로 첫번째 if문의 조건은 key가 arr[mid]보다 작아야 한다가 된다.
            if(key < arr[mid]){
                hi=mid;
            } else {
                //key값이 arr[mid]값과 같거나 크다면 lo를 옮겨준다
                lo = mid+1;
            }
        }
        //lo를 리턴해주는 이유는 lo를 계속해서 오른쪽으로 움직이며 상한선을 찾고 상한선에 도달했을 때의 lo의 값이 상한값이 되기 때문에
        return lo;
    }


    private static int lower(int key, int[] arr){

        int lo = 0;
        int hi = arr.length;

        while (lo<hi){
            int mid = (lo+hi)/2;
            if(key <= arr[mid]){
                hi=mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }



}