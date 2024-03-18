import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 
    static int cnt = 0; 
    
     public static void main(String[] args) throws IOException {
     
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(br.readLine());
         
         System.out.println(recur(n, 0));
     
     }
    
    static int recur(int n, int cnt){
     
        if(n<2){
            return cnt;
        }
        
        return Math.min(recur(n/2, cnt+1+(n%2)), recur(n/3, cnt+1+(n%3)));
        
    }
    
    
}