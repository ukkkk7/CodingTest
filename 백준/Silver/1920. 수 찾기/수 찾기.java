import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/*

문제
N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.

출력
M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.

예제 입력 1
5
4 1 5 2 3
5
1 3 7 9 5
예제 출력 1
1
1
0
0
1

 */
public class Main {

    public static int[] org;

    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        org = new int[n];


        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            org[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(org);

        int m = Integer.parseInt(br.readLine());
        int[] compare = new int[m];


        st = new StringTokenizer(br.readLine());

        for(int i=0; i<m; i++){
            compare[i] = Integer.parseInt(st.nextToken());
        }


        for(int i=0; i<m; i++){
            sb.append(search(compare[i])).append("\n");
        }

        System.out.println(sb);

    }


    private static int search(int key) {

        int low = 0;
        int high = org.length - 1;



        while (low <= high) {

            int mid = (int)Math.ceil((double)(low + high)/2);

            if (org[mid] < key) {
                low = mid + 1;
            } else if (org[mid] > key) {
                high = mid - 1;
            } else {
                return 1;
            }

        }
        //탐색 실패시
        return 0;
    }



}