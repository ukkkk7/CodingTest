import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(fibonachi(n));
    }

    private static int fibonachi(int n) {

        if(n == 0) return 0;
        else if(n == 1) return 1;
        else return fibonachi(n-1) + fibonachi(n-2);

    }


}
