import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

 static int n;
 static int cnt;
 static int[] arr;

 public static void main(String[] args) throws IOException{

  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  n = Integer.parseInt(br.readLine());

  arr = new int[n];

  dfs(0);

  System.out.println(cnt);

 }

 public static void dfs(int depth){

  if(depth == n){
   cnt++;
   return;
  }

  for(int i=0; i<n; i++){
   arr[depth] = i;

   if(isPossible(depth)){
    dfs(depth+1);
   }
  }

 }

 private static boolean isPossible(int col) {
   for(int i=0; i<col; i++){
    if(arr[i] == arr[col] || Math.abs(i-col) == Math.abs(arr[i] - arr[col])){
     return false;
    }
   }
    return true;
 }

}
