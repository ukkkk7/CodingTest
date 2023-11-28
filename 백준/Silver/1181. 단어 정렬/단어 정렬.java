import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        //먼저 갯수 입력받기
        int n = Integer.parseInt(br.readLine());

        //배열에 알파벳 값 입력

        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = br.readLine();
        }

        //조건1 길이가 짧은것
        //조건2 알파벳 순서
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        //중복값 제거
        
        System.out.println(arr[0]);
        
        for(int i=1; i<n; i++){
            if(!arr[i].equals(arr[i-1])){
                System.out.println(arr[i]);
            }
        }

    }
}