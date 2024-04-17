import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static char[] str1;
    static char[] str2;
    static Integer[][] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();

        str1 = s1.toCharArray(); //String 문자열을 char배열로 변환해준다.
        str2 = s2.toCharArray();

        dp = new Integer[str1.length][str2.length];

        System.out.println(Lcs(str1.length-1, str2.length-1));

    }

    public static int Lcs(int x, int y){
        if(x < 0 || y < 0){
            return 0;
        }

        if(dp[x][y] == null){
            if(str1[x] == str2[y]){
                dp[x][y] = Lcs(x-1, y-1) + 1;
            } else {
                dp[x][y] = Math.max(Lcs(x-1, y), Lcs(x, y-1));
            }
        }
        return dp[x][y];
    }
}