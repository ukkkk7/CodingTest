import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*

피보나치 수 재귀호출 의사 코드는 다음과 같다.

fib(n) {
    if (n = 1 or n = 2)
    then return 1;  # 코드1
    else return (fib(n - 1) + fib(n - 2));
}
피보나치 수 동적 프로그래밍 의사 코드는 다음과 같다.

fibonacci(n) {
    f[1] <- f[2] <- 1;
    for i <- 3 to n
        f[i] <- f[i - 1] + f[i - 2];  # 코드2
    return f[n];
}

*/
public class Main {

    static StringBuilder sb = new StringBuilder();
    static int cnt1 = 0;
    static int cnt2 = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        fib(n);
        fibo(n);
        System.out.println(cnt1 + " " + cnt2);

    }


    public static int fib(int n){
        if(n == 1 || n == 2){
            cnt1++;
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }

    }


    public static int fibo(int n){

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;

        for(int i=3; i<=n; i++){
            cnt2++;
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }


}
