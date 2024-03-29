import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();

        for(int i=1; i<=n; i++){
            q.add(Integer.parseInt(st.nextToken()));
        }

        int start = 1;

        while (!q.isEmpty()) {
            if (q.peek() == start) {
                q.poll();
                start++;
            } else if (!s.isEmpty() && s.peek() == start){
                s.pop();
                start++;
            } else {
                s.push(q.poll());
            }
        }


        while (!s.isEmpty()){
            if(s.peek() == start){
                s.pop();
                start++;
            } else {
                System.out.println("Sad");
                break;
            }
        }

        if(s.isEmpty() && q.isEmpty()){
            System.out.println("Nice");
        }


    }
}