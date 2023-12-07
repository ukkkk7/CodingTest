import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        int min = 0;
        int max = -1;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }
        
         max++;


        while(min < max){
            long val = 0;
            int mid = (min+max)/2;
            for(int i=0; i<arr.length; i++){
                if(arr[i] > mid)
                val += (arr[i] - mid);
            }

            if(val < m){
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(min-1);


    }

}